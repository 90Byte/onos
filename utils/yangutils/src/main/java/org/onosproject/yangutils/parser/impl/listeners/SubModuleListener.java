/*
 * Copyright 2016 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.yangutils.parser.impl.listeners;

import org.onosproject.yangutils.parser.antlrgencode.GeneratedYangParser;
import org.onosproject.yangutils.parser.impl.TreeWalkListener;

/*
 * Reference: RFC6020 and YANG ANTLR Grammar
 *
 * ABNF grammar as per RFC6020
 * submodule-stmt      = optsep submodule-keyword sep identifier-arg-str
 *                             optsep
 *                             "{" stmtsep
 *                                 submodule-header-stmts
 *                                 linkage-stmts
 *                                 meta-stmts
 *                                 revision-stmts
 *                                 body-stmts
 *                             "}" optsep
 *
 * ANTLR grammar rule
 * submodule_stmt : SUBMODULE_KEYWORD IDENTIFIER LEFT_CURLY_BRACE submodule_body* RIGHT_CURLY_BRACE;
 * submodule_body : submodule_header_statement linkage_stmts meta_stmts revision_stmts body_stmts;
 */

/**
 * Implements listener based call back function corresponding to the "submodule"
 * rule defined in ANTLR grammar file for corresponding ABNF rule in RFC 6020.
 */
public final class SubModuleListener {

    /**
     * Creates a new sub module listener.
     */
    private SubModuleListener() {
    }

    /**
     * It is called when parser receives an input matching the grammar
     * rule (sub module), perform validations and update the data model
     * tree.
     *
     * @param listener Listener's object.
     * @param ctx context object of the grammar rule.
     */
    public static void processSubModuleEntry(TreeWalkListener listener,
                                             GeneratedYangParser.SubModuleStatementContext ctx) {
        // TODO method implementation
    }

    /**
     * It is called when parser exits from grammar rule (submodule), it perform
     * validations and update the data model tree.
     *
     * @param listener Listener's object.
     * @param ctx context object of the grammar rule.
     */
    public static void processSubModuleExit(TreeWalkListener listener,
                                            GeneratedYangParser.SubModuleStatementContext ctx) {
        // TODO method implementation
    }
}