package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.predictions.models.VoiceType;

/* loaded from: classes5.dex */
public enum AWSVoiceType implements VoiceType {
    ARABIC_ZEINA("Zeina", "arb"),
    MANDARIN_CHINESE_ZHIYU("Zhiyu", "cmn-CN"),
    DANISH_NAJA("Naja", "da-DK"),
    DANISH_MADS("Mads", "da-DK"),
    DUTCH_LOTTE("Lotte", "nl-NL"),
    DUTCH_RUBEN("Ruben", "nl-NL"),
    AUSTRALIAN_ENGLISH_NICOLE("Nicole", "en-AU"),
    AUSTRALIAN_ENGLISH_RUSSELL("Russell", "en-AU"),
    BRITISH_ENGLISH_AMY("Amy", "en-GB"),
    BRITISH_ENGLISH_EMMA("Emma", "en-GB"),
    BRITISH_ENGLISH_BRIAN("Brian", "en-GB"),
    INDIAN_ENGLISH_RAVEENA("Raveena", "en-IN"),
    INDIAN_ENGLISH_ADITI("Aditi", "en-IN"),
    US_ENGLISH_IVY("Ivy", "en-US"),
    US_ENGLISH_JOANNA("Joanna", "en-US"),
    US_ENGLISH_KENDRA("Kendra", "en-US"),
    US_ENGLISH_KIMBERLY("Kimberly", "en-US"),
    US_ENGLISH_SALLI("Salli", "en-US"),
    US_ENGLISH_JOEY("Joey", "en-US"),
    US_ENGLISH_JUSTIN("Justin", "en-US"),
    US_ENGLISH_MATTHEW("Matthew", "en-US"),
    WELSH_ENGLISH_GERAINT("Geraint", "en-GB-WLS"),
    FRENCH_CELINE("Celine", "fr-FR"),
    FRENCH_LEA("Lea", "fr-FR"),
    FRENCH_MATHIEU("Mathieu", "fr-FR"),
    CANADIAN_FRENCH_CHANTAL("Chantal", "fr-CA"),
    GERMAN_MARLENE("Marlene", "de-DE"),
    GERMAN_VICKI("Vicki", "de-DE"),
    GERMAN_HANS("Hans", "de-DE"),
    HINDI_ADITI("Aditi", "hi-IN"),
    ICELANDIC_DORA("Dora", "is-IS"),
    ICELANDIC_KARL("Karl", "is-IS"),
    ITALIAN_CARLA("Carla", "it-IT"),
    ITALIAN_BIANCA("Bianca", "it-IT"),
    ITALIAN_GIORGIO("Giorgio", "it-IT"),
    JAPANESE_MIZUKI("Mizuki", "ja-JP"),
    JAPANESE_TAKUMI("Takumi", "ja-JP"),
    KOREAN_SEOYEON("Seoyeon", "ko-KR"),
    NORWEGIAN_LIV("Liv", "nb-NO"),
    POLISH_EWA("Ewa", "pl-PL"),
    POLISH_MAJA("Maja", "pl-PL"),
    POLISH_JACEK("Jacek", "pl-PL"),
    POLISH_JAN("Jan", "pl-PL"),
    BRAZILIAN_PORTUGUESE_CAMILA("Camila", "pt-BR"),
    BRAZILIAN_PORTUGUESE_VITORIA("Vitoria", "pt-BR"),
    BRAZILIAN_PORTUGUESE_RICARDO("Ricardo", "pt-BR"),
    EUROPEAN_PORTUGUESE_INES("Ines", "pt-PT"),
    EUROPEAN_PORTUGUESE_CRISTIANO("Cristiano", "pt-PT"),
    ROMANIAN_CARMEN("Carmen", "ro-RO"),
    RUSSIAN_TATYANA("Tatyana", "ru-RU"),
    RUSSIAN_MAXIM("Maxim", "ru-RU"),
    EUROPEAN_SPANISH_CONCHITA("Conchita", "es-ES"),
    EUROPEAN_SPANISH_LUCIA("Lucia", "es-ES"),
    EUROPEAN_SPANISH_ENRIQUE("Enrique", "es-ES"),
    MEXICAN_SPANISH_MIA("Mia", "es-MX"),
    US_SPANISH_LUPE("Lupe", "es-US"),
    US_SPANISH_PENELOPE("Penelope", "es-US"),
    US_SPANISH_MIGUEL("Miguel", "es-US"),
    SWEDISH_ASTRID("Astrid", "sv-SE"),
    TURKISH_FILIZ("Filiz", "tr-TR"),
    WELSH_GWYNETH("Gwyneth", "cy-GB"),
    UNKNOWN("unknown", "unknown");

    private final String languageCode;
    private final String name;

    AWSVoiceType(String str, String str2) {
        this.name = str;
        this.languageCode = str2;
    }

    public static AWSVoiceType fromName(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (AWSVoiceType aWSVoiceType : values()) {
            if (aWSVoiceType.getName().equals(str)) {
                return aWSVoiceType;
            }
        }
        return UNKNOWN;
    }

    public static AWSVoiceType fromVoice(VoiceType voiceType) {
        return voiceType == null ? UNKNOWN : voiceType instanceof AWSVoiceType ? (AWSVoiceType) voiceType : fromName(voiceType.getName());
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    @Override // com.amplifyframework.predictions.models.VoiceType
    public String getName() {
        return this.name;
    }
}
