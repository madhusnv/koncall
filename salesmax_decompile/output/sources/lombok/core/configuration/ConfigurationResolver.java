package lombok.core.configuration;

/* loaded from: salesmax.apk:lombok/core/configuration/ConfigurationResolver.SCL.lombok */
public interface ConfigurationResolver {
    <T> T resolve(ConfigurationKey<T> configurationKey);
}
