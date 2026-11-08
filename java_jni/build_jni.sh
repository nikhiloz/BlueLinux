#!/usr/bin/env bash
set -e

JAVA_INCLUDE="/data/data/com.termux/files/usr/lib/jvm/java-21-openjdk/include"
BLUELINUX_DIR=".."
OUTPUT_DIR="build"

mkdir -p "$OUTPUT_DIR"

echo "Compiling minimal custom JNI library inside BlueLinux..."
g++ -std=c++20 -fPIC -shared -O2 \
    -I"$JAVA_INCLUDE" -I"$JAVA_INCLUDE/linux" \
    -I"$BLUELINUX_DIR/include" \
    -I"$BLUELINUX_DIR/bta/include" \
    -I"$BLUELINUX_DIR/stack/include" \
    minimal_bt_jni.cpp -o "$OUTPUT_DIR/libbluetooth_jni.so" \
    "$BLUELINUX_DIR/stack/libbt-brcm_stack.a" \
    "$BLUELINUX_DIR/bta/libbt-brcm_bta.a" \
    "$BLUELINUX_DIR/gki/libbt-brcm_gki.a" \
    "$BLUELINUX_DIR/utils/libbt-utils.a" \
    -llog -lpthread -ldl

echo "Successfully built libbluetooth_jni.so at BlueLinux/java_jni/build/libbluetooth_jni.so"
