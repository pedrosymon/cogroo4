/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Derived from Apache OpenNLP. Please keep the header. 
 */

package br.ccsl.cogroo.gc.cmdline.dictionary;

import java.io.File;

import opennlp.tools.cmdline.ArgumentParser.OptionalParameter;
import opennlp.tools.cmdline.ArgumentParser.ParameterDescription;
import opennlp.tools.cmdline.params.EncodingParameter;

/**
 * Params for Dictionary tools.
 * 
 * Note: Do not use this class, internal use only!
 */
interface POSDictionaryBuilderParams extends EncodingParameter {

  @ParameterDescription(valueName = "in", description = "Plain file with one entry per line")
  File getInputFile();

  @ParameterDescription(valueName = "corpus", description = "Corpus file to validate the tags")
  File getCorpus();

  @ParameterDescription(valueName = "out", description = "The dictionary file.")
  File getOutputFile();

  @ParameterDescription(valueName = "allowInvalidFeats", description = "If to allow invalid features.")
  @OptionalParameter(defaultValue = "false")
  Boolean getAllowInvalidFeats();

}
