/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.developerstudio.eclipse.esb.mediators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Command Property Message Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.wso2.developerstudio.eclipse.esb.mediators.MediatorsPackage#getCommandPropertyMessageAction()
 * @model
 * @generated
 */
public enum CommandPropertyMessageAction implements Enumerator {
	/**
	 * The '<em><b>READ MESSAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_MESSAGE(0, "READ_MESSAGE", "ReadMessage"),

	/**
	 * The '<em><b>UPDATE MESSAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_MESSAGE(1, "UPDATE_MESSAGE", "UpdateMessage"),

	/**
	 * The '<em><b>READ AND UPDATE MESSAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_AND_UPDATE_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_AND_UPDATE_MESSAGE(2, "READ_AND_UPDATE_MESSAGE", "ReadAndUpdateMessage");

	/**
	 * The '<em><b>READ MESSAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READ MESSAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_MESSAGE
	 * @model literal="ReadMessage"
	 * @generated
	 * @ordered
	 */
	public static final int READ_MESSAGE_VALUE = 0;

	/**
	 * The '<em><b>UPDATE MESSAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPDATE MESSAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE_MESSAGE
	 * @model literal="UpdateMessage"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_MESSAGE_VALUE = 1;

	/**
	 * The '<em><b>READ AND UPDATE MESSAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READ AND UPDATE MESSAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_AND_UPDATE_MESSAGE
	 * @model literal="ReadAndUpdateMessage"
	 * @generated
	 * @ordered
	 */
	public static final int READ_AND_UPDATE_MESSAGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Command Property Message Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CommandPropertyMessageAction[] VALUES_ARRAY =
		new CommandPropertyMessageAction[] {
			READ_MESSAGE,
			UPDATE_MESSAGE,
			READ_AND_UPDATE_MESSAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Command Property Message Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CommandPropertyMessageAction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Command Property Message Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandPropertyMessageAction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommandPropertyMessageAction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Command Property Message Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandPropertyMessageAction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommandPropertyMessageAction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Command Property Message Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandPropertyMessageAction get(int value) {
		switch (value) {
			case READ_MESSAGE_VALUE: return READ_MESSAGE;
			case UPDATE_MESSAGE_VALUE: return UPDATE_MESSAGE;
			case READ_AND_UPDATE_MESSAGE_VALUE: return READ_AND_UPDATE_MESSAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CommandPropertyMessageAction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public String toString() {
		return literal;
	}
	
} //CommandPropertyMessageAction
