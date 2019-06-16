package com.suixingpay.jooq.generator;

import org.apache.commons.lang.StringUtils;
import org.jooq.codegen.GenerationTool;
import org.jooq.codegen.JavaGenerator;
import org.jooq.meta.jaxb.Configuration;
import org.jooq.meta.jaxb.Database;
import org.jooq.meta.jaxb.Generate;
import org.jooq.meta.jaxb.Generator;
import org.jooq.meta.jaxb.Jdbc;
import org.jooq.meta.jaxb.Target;

public class JOOQGenerator extends JavaGenerator {


    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "111";

    private static final String JOOQ_DATABASE_NAME = "org.jooq.meta.jdbc.JDBCDatabase";

    private static final String GENERATOR_PATH = "test-core/src/main/java";

    public static void genTables(String schemaName, String packageName, String includes, String excludes) throws Exception {

        Jdbc jdbc = createJdbc();
        Generator generator = createGenerator(schemaName, packageName, includes, excludes);

        Configuration configuration = new Configuration()
                .withJdbc(jdbc)
                .withGenerator(generator);

        GenerationTool.generate(configuration);

    }

    private static Generator createGenerator(String schemaName, String packageName, String includes, String excludes) {

        Database database = createDatabase(schemaName, includes, excludes);
        Target target = createTarget(packageName);
        Generate generate = createGenerate();

        return new Generator()
                .withDatabase(database)
                .withTarget(target)
                .withGenerate(generate);
    }

    private static Jdbc createJdbc() {
        return new Jdbc()
                .withDriver(JDBC_DRIVER)
                .withUrl(JDBC_URL)
                .withUser(JDBC_USERNAME)
                .withPassword(JDBC_PASSWORD);
    }

    private static Target createTarget(String packageName) {

        return new Target().withDirectory(GENERATOR_PATH).withPackageName(packageName);
    }

    private static Database createDatabase(String schemaName, String includes, String excludes) {
        Database database = new Database().withName(JOOQ_DATABASE_NAME).withInputSchema(schemaName);
        if (StringUtils.isNotBlank(includes)) {
            database.withIncludes(includes);
        }

        if (StringUtils.isNotBlank(excludes)) {
            database.withExcludes(excludes);
        }
        return database;
    }

    private static Generate createGenerate() {
        Generate generate = new Generate();
        generate.withDaos(false)
                .withPojos(true);
        return generate;
    }

    private static void generate() throws Exception {
        genTables("jooq_test", "com.suixingpay.jooq.entity", ".*", "");
    }

    public static void main(String[] args) throws Exception {
        generate();
    }

}
