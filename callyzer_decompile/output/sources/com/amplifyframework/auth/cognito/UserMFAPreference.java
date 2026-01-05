package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.MFAType;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class UserMFAPreference {
    private final Set<MFAType> enabled;
    private final MFAType preferred;

    /* JADX WARN: Multi-variable type inference failed */
    public UserMFAPreference(Set<? extends MFAType> set, MFAType mFAType) {
        this.enabled = set;
        this.preferred = mFAType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserMFAPreference copy$default(UserMFAPreference userMFAPreference, Set set, MFAType mFAType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = userMFAPreference.enabled;
        }
        if ((i10 & 2) != 0) {
            mFAType = userMFAPreference.preferred;
        }
        return userMFAPreference.copy(set, mFAType);
    }

    public final Set<MFAType> component1() {
        return this.enabled;
    }

    public final MFAType component2() {
        return this.preferred;
    }

    public final UserMFAPreference copy(Set<? extends MFAType> set, MFAType mFAType) {
        return new UserMFAPreference(set, mFAType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserMFAPreference)) {
            return false;
        }
        UserMFAPreference userMFAPreference = (UserMFAPreference) obj;
        return AbstractC4154l.m8918a(this.enabled, userMFAPreference.enabled) && this.preferred == userMFAPreference.preferred;
    }

    public final Set<MFAType> getEnabled() {
        return this.enabled;
    }

    public final MFAType getPreferred() {
        return this.preferred;
    }

    public int hashCode() {
        Set<MFAType> set = this.enabled;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        MFAType mFAType = this.preferred;
        return iHashCode + (mFAType != null ? mFAType.hashCode() : 0);
    }

    public String toString() {
        return "UserMFAPreference(enabled=" + this.enabled + ", preferred=" + this.preferred + ")";
    }
}
