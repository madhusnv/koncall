package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.util.Prefs;
import com.amazonaws.amplify.generated.graphql.VerifyEmailMutation;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.VerifyEmailOutput;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import type.VerifyEmailInput;

/* loaded from: classes.dex */
public interface d7d extends ja8 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean D6(VerifyEmailOutput verifyEmailOutput) {
        if (!verifyEmailOutput.getIsVerified().booleanValue()) {
            throw new RuntimeException("Phonenumber change isn't verified, please check the otp entered");
        }
        Uf(null);
        return true;
    }

    static /* synthetic */ boolean F1(VerifyEmailOutput verifyEmailOutput) {
        return !StringUtils.isBlank(verifyEmailOutput.getVerifyId());
    }

    static /* synthetic */ Boolean Jn(VerifyEmailOutput verifyEmailOutput, Prefs prefs) {
        if (Optional.ofNullable(verifyEmailOutput).isPresent()) {
            prefs.w1(ja8.f30035c.toJson(verifyEmailOutput));
            return Boolean.TRUE;
        }
        prefs.w1("");
        return Boolean.TRUE;
    }

    static /* synthetic */ VerifyEmailOutput N4(String str) {
        return (VerifyEmailOutput) ja8.f30035c.fromJson(str, VerifyEmailOutput.class);
    }

    static /* synthetic */ boolean Ui(String str, VerifyEmailOutput verifyEmailOutput) {
        return Objects.equals(verifyEmailOutput.getPhoneToVerify(), str);
    }

    static /* synthetic */ boolean c7(String str) {
        return !StringUtils.isBlank(str);
    }

    default Boolean Uf(final VerifyEmailOutput verifyEmailOutput) {
        return (Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.z6d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d7d.Jn(verifyEmailOutput, (Prefs) obj);
            }
        }).orElse(Boolean.FALSE);
    }

    default x6c Xg(String str, String str2, String str3) {
        if (StringUtils.isBlank(str)) {
            return x6c.m55694H(new RuntimeException("Input phonenumber to change can't be empty or null"));
        }
        if (!e7d.m24490c(str)) {
            return x6c.m55694H(new RuntimeException("Input phonenumber isn't a valid number"));
        }
        return graphqlMutation(VerifyEmailMutation.builder().input(VerifyEmailInput.builder().phoneToVerify(e7d.m24492e(str)).verificationPurpose("CHANGE_REGISTERED_NUMBER").accountId(str2).name(str3).build()).build(), VerifyEmailMutation.Data.class, new z46(), VerifyEmailOutput.class).m55714J(new ggd() { // from class: o.v6d
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f49924a.Uf((VerifyEmailOutput) obj).booleanValue();
            }
        });
    }

    default x6c db(String str, final String str2, String str3) {
        VerifyEmailOutput verifyEmailOutputVt = vt();
        if (!Optional.ofNullable(verifyEmailOutputVt).filter(new Predicate() { // from class: o.w6d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d7d.F1((VerifyEmailOutput) obj);
            }
        }).filter(new Predicate() { // from class: o.x6d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d7d.Ui(str2, (VerifyEmailOutput) obj);
            }
        }).isPresent()) {
            return x6c.m55694H(new RuntimeException("Couldn't find requested email verification code, please resend your email verification request"));
        }
        return graphqlMutation(VerifyEmailMutation.builder().input(VerifyEmailInput.builder().verifyId(verifyEmailOutputVt.getVerifyId()).accountId(str).verificationPurpose("CHANGE_REGISTERED_NUMBER").phoneToVerify(verifyEmailOutputVt.getPhoneToVerify()).enteredCode(str3).build()).build(), VerifyEmailMutation.Data.class, new z46(), VerifyEmailOutput.class).m55714J(new ggd() { // from class: o.y6d
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f55005a.D6((VerifyEmailOutput) obj);
            }
        });
    }

    default VerifyEmailOutput vt() {
        return (VerifyEmailOutput) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.a7d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Prefs) obj).m3232T();
            }
        }).filter(new Predicate() { // from class: o.b7d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d7d.c7((String) obj);
            }
        }).map(new Function() { // from class: o.c7d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d7d.N4((String) obj);
            }
        }).orElse(null);
    }
}
