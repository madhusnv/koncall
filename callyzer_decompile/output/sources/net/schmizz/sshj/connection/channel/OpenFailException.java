package net.schmizz.sshj.connection.channel;

import net.schmizz.sshj.connection.ConnectionException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class OpenFailException extends ConnectionException {

    /* renamed from: d */
    public final String f24790d;

    /* renamed from: e */
    public final String f24791e;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: net.schmizz.sshj.connection.channel.OpenFailException$a */
    public enum EnumC5038a {
        UNKNOWN(0),
        ADMINISTRATIVELY_PROHIBITED(1),
        CONNECT_FAILED(2),
        UNKNOWN_CHANNEL_TYPE(3),
        RESOURCE_SHORTAGE(4);

        private final int code;

        EnumC5038a(int i10) {
            this.code = i10;
        }

        public static EnumC5038a fromInt(int i10) {
            for (EnumC5038a enumC5038a : values()) {
                if (enumC5038a.code == i10) {
                    return enumC5038a;
                }
            }
            return UNKNOWN;
        }

        public int getCode() {
            return this.code;
        }
    }

    public OpenFailException(String str, int i10, String str2) {
        super(str2);
        this.f24790d = str;
        EnumC5038a.fromInt(i10);
        this.f24791e = str2;
    }

    @Override // net.schmizz.sshj.common.SSHException, java.lang.Throwable
    public final String getMessage() {
        return this.f24791e;
    }

    @Override // net.schmizz.sshj.common.SSHException, java.lang.Throwable
    public final String toString() {
        return "Opening `" + this.f24790d + "` channel failed: " + this.f24791e;
    }
}
