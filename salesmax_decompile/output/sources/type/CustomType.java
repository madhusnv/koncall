package type;

import com.apollographql.apollo.api.ScalarType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public abstract class CustomType implements ScalarType {
    public static final CustomType AWSEMAIL = new C188961("AWSEMAIL", 0);
    public static final CustomType AWSPHONE = new C188972("AWSPHONE", 1);
    public static final CustomType AWSDATETIME = new C188983("AWSDATETIME", 2);
    public static final CustomType AWSJSON = new C188994("AWSJSON", 3);
    public static final CustomType AWSURL = new C189005("AWSURL", 4);
    public static final CustomType AWSTIME = new C189016("AWSTIME", 5);
    public static final CustomType AWSTIMESTAMP = new C189027("AWSTIMESTAMP", 6);
    public static final CustomType AWSDATE = new C189038("AWSDATE", 7);
    public static final CustomType ID = new C189049("ID", 8);
    public static final CustomType AWSIPADDRESS = new AnonymousClass10("AWSIPADDRESS", 9);
    private static final /* synthetic */ CustomType[] $VALUES = $values();

    /* renamed from: type.CustomType$1 */
    public enum C188961 extends CustomType {
        @Override // com.apollographql.apollo.api.ScalarType
        public Class javaType() {
            return String.class;
        }

        @Override // com.apollographql.apollo.api.ScalarType
        public String typeName() {
            return "AWSEmail";
        }

        private C188961(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: type.CustomType$10, reason: invalid class name */
    public enum AnonymousClass10 extends CustomType {
        @Override // com.apollographql.apollo.api.ScalarType
        public Class javaType() {
            return String.class;
        }

        @Override // com.apollographql.apollo.api.ScalarType
        public String typeName() {
            return "AWSIPAddress";
        }

        private AnonymousClass10(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: type.CustomType$2 */
    public enum C188972 extends CustomType {
        @Override // com.apollographql.apollo.api.ScalarType
        public Class javaType() {
            return String.class;
        }

        @Override // com.apollographql.apollo.api.ScalarType
        public String typeName() {
            return "AWSPhone";
        }

        private C188972(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: type.CustomType$3 */
    public enum C188983 extends CustomType {
        @Override // com.apollographql.apollo.api.ScalarType
        public Class javaType() {
            return String.class;
        }

        @Override // com.apollographql.apollo.api.ScalarType
        public String typeName() {
            return "AWSDateTime";
        }

        private C188983(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: type.CustomType$4 */
    public enum C188994 extends CustomType {
        @Override // com.apollographql.apollo.api.ScalarType
        public Class javaType() {
            return String.class;
        }

        @Override // com.apollographql.apollo.api.ScalarType
        public String typeName() {
            return "AWSJSON";
        }

        private C188994(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: type.CustomType$5 */
    public enum C189005 extends CustomType {
        @Override // com.apollographql.apollo.api.ScalarType
        public Class javaType() {
            return String.class;
        }

        @Override // com.apollographql.apollo.api.ScalarType
        public String typeName() {
            return "AWSURL";
        }

        private C189005(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: type.CustomType$6 */
    public enum C189016 extends CustomType {
        @Override // com.apollographql.apollo.api.ScalarType
        public Class javaType() {
            return String.class;
        }

        @Override // com.apollographql.apollo.api.ScalarType
        public String typeName() {
            return "AWSTime";
        }

        private C189016(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: type.CustomType$7 */
    public enum C189027 extends CustomType {
        @Override // com.apollographql.apollo.api.ScalarType
        public Class javaType() {
            return Long.class;
        }

        @Override // com.apollographql.apollo.api.ScalarType
        public String typeName() {
            return "AWSTimestamp";
        }

        private C189027(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: type.CustomType$8 */
    public enum C189038 extends CustomType {
        @Override // com.apollographql.apollo.api.ScalarType
        public Class javaType() {
            return String.class;
        }

        @Override // com.apollographql.apollo.api.ScalarType
        public String typeName() {
            return "AWSDate";
        }

        private C189038(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: type.CustomType$9 */
    public enum C189049 extends CustomType {
        @Override // com.apollographql.apollo.api.ScalarType
        public Class javaType() {
            return String.class;
        }

        @Override // com.apollographql.apollo.api.ScalarType
        public String typeName() {
            return "ID";
        }

        private C189049(String str, int i) {
            super(str, i);
        }
    }

    private static /* synthetic */ CustomType[] $values() {
        return new CustomType[]{AWSEMAIL, AWSPHONE, AWSDATETIME, AWSJSON, AWSURL, AWSTIME, AWSTIMESTAMP, AWSDATE, ID, AWSIPADDRESS};
    }

    public static CustomType valueOf(String str) {
        return (CustomType) Enum.valueOf(CustomType.class, str);
    }

    public static CustomType[] values() {
        return (CustomType[]) $VALUES.clone();
    }

    private CustomType(String str, int i) {
    }
}
