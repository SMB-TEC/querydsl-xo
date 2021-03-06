package com.smbtec.xo.querydsl.apt;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 *
 * @author Lars Martin - lars.martin@smb-tec.com
 *
 */
public class XOAnnotationProcessorTest extends AbstractProcessorTest {

    private static final String PACKAGE_PATH = "src/test/java/com/smbtec/xo/querydsl/domain/";

    private static final String NEO4J = "neo4j";

    private static final String TINKERPOP = "tinkerpop";

    private static final List<String> CLASSES = getFiles(PACKAGE_PATH);

    @Test
    public void processNeo4jAnnotations() throws IOException {
        File file = new File(PACKAGE_PATH + NEO4J, "Person.java");
        process(XONeo4jAnnotationProcessor.class, Collections.singletonList(file.getPath()), NEO4J);
    }

    @Test
    public void processNeo4jAnnotations2() throws IOException {
        File file = new File(PACKAGE_PATH + NEO4J, "Group.java");
        process(XONeo4jAnnotationProcessor.class, Collections.singletonList(file.getPath()), NEO4J);
    }

    @Test
    public void processTinkerPopAnnotations() throws IOException {
        File file = new File(PACKAGE_PATH + TINKERPOP, "Person.java");
        process(XOTinkerPopAnnotationProcessor.class, Collections.singletonList(file.getPath()), TINKERPOP);
    }
}
