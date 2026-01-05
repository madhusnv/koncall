package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class CredentialType {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class ASF extends CredentialType {
        public static final ASF INSTANCE = new ASF();

        private ASF() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Amplify extends CredentialType {
        public static final Amplify INSTANCE = new Amplify();

        private Amplify() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Device extends CredentialType {
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Device(String username) {
            super(null);
            AbstractC4154l.m8923f(username, "username");
            this.username = username;
        }

        public static /* synthetic */ Device copy$default(Device device, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = device.username;
            }
            return device.copy(str);
        }

        public final String component1() {
            return this.username;
        }

        public final Device copy(String username) {
            AbstractC4154l.m8923f(username, "username");
            return new Device(username);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Device) && AbstractC4154l.m8918a(this.username, ((Device) obj).username);
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            return this.username.hashCode();
        }

        public String toString() {
            return AbstractC5601a.m11238i("Device(username=", this.username, ")");
        }
    }

    public /* synthetic */ CredentialType(AbstractC4148f abstractC4148f) {
        this();
    }

    private CredentialType() {
    }
}
