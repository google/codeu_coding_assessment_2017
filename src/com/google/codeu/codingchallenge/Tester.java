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

import java.util.Map;
import java.util.HashMap;

final class Tester {

  private final Map<String, Test> tests = new HashMap<>();

  public void add(String name, Test test) {
    tests.put(name, test);
  }

  public void run(JSONFactory factory) {
    for (final Map.Entry<String, Test> test : tests.entrySet()) {
      try {
        test.getValue().run(factory);
        System.out.format("PASS : Test %s\n", test.getKey());
      } catch (Exception ex) {
        System.out.format("FAIL : Test %s (%s)\n", test.getKey(), ex.toString());
      }
    }
  }
}
