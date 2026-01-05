package com.google.api.client.testing.http;

import com.google.api.client.http.HttpContent;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.OutputStream;

@Beta
/* loaded from: classes3.dex */
public class MockHttpContent implements HttpContent {

    /* renamed from: type, reason: collision with root package name */
    private String f58145type;
    private long length = -1;
    private byte[] content = new byte[0];

    public final byte[] getContent() {
        return this.content;
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() {
        return this.length;
    }

    @Override // com.google.api.client.http.HttpContent
    public String getType() {
        return this.f58145type;
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    public MockHttpContent setContent(byte[] bArr) {
        this.content = (byte[]) Preconditions.checkNotNull(bArr);
        return this;
    }

    public MockHttpContent setLength(long j) {
        Preconditions.checkArgument(j >= -1);
        this.length = j;
        return this;
    }

    public MockHttpContent setType(String str) {
        this.f58145type = str;
        return this;
    }

    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content);
        outputStream.flush();
    }
}
