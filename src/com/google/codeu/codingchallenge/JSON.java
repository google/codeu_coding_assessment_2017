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

import java.io.IOException;
import java.util.Collection;

interface JSON {

  // GET OBJECT
  //
  // Get the value of the nested object with the given name. If there is
  // no nested object with that name, the method will return null.
  JSON getObject(String name);

  // SET OBJECT
  //
  // Set the value of the nested object with the given name. Any old value
  // should be overwritten. This method will always return a reference to
  // "this".
  JSON setObject(String name, JSON value);

  // GET STRING
  //
  // Get the string value within this object that has the given name. if
  // there is no string with the given name, the method will return null.
  String getString (String name);

  // SET STRING
  //
  // Set the string that should be stored under the given name. Any old value
  // should be overwritten. This method will always return a reference to
  // "this".
  JSON setString(String name, String value);

  // GET OBJECTS
  //
  // Copy the names of all object values to the given collection.
  void getObjects(Collection<String> names);

  // GET STRINGS
  //
  // Copy the names of all string values to the given collection.
  void getStrings(Collection<String> names);
}
