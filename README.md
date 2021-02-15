# VideoLibrary Interface

High-level abstract Java interface for building video libraries.

For API documentation refer to javadoc inside [VideoLibrary.java](lib/src/main/java/me/vkryl/videolib/VideoLibrary.java).

## TODOs

- Serializing [OutputVideoConfiguration](lib/src/main/java/me/vkryl/videolib/OutputVideoConfiguration.java) and serializing back from it, for persistence.
- Merge VideoLibrary's `convertVideo`, `generateVideoFromImage`, `generateVideoFromGif` into one method? Or add two more estimation methods, like `estimateOutputVideoSize`.

## Licence

`LevelDB Preferences` is licensed under the terms of the Apache License, Version 2.0. See [LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0) for more information.
