package p001o;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* loaded from: classes2.dex */
public final class qf0 implements x9d {

    /* renamed from: a */
    public static final qf0 f41812a = new qf0();

    /* renamed from: o.qf0$a */
    public static final class C16371a implements w9d {

        /* renamed from: a */
        public final uhh f41813a;

        /* renamed from: b */
        public final vhh f41814b;

        public C16371a(uhh uhhVar, vhh vhhVar) {
            sq8.m48649h(uhhVar, "service");
            sq8.m48649h(vhhVar, "androidService");
            this.f41813a = uhhVar;
            this.f41814b = vhhVar;
        }

        @Override // p001o.w9d
        /* renamed from: a */
        public InputConnection mo45355a(EditorInfo editorInfo) {
            sq8.m48649h(editorInfo, "outAttrs");
            return this.f41814b.m52788e(editorInfo);
        }

        /* renamed from: b */
        public final uhh m45356b() {
            return this.f41813a;
        }
    }

    @Override // p001o.x9d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C16371a mo45353a(v9d v9dVar, View view) {
        sq8.m48649h(v9dVar, "platformTextInput");
        sq8.m48649h(view, "view");
        vhh vhhVar = new vhh(view, v9dVar);
        return new C16371a(new uhh(vhhVar), vhhVar);
    }
}
