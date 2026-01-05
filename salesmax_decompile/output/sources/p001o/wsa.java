package p001o;

import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import org.objectweb.asm.Opcodes;
import p001o.usa;

/* loaded from: classes3.dex */
public abstract class wsa {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static usa m54952a(ka9 ka9Var, ama amaVar) {
        String strMo22739s;
        char c;
        ka9Var.mo22732d();
        usa.EnumC17443a enumC17443a = null;
        mg0 mg0VarM51560k = null;
        hg0 hg0VarM51557h = null;
        boolean zMo22736k = false;
        while (ka9Var.mo22735h()) {
            strMo22739s = ka9Var.mo22739s();
            strMo22739s.hashCode();
            c = 3;
            switch (strMo22739s) {
                case "o":
                    hg0VarM51557h = ug0.m51557h(ka9Var, amaVar);
                    break;
                case "pt":
                    mg0VarM51560k = ug0.m51560k(ka9Var, amaVar);
                    break;
                case "inv":
                    zMo22736k = ka9Var.mo22736k();
                    break;
                case "mode":
                    String strMo22740t = ka9Var.mo22740t();
                    strMo22740t.hashCode();
                    switch (strMo22740t.hashCode()) {
                        case Opcodes.LADD /* 97 */:
                            if (!strMo22740t.equals("a")) {
                                c = 65535;
                                break;
                            } else {
                                c = 0;
                                break;
                            }
                        case 105:
                            if (strMo22740t.equals("i")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 110:
                            if (strMo22740t.equals(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT)) {
                                c = 2;
                                break;
                            }
                            break;
                        case Opcodes.DREM /* 115 */:
                            if (!strMo22740t.equals("s")) {
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            enumC17443a = usa.EnumC17443a.MASK_MODE_ADD;
                            break;
                        case 1:
                            amaVar.m17437a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            enumC17443a = usa.EnumC17443a.MASK_MODE_INTERSECT;
                            break;
                        case 2:
                            enumC17443a = usa.EnumC17443a.MASK_MODE_NONE;
                            break;
                        case 3:
                            enumC17443a = usa.EnumC17443a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            rja.m46866c("Unknown mask mode " + strMo22739s + ". Defaulting to Add.");
                            enumC17443a = usa.EnumC17443a.MASK_MODE_ADD;
                            break;
                    }
                default:
                    ka9Var.mo22726K();
                    break;
            }
        }
        ka9Var.mo22734g();
        return new usa(enumC17443a, mg0VarM51560k, hg0VarM51557h, zMo22736k);
    }
}
