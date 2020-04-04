package code44.release1;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 针对开闭原则，只需要偶尔的修改一下RuleConfigParserFactory
 * 即如果需要添加新解析的文件格式，只需要新加在cachedParsers中新增一个key、value
 */
public class RuleConfigParserFactory {
    private static final Map<String, IRuleConfigParser> cachedParsers =
            new HashMap<String, IRuleConfigParser>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (StringUtils.isBlank(configFormat)) {
            return null;
        }
        IRuleConfigParser parser = cachedParsers.get(configFormat);
        return parser;
    }
}
