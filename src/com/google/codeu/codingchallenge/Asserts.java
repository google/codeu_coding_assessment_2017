// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.codingchallenge;

import java.util.Collection;
import java.util.HashSet;

final class Asserts {

  public static final class AssertException extends RuntimeException {
    public AssertException(String message) {
      super(message);
    }
  }

  public static void isTrue(boolean value, String message) {
    if (!value) {
      throw new AssertException(message);
    }
  }

  public static void isNotNull(Object o) {
    if (o == null) {
      throw new AssertException("Unexpected null value");
    }
  }

  public static void isEqual(Object a, Object b) {
    if (a == b) {
      // all is good
    } else if (a == null ^ b == null) {
      throw new AssertException(String.format("%s does not equal %s", a, b));
    } else if (a.equals(b) && b.equals(a)) {
      // all is good
    } else {
      throw new AssertException(String.format("%s does not equal %s", a, b));
    }
  }
}
