cmake_minimum_required(VERSION 3.5)

set(CMAKE_BUILD_TYPE Debug)
project(BLUEDROID_FOR_LINUX)
add_definitions("-DHAS_BDROID_BUILDCFG -DLINUX_NATIVE -DANDROID_USE_LOGCAT=TRUE -D_GNU_SOURCE -include unistd.h -include stdlib.h -include stdio.h -include sys/prctl.h -include strings.h")

add_subdirectory(system/bta)
add_subdirectory(system/gki)
add_subdirectory(system/hci)
add_subdirectory(system/main)
add_subdirectory(system/stack)
add_subdirectory(system/test/bluedroidtest)
add_subdirectory(system/utils)
