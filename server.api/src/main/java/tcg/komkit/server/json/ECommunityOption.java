package tcg.komkit.server.json;

public enum ECommunityOption {
	STRUCTURE_USER_CREATED,			//allow user to create a new structure
	STRUCTURE_GAMIFICATION,			//allow user to raise through the ranks by recruiting more users
	USERFIELD_VALIDATE_MANDATORY,	//all mandatory fields must be validated
	USERFIELD_BOSS_VALIDATION,		//boss can validate a user (otherwise, only community admin/boss can)
	SECURITY_REQUIRE_PASSWORD		//require a user password to be set
}
