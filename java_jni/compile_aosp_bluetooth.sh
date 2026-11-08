#!/usr/bin/env bash
set -e

ANDROID_JAR="/data/data/com.termux/files/home/android-sdk/platforms/android-34/android.jar"
STUBS_DIR="/data/data/com.termux/files/home/aosp_bluetooth_stubs"
STUBS_BIN="/data/data/com.termux/files/home/aosp_bluetooth_stubs/bin"
SRC_DIR="/data/data/com.termux/files/home/aosp_bluetooth_src"
OUTPUT_DIR="/data/data/com.termux/files/home/aosp_bluetooth_compiled"

echo "Creating output directories..."
mkdir -p "$OUTPUT_DIR"
mkdir -p "$STUBS_BIN"

echo "Finding all stub Java source files..."
find "$STUBS_DIR" -name "*.java" > "$STUBS_BIN/stub_sources.txt"

echo "Compiling stubs against android.jar..."
javac -source 17 -target 17 -cp "$ANDROID_JAR" -d "$STUBS_BIN" @"$STUBS_BIN/stub_sources.txt"

echo "Finding all AOSP Bluetooth Java source files (excluding tests)..."
find "$SRC_DIR/framework/java" "$SRC_DIR/service/src" -name "*.java" > "$OUTPUT_DIR/source_files.txt"

TOTAL_FILES=$(wc -l < "$OUTPUT_DIR/source_files.txt")
echo "Found $TOTAL_FILES Java source files to compile."

echo "Compiling AOSP Bluetooth against stubs and android.jar..."
javac -source 17 -target 17 -Xmaxerrs 500 -cp "$STUBS_BIN:$ANDROID_JAR" -d "$OUTPUT_DIR" @"$OUTPUT_DIR/source_files.txt"

echo "Compilation successful! All compiled classes placed in $OUTPUT_DIR"
