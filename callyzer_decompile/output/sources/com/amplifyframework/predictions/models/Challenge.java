package com.amplifyframework.predictions.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import i0.m0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public abstract class Challenge {
    private final String name;
    private final String version;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public static final class FaceMovementAndLightChallenge extends Challenge {
        private final String version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceMovementAndLightChallenge(String version) {
            super("FaceMovementAndLightChallenge", version, null);
            AbstractC4154l.m8923f(version, "version");
            this.version = version;
        }

        public static /* synthetic */ FaceMovementAndLightChallenge copy$default(FaceMovementAndLightChallenge faceMovementAndLightChallenge, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = faceMovementAndLightChallenge.version;
            }
            return faceMovementAndLightChallenge.copy(str);
        }

        public final String component1() {
            return this.version;
        }

        public final FaceMovementAndLightChallenge copy(String version) {
            AbstractC4154l.m8923f(version, "version");
            return new FaceMovementAndLightChallenge(version);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FaceMovementAndLightChallenge) && AbstractC4154l.m8918a(this.version, ((FaceMovementAndLightChallenge) obj).version);
        }

        @Override // com.amplifyframework.predictions.models.Challenge
        public String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode();
        }

        public String toString() {
            return AbstractC5601a.m11238i("FaceMovementAndLightChallenge(version=", this.version, ")");
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalAmplifyApi
    public static final class FaceMovementChallenge extends Challenge {
        private final String version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceMovementChallenge(String version) {
            super("FaceMovementChallenge", version, null);
            AbstractC4154l.m8923f(version, "version");
            this.version = version;
        }

        public static /* synthetic */ FaceMovementChallenge copy$default(FaceMovementChallenge faceMovementChallenge, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = faceMovementChallenge.version;
            }
            return faceMovementChallenge.copy(str);
        }

        public final String component1() {
            return this.version;
        }

        public final FaceMovementChallenge copy(String version) {
            AbstractC4154l.m8923f(version, "version");
            return new FaceMovementChallenge(version);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FaceMovementChallenge) && AbstractC4154l.m8918a(this.version, ((FaceMovementChallenge) obj).version);
        }

        @Override // com.amplifyframework.predictions.models.Challenge
        public String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode();
        }

        public String toString() {
            return AbstractC5601a.m11238i("FaceMovementChallenge(version=", this.version, ")");
        }
    }

    public /* synthetic */ Challenge(String str, String str2, AbstractC4148f abstractC4148f) {
        this(str, str2);
    }

    public final String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public final String toQueryParamString() {
        return m0.m7379l(this.name, "_", getVersion());
    }

    private Challenge(String str, String str2) {
        this.name = str;
        this.version = str2;
    }
}
