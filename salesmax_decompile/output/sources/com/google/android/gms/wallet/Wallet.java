package com.google.android.gms.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.wallet.wobs.WalletObjects;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class Wallet {

    @RecentlyNonNull
    public static final Api<WalletOptions> API;

    @RecentlyNonNull
    public static final WalletObjects zza;

    @Deprecated
    public static final com.google.android.gms.internal.wallet.zzv zzb;

    @ShowFirstParty
    public static final com.google.android.gms.internal.wallet.zzac zzc;
    private static final Api.ClientKey<com.google.android.gms.internal.wallet.zzab> zzd;
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.wallet.zzab, WalletOptions> zze;

    public static final class WalletOptions implements Api.ApiOptions.HasAccountOptions {
        public final int environment;
        public final int theme;

        @RecentlyNonNull
        @ShowFirstParty
        public final Account zza;
        final boolean zzb;

        public static final class Builder {
            private int zza = 3;
            private int zzb = 1;
            private boolean zzc = true;

            @RecentlyNonNull
            public WalletOptions build() {
                return new WalletOptions(this, null);
            }

            @RecentlyNonNull
            public Builder setEnvironment(int i) {
                if (i != 0) {
                    if (i == 0) {
                        i = 0;
                    } else if (i != 2 && i != 1 && i != 23 && i != 3) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i)));
                    }
                }
                this.zza = i;
                return this;
            }

            @RecentlyNonNull
            public Builder setTheme(int i) {
                if (i != 0 && i != 1 && i != 2 && i != 3) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", Integer.valueOf(i)));
                }
                this.zzb = i;
                return this;
            }

            @RecentlyNonNull
            @Deprecated
            public Builder useGoogleWallet() {
                this.zzc = false;
                return this;
            }
        }

        private WalletOptions(Builder builder) {
            this.environment = builder.zza;
            this.theme = builder.zzb;
            this.zzb = builder.zzc;
            this.zza = null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof WalletOptions) {
                WalletOptions walletOptions = (WalletOptions) obj;
                if (Objects.equal(Integer.valueOf(this.environment), Integer.valueOf(walletOptions.environment)) && Objects.equal(Integer.valueOf(this.theme), Integer.valueOf(walletOptions.theme)) && Objects.equal(null, null) && Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(walletOptions.zzb))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions
        @RecentlyNonNull
        public Account getAccount() {
            return null;
        }

        public int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.environment), Integer.valueOf(this.theme), null, Boolean.valueOf(this.zzb));
        }

        private WalletOptions() {
            this(new Builder());
        }

        public /* synthetic */ WalletOptions(zzaj zzajVar) {
            this(new Builder());
        }

        public /* synthetic */ WalletOptions(Builder builder, zzaj zzajVar) {
            this(builder);
        }
    }

    static {
        Api.ClientKey<com.google.android.gms.internal.wallet.zzab> clientKey = new Api.ClientKey<>();
        zzd = clientKey;
        zzaj zzajVar = new zzaj();
        zze = zzajVar;
        API = new Api<>("Wallet.API", zzajVar, clientKey);
        zzb = new com.google.android.gms.internal.wallet.zzv();
        zza = new com.google.android.gms.internal.wallet.zzae();
        zzc = new com.google.android.gms.internal.wallet.zzac();
    }

    private Wallet() {
    }

    @RecentlyNonNull
    public static PaymentsClient getPaymentsClient(@RecentlyNonNull Activity activity, @RecentlyNonNull WalletOptions walletOptions) {
        return new PaymentsClient(activity, walletOptions);
    }

    @RecentlyNonNull
    public static WalletObjectsClient getWalletObjectsClient(@RecentlyNonNull Activity activity, WalletOptions walletOptions) {
        return new WalletObjectsClient(activity, walletOptions);
    }

    @RecentlyNonNull
    public static PaymentsClient getPaymentsClient(@RecentlyNonNull Context context, @RecentlyNonNull WalletOptions walletOptions) {
        return new PaymentsClient(context, walletOptions);
    }
}
