package com.amplifyframework.statemachine.codegen.data;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class CredentialType {

    public static final class ASF extends CredentialType {
        public static final ASF INSTANCE = new ASF();

        private ASF() {
            super(null);
        }
    }

    public static final class Amplify extends CredentialType {
        public static final Amplify INSTANCE = new Amplify();

        private Amplify() {
            super(null);
        }
    }

    public static final class Device extends CredentialType {
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Device(String str) {
            super(null);
            sq8.m48649h(str, "username");
            this.username = str;
        }

        public static /* synthetic */ Device copy$default(Device device, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = device.username;
            }
            return device.copy(str);
        }

        public final String component1() {
            return this.username;
        }

        public final Device copy(String str) {
            sq8.m48649h(str, "username");
            return new Device(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Device) && sq8.m48644c(this.username, ((Device) obj).username);
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            return this.username.hashCode();
        }

        public String toString() {
            return "Device(username=" + this.username + ")";
        }
    }

    private CredentialType() {
    }

    public /* synthetic */ CredentialType(id5 id5Var) {
        this();
    }
}
