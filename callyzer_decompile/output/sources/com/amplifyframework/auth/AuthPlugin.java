package com.amplifyframework.auth;

import android.content.Context;
import com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.plugin.Plugin;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthPlugin<E> implements AuthCategoryBehavior, Plugin<E> {
    @Override // com.amplifyframework.core.category.CategoryTypeable
    public final CategoryType getCategoryType() {
        return CategoryType.AUTH;
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void setUpTOTP(Consumer<TOTPSetupDetails> consumer, Consumer<AuthException> consumer2) {
        throw new UnsupportedOperationException("TOTP is not implemented in this plugin");
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void verifyTOTPSetup(String str, Action action, Consumer<AuthException> consumer) {
        throw new UnsupportedOperationException("TOTP is not implemented in this plugin");
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void verifyTOTPSetup(String str, AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, Action action, Consumer<AuthException> consumer) {
        throw new UnsupportedOperationException("TOTP is not implemented in this plugin");
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void initialize(Context context) {
    }
}
