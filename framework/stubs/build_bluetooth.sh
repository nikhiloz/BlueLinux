#!/usr/bin/env bash
set -e

STUBS_DIR="/data/data/com.termux/files/home/aosp_bluetooth_stubs"
BUILD_DIR="/data/data/com.termux/files/home/aosp_bluetooth_stubs/bin"

echo "Creating build directory..."
mkdir -p "$BUILD_DIR"

echo "Finding all stub Java files..."
find "$STUBS_DIR" -name "*.java" > "$BUILD_DIR/sources.txt"

echo "Compiling stubs with javac (Java 17)..."
javac -d "$BUILD_DIR" @"$BUILD_DIR/sources.txt"

echo "Stubs compiled successfully into $BUILD_DIR!"
echo "To compile your AOSP Bluetooth code against these stubs, run:"
echo "  javac -cp $BUILD_DIR -d /path/to/output /path/to/bluetooth/src/**/*.java"
