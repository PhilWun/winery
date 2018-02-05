/*******************************************************************************
 * Copyright (c) 2012-2017 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *******************************************************************************/
package org.eclipse.winery.repository.rest.resources._support;

import org.eclipse.winery.common.RepositoryFileReference;
import org.eclipse.winery.model.tosca.TDefinitions;

/**
 * Indicates that BackendUtils.persist() can te used
 */
public interface IPersistable {

	TDefinitions getDefinitions();

	RepositoryFileReference getRepositoryFileReference();
}
