package com.amplifyframework.predictions.aws;

import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.configuration.IdentifyEntitiesConfiguration;
import com.amplifyframework.predictions.aws.configuration.IdentifyLabelsConfiguration;
import com.amplifyframework.predictions.aws.configuration.IdentifyTextConfiguration;
import com.amplifyframework.predictions.aws.configuration.InterpretTextConfiguration;
import com.amplifyframework.predictions.aws.configuration.SpeechGeneratorConfiguration;
import com.amplifyframework.predictions.aws.configuration.TranslateTextConfiguration;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AWSPredictionsPluginConfiguration {
    private final NetworkPolicy defaultNetworkPolicy = NetworkPolicy.AUTO;
    private final String defaultRegion;
    private final IdentifyEntitiesConfiguration identifyEntitiesConfiguration;
    private final IdentifyLabelsConfiguration identifyLabelsConfiguration;
    private final IdentifyTextConfiguration identifyTextConfiguration;
    private final InterpretTextConfiguration interpretTextConfiguration;
    private final SpeechGeneratorConfiguration speechGeneratorConfiguration;
    private final TranslateTextConfiguration translateTextConfiguration;

    public enum ConfigKey {
        DEFAULT_REGION("defaultRegion"),
        CONVERT("convert"),
        IDENTIFY("identify"),
        INTERPRET("interpret");

        private final String key;

        ConfigKey(String str) {
            this.key = str;
        }

        public String key() {
            return this.key;
        }
    }

    private AWSPredictionsPluginConfiguration(String str, SpeechGeneratorConfiguration speechGeneratorConfiguration, TranslateTextConfiguration translateTextConfiguration, IdentifyLabelsConfiguration identifyLabelsConfiguration, IdentifyEntitiesConfiguration identifyEntitiesConfiguration, IdentifyTextConfiguration identifyTextConfiguration, InterpretTextConfiguration interpretTextConfiguration) {
        this.defaultRegion = str;
        this.speechGeneratorConfiguration = speechGeneratorConfiguration;
        this.translateTextConfiguration = translateTextConfiguration;
        this.identifyLabelsConfiguration = identifyLabelsConfiguration;
        this.identifyEntitiesConfiguration = identifyEntitiesConfiguration;
        this.identifyTextConfiguration = identifyTextConfiguration;
        this.interpretTextConfiguration = interpretTextConfiguration;
    }

    public static AWSPredictionsPluginConfiguration fromJson(JSONObject jSONObject) throws JSONException, PredictionsException {
        SpeechGeneratorConfiguration speechGeneratorConfiguration;
        TranslateTextConfiguration translateTextConfigurationFromJson;
        IdentifyLabelsConfiguration identifyLabelsConfigurationFromJson;
        IdentifyEntitiesConfiguration identifyEntitiesConfigurationFromJson;
        IdentifyTextConfiguration identifyTextConfigurationFromJson;
        if (jSONObject == null) {
            throw new PredictionsException("Could not locate predictions configuration for AWS Predictions Plugin.", "Verify that amplifyconfiguration.json contains a section for \"awsPredictionsPlugin\".");
        }
        try {
            String string = jSONObject.getString(ConfigKey.DEFAULT_REGION.key());
            ConfigKey configKey = ConfigKey.CONVERT;
            if (jSONObject.has(configKey.key())) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(configKey.key());
                SpeechGeneratorConfiguration speechGeneratorConfigurationFromJson = SpeechGeneratorConfiguration.fromJson(jSONObject2);
                translateTextConfigurationFromJson = TranslateTextConfiguration.fromJson(jSONObject2);
                speechGeneratorConfiguration = speechGeneratorConfigurationFromJson;
            } else {
                speechGeneratorConfiguration = null;
                translateTextConfigurationFromJson = null;
            }
            ConfigKey configKey2 = ConfigKey.IDENTIFY;
            if (jSONObject.has(configKey2.key())) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(configKey2.key());
                identifyLabelsConfigurationFromJson = IdentifyLabelsConfiguration.fromJson(jSONObject3);
                identifyEntitiesConfigurationFromJson = IdentifyEntitiesConfiguration.fromJson(jSONObject3);
                identifyTextConfigurationFromJson = IdentifyTextConfiguration.fromJson(jSONObject3);
            } else {
                identifyLabelsConfigurationFromJson = null;
                identifyEntitiesConfigurationFromJson = null;
                identifyTextConfigurationFromJson = null;
            }
            ConfigKey configKey3 = ConfigKey.INTERPRET;
            return new AWSPredictionsPluginConfiguration(string, speechGeneratorConfiguration, translateTextConfigurationFromJson, identifyLabelsConfigurationFromJson, identifyEntitiesConfigurationFromJson, identifyTextConfigurationFromJson, jSONObject.has(configKey3.key()) ? InterpretTextConfiguration.fromJson(jSONObject.getJSONObject(configKey3.key())) : null);
        } catch (IllegalArgumentException | JSONException e) {
            throw new PredictionsException("Issue encountered while parsing configuration JSON", e, "Check the attached exception for more details.");
        }
    }

    public NetworkPolicy getDefaultNetworkPolicy() {
        return this.defaultNetworkPolicy;
    }

    public String getDefaultRegion() {
        return this.defaultRegion;
    }

    public IdentifyEntitiesConfiguration getIdentifyEntitiesConfiguration() throws PredictionsException {
        IdentifyEntitiesConfiguration identifyEntitiesConfiguration = this.identifyEntitiesConfiguration;
        if (identifyEntitiesConfiguration != null) {
            return identifyEntitiesConfiguration;
        }
        throw new PredictionsException("Entities detection is not configured.", "Verify that identifyEntities is configured under " + ConfigKey.IDENTIFY.key());
    }

    public IdentifyLabelsConfiguration getIdentifyLabelsConfiguration() throws PredictionsException {
        IdentifyLabelsConfiguration identifyLabelsConfiguration = this.identifyLabelsConfiguration;
        if (identifyLabelsConfiguration != null) {
            return identifyLabelsConfiguration;
        }
        throw new PredictionsException("Labels detection is not configured.", "Verify that identifyLabels is configured under " + ConfigKey.IDENTIFY.key());
    }

    public IdentifyTextConfiguration getIdentifyTextConfiguration() throws PredictionsException {
        IdentifyTextConfiguration identifyTextConfiguration = this.identifyTextConfiguration;
        if (identifyTextConfiguration != null) {
            return identifyTextConfiguration;
        }
        throw new PredictionsException("Text detection is not configured.", "Verify that identifyText is configured under " + ConfigKey.IDENTIFY.key());
    }

    public InterpretTextConfiguration getInterpretTextConfiguration() throws PredictionsException {
        InterpretTextConfiguration interpretTextConfiguration = this.interpretTextConfiguration;
        if (interpretTextConfiguration != null) {
            return interpretTextConfiguration;
        }
        throw new PredictionsException("Text interpretation is not configured.", "Verify that interpretText is configured under " + ConfigKey.INTERPRET.key());
    }

    public SpeechGeneratorConfiguration getSpeechGeneratorConfiguration() throws PredictionsException {
        SpeechGeneratorConfiguration speechGeneratorConfiguration = this.speechGeneratorConfiguration;
        if (speechGeneratorConfiguration != null) {
            return speechGeneratorConfiguration;
        }
        throw new PredictionsException("Speech generation is not configured.", "Verify that speechGenerator is configured under " + ConfigKey.CONVERT.key());
    }

    public TranslateTextConfiguration getTranslateTextConfiguration() throws PredictionsException {
        TranslateTextConfiguration translateTextConfiguration = this.translateTextConfiguration;
        if (translateTextConfiguration != null) {
            return translateTextConfiguration;
        }
        throw new PredictionsException("Text translation is not configured.", "Verify that translateText is configured under " + ConfigKey.CONVERT.key());
    }
}
