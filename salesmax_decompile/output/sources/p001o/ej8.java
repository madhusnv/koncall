package p001o;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ej8 {

    /* renamed from: a */
    public final InterfaceC13207c f21756a;

    /* renamed from: o.ej8$a */
    public static class C13205a implements InterfaceC13207c {

        /* renamed from: a */
        public final InputConfiguration f21757a;

        public C13205a(Object obj) {
            this.f21757a = (InputConfiguration) obj;
        }

        @Override // p001o.ej8.InterfaceC13207c
        /* renamed from: a */
        public Object mo25132a() {
            return this.f21757a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof InterfaceC13207c) {
                return Objects.equals(this.f21757a, ((InterfaceC13207c) obj).mo25132a());
            }
            return false;
        }

        public int hashCode() {
            return this.f21757a.hashCode();
        }

        public String toString() {
            return this.f21757a.toString();
        }
    }

    /* renamed from: o.ej8$b */
    public static final class C13206b extends C13205a {
        public C13206b(Object obj) {
            super(obj);
        }
    }

    /* renamed from: o.ej8$c */
    public interface InterfaceC13207c {
        /* renamed from: a */
        Object mo25132a();
    }

    public ej8(InterfaceC13207c interfaceC13207c) {
        this.f21756a = interfaceC13207c;
    }

    /* renamed from: b */
    public static ej8 m25130b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new ej8(new C13206b(obj)) : new ej8(new C13205a(obj));
    }

    /* renamed from: a */
    public Object m25131a() {
        return this.f21756a.mo25132a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ej8) {
            return this.f21756a.equals(((ej8) obj).f21756a);
        }
        return false;
    }

    public int hashCode() {
        return this.f21756a.hashCode();
    }

    public String toString() {
        return this.f21756a.toString();
    }
}
