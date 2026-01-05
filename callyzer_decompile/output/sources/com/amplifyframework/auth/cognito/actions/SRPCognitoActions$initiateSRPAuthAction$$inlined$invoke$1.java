package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SRPEvent.EventType.InitiateSRP $event$inlined;

    /* renamed from: id, reason: collision with root package name */
    private final String f43748id;

    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1", m15344f = "SRPCognitoActions.kt", m15345l = {80, 81, 89, 99, 121, 130}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1$1 */
    public static final class C10961 extends AbstractC8193c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C10961(InterfaceC7559c interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1(String str, SRPEvent.EventType.InitiateSRP initiateSRP) {
        this.$event$inlined = initiateSRP;
        this.f43748id = str == null ? super.getId() : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0397 A[Catch: Exception -> 0x039b, TryCatch #3 {Exception -> 0x039b, blocks: (B:154:0x04a2, B:156:0x04a9, B:159:0x04af, B:162:0x04b6, B:164:0x04bb, B:106:0x0390, B:108:0x0397, B:113:0x03a1, B:116:0x03a8, B:118:0x03ad), top: B:180:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a1 A[Catch: Exception -> 0x039b, TryCatch #3 {Exception -> 0x039b, blocks: (B:154:0x04a2, B:156:0x04a9, B:159:0x04af, B:162:0x04b6, B:164:0x04bb, B:106:0x0390, B:108:0x0397, B:113:0x03a1, B:116:0x03a8, B:118:0x03ad), top: B:180:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03a8 A[Catch: Exception -> 0x039b, TryCatch #3 {Exception -> 0x039b, blocks: (B:154:0x04a2, B:156:0x04a9, B:159:0x04af, B:162:0x04b6, B:164:0x04bb, B:106:0x0390, B:108:0x0397, B:113:0x03a1, B:116:0x03a8, B:118:0x03ad), top: B:180:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b9 A[Catch: Exception -> 0x028f, TRY_ENTER, TryCatch #1 {Exception -> 0x028f, blocks: (B:137:0x0446, B:139:0x0450, B:141:0x045a, B:143:0x045e, B:146:0x0468, B:148:0x046c, B:150:0x0474, B:89:0x0333, B:91:0x033d, B:93:0x0347, B:95:0x034b, B:98:0x0355, B:100:0x0359, B:102:0x0361, B:64:0x0281, B:66:0x0285, B:69:0x0293, B:71:0x029f, B:76:0x02a9, B:78:0x02ba, B:80:0x02c9, B:81:0x02cf, B:83:0x02ed, B:85:0x02f7, B:86:0x02ff, B:120:0x03b9, B:122:0x03c3, B:123:0x03c8, B:125:0x03d2, B:127:0x03ed, B:129:0x03f3, B:131:0x0401, B:133:0x040b, B:134:0x0413), top: B:177:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x045a A[Catch: Exception -> 0x028f, TryCatch #1 {Exception -> 0x028f, blocks: (B:137:0x0446, B:139:0x0450, B:141:0x045a, B:143:0x045e, B:146:0x0468, B:148:0x046c, B:150:0x0474, B:89:0x0333, B:91:0x033d, B:93:0x0347, B:95:0x034b, B:98:0x0355, B:100:0x0359, B:102:0x0361, B:64:0x0281, B:66:0x0285, B:69:0x0293, B:71:0x029f, B:76:0x02a9, B:78:0x02ba, B:80:0x02c9, B:81:0x02cf, B:83:0x02ed, B:85:0x02f7, B:86:0x02ff, B:120:0x03b9, B:122:0x03c3, B:123:0x03c8, B:125:0x03d2, B:127:0x03ed, B:129:0x03f3, B:131:0x0401, B:133:0x040b, B:134:0x0413), top: B:177:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04a9 A[Catch: Exception -> 0x039b, TryCatch #3 {Exception -> 0x039b, blocks: (B:154:0x04a2, B:156:0x04a9, B:159:0x04af, B:162:0x04b6, B:164:0x04bb, B:106:0x0390, B:108:0x0397, B:113:0x03a1, B:116:0x03a8, B:118:0x03ad), top: B:180:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04af A[Catch: Exception -> 0x039b, TryCatch #3 {Exception -> 0x039b, blocks: (B:154:0x04a2, B:156:0x04a9, B:159:0x04af, B:162:0x04b6, B:164:0x04bb, B:106:0x0390, B:108:0x0397, B:113:0x03a1, B:116:0x03a8, B:118:0x03ad), top: B:180:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04b6 A[Catch: Exception -> 0x039b, TryCatch #3 {Exception -> 0x039b, blocks: (B:154:0x04a2, B:156:0x04a9, B:159:0x04af, B:162:0x04b6, B:164:0x04bb, B:106:0x0390, B:108:0x0397, B:113:0x03a1, B:116:0x03a8, B:118:0x03ad), top: B:180:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0285 A[Catch: Exception -> 0x028f, TryCatch #1 {Exception -> 0x028f, blocks: (B:137:0x0446, B:139:0x0450, B:141:0x045a, B:143:0x045e, B:146:0x0468, B:148:0x046c, B:150:0x0474, B:89:0x0333, B:91:0x033d, B:93:0x0347, B:95:0x034b, B:98:0x0355, B:100:0x0359, B:102:0x0361, B:64:0x0281, B:66:0x0285, B:69:0x0293, B:71:0x029f, B:76:0x02a9, B:78:0x02ba, B:80:0x02c9, B:81:0x02cf, B:83:0x02ed, B:85:0x02f7, B:86:0x02ff, B:120:0x03b9, B:122:0x03c3, B:123:0x03c8, B:125:0x03d2, B:127:0x03ed, B:129:0x03f3, B:131:0x0401, B:133:0x040b, B:134:0x0413), top: B:177:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x029f A[Catch: Exception -> 0x028f, TRY_LEAVE, TryCatch #1 {Exception -> 0x028f, blocks: (B:137:0x0446, B:139:0x0450, B:141:0x045a, B:143:0x045e, B:146:0x0468, B:148:0x046c, B:150:0x0474, B:89:0x0333, B:91:0x033d, B:93:0x0347, B:95:0x034b, B:98:0x0355, B:100:0x0359, B:102:0x0361, B:64:0x0281, B:66:0x0285, B:69:0x0293, B:71:0x029f, B:76:0x02a9, B:78:0x02ba, B:80:0x02c9, B:81:0x02cf, B:83:0x02ed, B:85:0x02f7, B:86:0x02ff, B:120:0x03b9, B:122:0x03c3, B:123:0x03c8, B:125:0x03d2, B:127:0x03ed, B:129:0x03f3, B:131:0x0401, B:133:0x040b, B:134:0x0413), top: B:177:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a9 A[Catch: Exception -> 0x028f, TRY_ENTER, TryCatch #1 {Exception -> 0x028f, blocks: (B:137:0x0446, B:139:0x0450, B:141:0x045a, B:143:0x045e, B:146:0x0468, B:148:0x046c, B:150:0x0474, B:89:0x0333, B:91:0x033d, B:93:0x0347, B:95:0x034b, B:98:0x0355, B:100:0x0359, B:102:0x0361, B:64:0x0281, B:66:0x0285, B:69:0x0293, B:71:0x029f, B:76:0x02a9, B:78:0x02ba, B:80:0x02c9, B:81:0x02cf, B:83:0x02ed, B:85:0x02f7, B:86:0x02ff, B:120:0x03b9, B:122:0x03c3, B:123:0x03c8, B:125:0x03d2, B:127:0x03ed, B:129:0x03f3, B:131:0x0401, B:133:0x040b, B:134:0x0413), top: B:177:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0347 A[Catch: Exception -> 0x028f, TryCatch #1 {Exception -> 0x028f, blocks: (B:137:0x0446, B:139:0x0450, B:141:0x045a, B:143:0x045e, B:146:0x0468, B:148:0x046c, B:150:0x0474, B:89:0x0333, B:91:0x033d, B:93:0x0347, B:95:0x034b, B:98:0x0355, B:100:0x0359, B:102:0x0361, B:64:0x0281, B:66:0x0285, B:69:0x0293, B:71:0x029f, B:76:0x02a9, B:78:0x02ba, B:80:0x02c9, B:81:0x02cf, B:83:0x02ed, B:85:0x02f7, B:86:0x02ff, B:120:0x03b9, B:122:0x03c3, B:123:0x03c8, B:125:0x03d2, B:127:0x03ed, B:129:0x03f3, B:131:0x0401, B:133:0x040b, B:134:0x0413), top: B:177:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0352  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.amplifyframework.statemachine.EventDispatcher] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.amplifyframework.auth.cognito.AuthEnvironment] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Map] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.amplifyframework.statemachine.EventDispatcher r19, com.amplifyframework.statemachine.Environment r20, uw.InterfaceC7559c<? super qw.a0> r21) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1.execute(com.amplifyframework.statemachine.EventDispatcher, com.amplifyframework.statemachine.Environment, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43748id;
    }
}
