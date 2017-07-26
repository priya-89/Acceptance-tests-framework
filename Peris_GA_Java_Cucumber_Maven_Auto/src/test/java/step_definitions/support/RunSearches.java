package step_definitions.support;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features    = {"src/test/resources/features"},
        glue        = {"step_definitions"},
        plugin      = {"progress", "html:target/cucumber"},
        snippets    = SnippetType.CAMELCASE,
        monochrome  = true,
        tags        = {"@searches"}
)

public class RunSearches {
}