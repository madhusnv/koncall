package p001o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class dic extends RecyclerView.AbstractC2371h {

    /* renamed from: a */
    public a3d f20034a;

    /* renamed from: b */
    public final PdfRenderer f20035b;

    /* renamed from: o.dic$a */
    public static final class C12946a extends RecyclerView.d0 {

        /* renamed from: u */
        public final View f20036u;

        /* renamed from: v */
        public final a3d f20037v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12946a(View view, a3d a3dVar) {
            super(view);
            sq8.m48649h(view, "view");
            sq8.m48649h(a3dVar, "bitmapPool");
            this.f20036u = view;
            this.f20037v = a3dVar;
        }

        /* renamed from: O */
        public final void m23304O(int i) {
            ImageView imageView = (ImageView) this.f20036u.findViewById(z8e.pageImgView);
            a3d a3dVar = this.f20037v;
            sq8.m48646e(a3dVar);
            imageView.setImageBitmap(a3dVar.m16380c(i));
            a3d a3dVar2 = this.f20037v;
            sq8.m48646e(a3dVar2);
            a3dVar2.m16381d(i);
        }
    }

    public dic(ParcelFileDescriptor parcelFileDescriptor, Context context) {
        sq8.m48649h(parcelFileDescriptor, "pdfParcelDescriptor");
        sq8.m48649h(context, "context");
        PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptor);
        this.f20035b = pdfRenderer;
        this.f20034a = new a3d(pdfRenderer, Bitmap.Config.ARGB_8888, context.getResources().getDisplayMetrics().densityDpi);
    }

    /* renamed from: d */
    public final void m23301d() {
        SparseArray sparseArrayM16378a;
        this.f20035b.close();
        a3d a3dVar = this.f20034a;
        if (a3dVar == null || (sparseArrayM16378a = a3dVar.m16378a()) == null) {
            return;
        }
        sparseArrayM16378a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C12946a c12946a, int i) {
        sq8.m48649h(c12946a, "holder");
        c12946a.m23304O(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C12946a onCreateViewHolder(ViewGroup viewGroup, int i) {
        sq8.m48649h(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(p9e.pdf_page_item, viewGroup, false);
        sq8.m48646e(viewInflate);
        a3d a3dVar = this.f20034a;
        sq8.m48646e(a3dVar);
        return new C12946a(viewInflate, a3dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public int getItemCount() {
        return this.f20035b.getPageCount();
    }
}
