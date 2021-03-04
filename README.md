# multi-module-android-lib
A multi module android library which has some public interfaces and where can modules uses private and obfuscated methods from other modules

Each module is obfuscated separately, but are not optimized and dependent modules share the same `mapping.txt` file.

## Build

A task `:buildLib` has been added to the root `build.gradle` config file.
To build the library, run `./gradlew buildLib` in the root folder of the library.