package com.bc92.projectsdk.constants;

public final class DirectoryServiceConstants {

  public static final String PATH_DELIMINATOR = "/";

  /** Constant representing the REGEX expression for validating file paths and names */
  public static final String FILE_PATH_REGEX =
      "^" + PATH_DELIMINATOR + "[^\\\\#?$\"\'<>:;\\|\\*]*$";

  /** Constant representing the REGEX expression for validating a single path discriminator */
  public static final String DISCRIMINATOR_REGEX =
      "^[^\\" + PATH_DELIMINATOR + "\\\\#?$\"\'<>:;\\|\\*]*$";

  public static final String DIRECTORY_API_PATH = "/directory-service/directories";

  public static final String FOLDER_API_PATH = "/directory-service/folders";

  public static final String FILE_API_PATH = "/directory-service/files";

  public static final String ROOT_NODE_NAME = "root";

  public static final String ROOT_PARENT_PATH = "";

  private DirectoryServiceConstants() {}

}
