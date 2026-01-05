package p001o;

import java.util.concurrent.ConcurrentHashMap;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public final class wn8 extends ConcurrentHashMap {

    /* renamed from: b */
    public static final wn8 f52388b = new wn8();

    /* renamed from: a */
    public final Object f52389a;

    public wn8() {
        super(Opcodes.GETFIELD, 0.8f, 4);
        this.f52389a = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public String m54745a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.f52389a) {
                if (size() >= 180) {
                    clear();
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}
