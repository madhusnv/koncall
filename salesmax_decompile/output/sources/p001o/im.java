package p001o;

import java.util.Objects;
import java.util.Optional;
import type.CreateAccountInput;
import type.CreateTeamAccountInput;

/* loaded from: classes.dex */
public abstract class im {
    /* renamed from: a */
    public static CreateAccountInput m32269a(String str, String str2, String str3, String str4) {
        CreateAccountInput.Builder builderIndustry = CreateAccountInput.builder().accountName(str).industry(str3);
        Optional optionalOfNullable = Optional.ofNullable(str2);
        Objects.requireNonNull(builderIndustry);
        optionalOfNullable.ifPresent(new ij(builderIndustry));
        return builderIndustry.build();
    }

    /* renamed from: b */
    public static CreateTeamAccountInput m32270b(String str, boolean z, boolean z2, String str2, boolean z3, CreateAccountInput createAccountInput) {
        CreateTeamAccountInput.Builder builderAccountInput = CreateTeamAccountInput.builder().isTrialAccount(z3).mapRegisteredMobileNumberToAccount(z).mapSecondaryMobileNumberToAccount(z2).accountInput(createAccountInput);
        Optional optionalOfNullable = Optional.ofNullable(str);
        Objects.requireNonNull(builderAccountInput);
        optionalOfNullable.ifPresent(new yi(builderAccountInput));
        Optional.ofNullable(str2).ifPresent(new gj(builderAccountInput));
        return builderAccountInput.build();
    }

    /* renamed from: c */
    public static x6c m32271c(String str, String str2, boolean z, boolean z2, String str3, String str4, boolean z3) {
        return uni.kC().TB().il(m32270b(str2, z, z2, str3, z3, m32269a(str, str2, str4, str3)));
    }
}
