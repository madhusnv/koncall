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
public interface g56 extends ja8 {
    static /* synthetic */ boolean Af(VerifyEmailOutput verifyEmailOutput) {
        return !StringUtils.isBlank(verifyEmailOutput.getVerifyId());
    }

    static /* synthetic */ boolean Bw(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean Fa(VerifyEmailOutput verifyEmailOutput) {
        if (!verifyEmailOutput.getIsVerified().booleanValue()) {
            throw new RuntimeException("Account Email isn't verified, please check the otp entered");
        }
        dj(null);
        return true;
    }

    static /* synthetic */ Boolean Oq(VerifyEmailOutput verifyEmailOutput, Prefs prefs) {
        if (Optional.ofNullable(verifyEmailOutput).isPresent()) {
            prefs.a1(ja8.f30035c.toJson(verifyEmailOutput));
            return Boolean.TRUE;
        }
        prefs.a1("");
        return Boolean.TRUE;
    }

    static /* synthetic */ boolean iu(String str, VerifyEmailOutput verifyEmailOutput) {
        return Objects.equals(verifyEmailOutput.getEmailToVerify(), str);
    }

    static /* synthetic */ VerifyEmailOutput jz(String str) {
        return (VerifyEmailOutput) ja8.f30035c.fromJson(str, VerifyEmailOutput.class);
    }

    default VerifyEmailOutput Qc() {
        return (VerifyEmailOutput) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.d56
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Prefs) obj).m3213A();
            }
        }).filter(new Predicate() { // from class: o.e56
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return g56.Bw((String) obj);
            }
        }).map(new Function() { // from class: o.f56
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return g56.jz((String) obj);
            }
        }).orElse(null);
    }

    default x6c W1(String str, final String str2, String str3) {
        VerifyEmailOutput verifyEmailOutputQc = Qc();
        if (!Optional.ofNullable(verifyEmailOutputQc).filter(new Predicate() { // from class: o.x46
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return g56.Af((VerifyEmailOutput) obj);
            }
        }).filter(new Predicate() { // from class: o.y46
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return g56.iu(str2, (VerifyEmailOutput) obj);
            }
        }).isPresent()) {
            return x6c.m55694H(new RuntimeException("Couldn't find requested email verification code, please resend your email verification request"));
        }
        return graphqlMutation(VerifyEmailMutation.builder().input(VerifyEmailInput.builder().verifyId(verifyEmailOutputQc.getVerifyId()).accountId(str).emailToVerify(verifyEmailOutputQc.getEmailToVerify()).enteredCode(str3).build()).build(), VerifyEmailMutation.Data.class, new z46(), VerifyEmailOutput.class).m55714J(new ggd() { // from class: o.a56
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f14143a.Fa((VerifyEmailOutput) obj);
            }
        });
    }

    default x6c Xt(String str, String str2, String str3) {
        if (StringUtils.isBlank(str)) {
            return x6c.m55694H(new RuntimeException("Input account email to verify can't be empty or null"));
        }
        return graphqlMutation(VerifyEmailMutation.builder().input(VerifyEmailInput.builder().emailToVerify(str).accountId(str2).name(str3).build()).build(), VerifyEmailMutation.Data.class, new z46(), VerifyEmailOutput.class).m55714J(new ggd() { // from class: o.b56
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f15552a.dj((VerifyEmailOutput) obj).booleanValue();
            }
        });
    }

    default Boolean dj(final VerifyEmailOutput verifyEmailOutput) {
        return (Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.c56
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return g56.Oq(verifyEmailOutput, (Prefs) obj);
            }
        }).orElse(Boolean.FALSE);
    }
}
