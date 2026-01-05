package p001o;

import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class ui9 {

    /* renamed from: a */
    public final String f48969a;

    /* renamed from: b */
    public volatile Logger f48970b;

    public ui9(Class cls) {
        this.f48969a = cls.getName();
    }

    /* renamed from: a */
    public Logger m51626a() {
        Logger logger = this.f48970b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            Logger logger2 = this.f48970b;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.f48969a);
            this.f48970b = logger3;
            return logger3;
        }
    }
}
