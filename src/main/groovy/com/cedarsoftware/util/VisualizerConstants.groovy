package com.cedarsoftware.util

import groovy.transform.CompileStatic

/**
 * Provides constants for the visualizer
 */

@CompileStatic
public final class VisualizerConstants
{
	public static final String RPM_CLASS = 'rpm.class'
	public static final String RPM_ENUM = 'rpm.enum'
	public static final String RPM_CLASS_DOT = 'rpm.class.'
	public static final String RPM_SCOPE_CLASS_DOT = 'rpm.scope.class.'
	public static final String RPM_ENUM_DOT = 'rpm.enum.'
	public static final String CLASS_TRAITS = 'CLASS_TRAITS'
	public static final String DOT_CLASS_TRAITS = '.classTraits'
	public static final String DOT_TRAITS = '.traits'
	public static final String R_RPM_TYPE = 'r:rpmType'
	public static final String R_EXISTS = 'r:exists'
	public static final String V_ENUM = 'v:enum'
	public static final String R_SCOPED_NAME = 'r:scopedName'
	public static final String V_MIN = 'v:min'
	public static final String V_MAX = 'v:max'

	public static final String SOURCE_FIELD_NAME = 'sourceFieldName'
	public static final String AXIS_FIELD = 'field'
	public static final String AXIS_NAME = 'name'
	public static final String AXIS_TRAIT = 'trait'

	public static final String _ENUM = '_ENUM'
	public static final String UNSPECIFIED = 'UNSPECIFIED'
	public static final Map<String, String> ALL_GROUPS_MAP = [PRODUCT: 'Product', FORM: 'Form', RISK: 'Risk', COVERAGE: 'Coverage', CONTAINER: 'Container', DEDUCTIBLE: 'Deductible', LIMIT: 'Limit', RATE: 'Rate', RATEFACTOR: 'Rate Factor', PREMIUM: 'Premium', PARTY: 'Party', PLACE: 'Place', ROLE: 'Role', ROLEPLAYER: 'Role Player', UNSPECIFIED: 'Unspecified']
	public static final Set<String> ALL_GROUPS_KEYS = ALL_GROUPS_MAP.keySet()
	public static final String[] GROUPS_TO_SHOW_IN_TITLE = ['COVERAGE', 'DEDUCTIBLE', 'LIMIT', 'PREMIUM', 'PRODUCT', 'RATE', 'RATEFACTOR', 'RISK', 'ROLEPLAYER', 'ROLE']

	public static final String EFFECTIVE_VERSION = '_effectiveVersion'
	public static final String POLICY_CONTROL_DATE = 'policyControlDate'
	public static final String QUOTE_DATE = 'quoteDate'
	public static final String BUSINESS_DIVISION_CODE = 'businessDivisionCode'
	public static final String STATE = 'state'
	public static final String LOCATION_STATE = 'locationState'
	public static final Set<String> DERIVED_SCOPE_KEYS = ['product', 'risk', 'coverage', 'container', 'deductible', 'limit', 'rate', 'ratefactor', 'premium', 'party', 'place', 'role', 'roleplayer'] as Set
	public static final Set<String> DERIVED_SOURCE_SCOPE_KEYS = ['sourceRisk', 'sourceCoverage', 'sourceContainer', 'sourceDeductible', 'sourceLimit', 'sourceRate', 'sourceRatefactor', 'sourcePremium', 'sourceParty', 'sourcePlace', 'sourceRole', 'sourceRoleplayer'] as Set
	public static final String SOURCE_SCOPE_KEY_PREFIX = 'source'

	public static final String SYSTEM_SCOPE_KEY_PREFIX = "_"
	public static final String EFFECTIVE_VERSION_SCOPE_KEY = SYSTEM_SCOPE_KEY_PREFIX + "effectiveVersion"

	public static final Set<String> DEFAULT_OPTIONAL_SCOPE_KEYS = ['action', 'businessDivisionCode', 'context', 'date', 'edition', '_effectiveVersion', 'env', 'formId', 'LocationState', 'screen', 'state', 'transaction', 'transactionsubtype', 'username', 'view'] as Set
	public static final Set<String> DEFAULT_AVAILABLE_SCOPE_KEYS = DERIVED_SCOPE_KEYS + DERIVED_SOURCE_SCOPE_KEYS + DEFAULT_OPTIONAL_SCOPE_KEYS + [POLICY_CONTROL_DATE, QUOTE_DATE, EFFECTIVE_VERSION]
	public static final String DEFAULT_SCOPE_VALUE = '????'
	public static final long DEFAULT_LEVEL = 3

	public static final String ENT_APP = 'ENT.APP'
	public static final String BUSINESS_DIVISION_CUBE_NAME = 'ent.manual.BusinessDivision'
	public static final String STATE_CUBE_NAME = 'ent.manual.State'

	public static final String SPACE = '&nbsp;'
	public static final String INDENT = "${SPACE}${SPACE}${SPACE}"
	public static final String BREAK = '<br>'
	public static final String COMMA_SPACE = ', '
	public static final String DOUBLE_BREAK = "${BREAK}${BREAK}"

	public static final int NODE_LABEL_MAX_LINE_LENGTH = 16
	public static final double NODE_LABEL_LINE_LENGTH_MULTIPLIER = 1.2d

	public static final Set<String> MANDATORY_RPM_SCOPE_KEYS = [AXIS_FIELD, AXIS_NAME, AXIS_TRAIT] as Set
	public static final String MISSING_SCOPE = 'missing scope'
	public static final String UNABLE_TO_LOAD = 'unable to load'
	public static final String SCOPE_VALUE_NOT_FOUND = 'scope value not found'

	public static final String STATUS_MISSING_START_SCOPE = 'missingStartScope'
	public static final String STATUS_SUCCESS = 'success'
	public static final SafeSimpleDateFormat DATE_TIME_FORMAT = new SafeSimpleDateFormat('yyyy-MM-dd')
}