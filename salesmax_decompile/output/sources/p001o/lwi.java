package p001o;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class lwi {

    /* renamed from: o.lwi$a */
    public static final class C15170a implements ief {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f34478a;

        public C15170a(ViewGroup viewGroup) {
            this.f34478a = viewGroup;
        }

        @Override // p001o.ief
        public Iterator iterator() {
            return lwi.m38082c(this.f34478a);
        }
    }

    /* renamed from: o.lwi$b */
    public static final class C15171b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C15171b f34479a = new C15171b();

        public C15171b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(View view) {
            ief iefVarM38080a;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (iefVarM38080a = lwi.m38080a(viewGroup)) == null) {
                return null;
            }
            return iefVarM38080a.iterator();
        }
    }

    /* renamed from: o.lwi$c */
    public static final class C15172c implements Iterator, sb9 {

        /* renamed from: a */
        public int f34480a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f34481b;

        public C15172c(ViewGroup viewGroup) {
            this.f34481b = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f34481b;
            int i = this.f34480a;
            this.f34480a = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34480a < this.f34481b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f34481b;
            int i = this.f34480a - 1;
            this.f34480a = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* renamed from: o.lwi$d */
    public static final class C15173d implements ief {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f34482a;

        public C15173d(ViewGroup viewGroup) {
            this.f34482a = viewGroup;
        }

        @Override // p001o.ief
        public Iterator iterator() {
            return new jxh(lwi.m38080a(this.f34482a).iterator(), C15171b.f34479a);
        }
    }

    /* renamed from: a */
    public static final ief m38080a(ViewGroup viewGroup) {
        return new C15170a(viewGroup);
    }

    /* renamed from: b */
    public static final ief m38081b(ViewGroup viewGroup) {
        return new C15173d(viewGroup);
    }

    /* renamed from: c */
    public static final Iterator m38082c(ViewGroup viewGroup) {
        return new C15172c(viewGroup);
    }
}
