package androidx.media;

import java.util.Arrays;
import mm.AbstractC4801l;
import org.bouncycastle.iana.AEADAlgorithm;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f2767a = 0;

    /* renamed from: b */
    public int f2768b = 0;

    /* renamed from: c */
    public int f2769c = 0;

    /* renamed from: d */
    public int f2770d = -1;

    public final boolean equals(Object obj) {
        int i10;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2768b == audioAttributesImplBase.f2768b) {
            int i11 = this.f2769c;
            int i12 = audioAttributesImplBase.f2769c;
            int i13 = audioAttributesImplBase.f2770d;
            if (i13 == -1) {
                int i14 = audioAttributesImplBase.f2767a;
                int i15 = AudioAttributesCompat.f2763b;
                if ((i12 & 1) != 1) {
                    i10 = 4;
                    if ((i12 & 4) != 4) {
                        switch (i14) {
                            case 2:
                                i10 = 0;
                                break;
                            case 3:
                                i10 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i10 = 5;
                                break;
                            case 6:
                                i10 = 2;
                                break;
                            case 11:
                                i10 = 10;
                                break;
                            case 12:
                            default:
                                i10 = 3;
                                break;
                            case 13:
                                i10 = 1;
                                break;
                        }
                    } else {
                        i10 = 6;
                    }
                } else {
                    i10 = 7;
                }
            } else {
                i10 = i13;
            }
            if (i10 == 6) {
                i12 |= 4;
            } else if (i10 == 7) {
                i12 |= 1;
            }
            if (i11 == (i12 & 273) && this.f2767a == audioAttributesImplBase.f2767a && this.f2770d == i13) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2768b), Integer.valueOf(this.f2769c), Integer.valueOf(this.f2767a), Integer.valueOf(this.f2770d)});
    }

    public final String toString() {
        String strM9730d;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f2770d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f2770d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.f2767a;
        int i11 = AudioAttributesCompat.f2763b;
        switch (i10) {
            case 0:
                strM9730d = "USAGE_UNKNOWN";
                break;
            case 1:
                strM9730d = "USAGE_MEDIA";
                break;
            case 2:
                strM9730d = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM9730d = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM9730d = "USAGE_ALARM";
                break;
            case 5:
                strM9730d = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM9730d = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM9730d = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM9730d = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM9730d = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM9730d = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM9730d = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM9730d = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM9730d = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM9730d = "USAGE_GAME";
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
            default:
                strM9730d = AbstractC4801l.m9730d(i10, "unknown usage ");
                break;
            case 16:
                strM9730d = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strM9730d);
        sb2.append(" content=");
        sb2.append(this.f2768b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f2769c).toUpperCase());
        return sb2.toString();
    }
}
