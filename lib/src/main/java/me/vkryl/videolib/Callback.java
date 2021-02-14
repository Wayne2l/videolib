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

/**
 * Generic interface for asynchronous requests.
 *
 * @param <T> type of the data to be provided via {@link #onResult(T)}
 * @param <K> type of the error exception that might be received via {@link #onError(K)}
 */
public interface Callback<T, K extends Throwable> {
  /**
   * Called when asynchronous data request has been successfully executed.
   *
   * @param data Request result
   */
  void onResult (T data);

  /**
   * Called whenever error happens during asynchronous data request.
   *
   * @param error Occurred error
   */
  default void onError (K error) {
    if (error instanceof RuntimeException) {
      throw (RuntimeException) error;
    } else {
      throw new RuntimeException(error);
    }
  }
}
