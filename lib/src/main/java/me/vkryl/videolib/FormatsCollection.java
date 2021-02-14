/*
 * This file is a part of VideoLibrary Interface
 * Copyright © Vyacheslav Krylov (slavone@protonmail.ch) 2021
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.vkryl.videolib;

import java.util.List;

/**
 * Collection of the formats supported by the library.
 */
public class FormatsCollection {
  /**
   * List of supported video codecs.
   */
  public List<CodecFormat> videoCodecs;

  /**
   * List of supported audio codecs.
   */
  public List<CodecFormat> audioCodecs;

  /**
   * List of supported video containers.
   */
  public List<Format> containers;
}
