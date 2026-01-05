package com.google.api.client.json.jackson2;

import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import java.math.BigDecimal;
import java.math.BigInteger;
import p001o.ca9;

/* loaded from: classes3.dex */
final class JacksonParser extends JsonParser {
    private final JacksonFactory factory;
    private final ca9 parser;

    public JacksonParser(JacksonFactory jacksonFactory, ca9 ca9Var) {
        this.factory = jacksonFactory;
        this.parser = ca9Var;
    }

    @Override // com.google.api.client.json.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.parser.close();
    }

    @Override // com.google.api.client.json.JsonParser
    public BigInteger getBigIntegerValue() {
        return this.parser.mo20619c();
    }

    @Override // com.google.api.client.json.JsonParser
    public byte getByteValue() {
        return this.parser.m20620d();
    }

    @Override // com.google.api.client.json.JsonParser
    public String getCurrentName() {
        return this.parser.mo20622g();
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonToken getCurrentToken() {
        return JacksonFactory.convert(this.parser.mo20623h());
    }

    @Override // com.google.api.client.json.JsonParser
    public BigDecimal getDecimalValue() {
        return this.parser.mo20624k();
    }

    @Override // com.google.api.client.json.JsonParser
    public double getDoubleValue() {
        return this.parser.mo20625o();
    }

    @Override // com.google.api.client.json.JsonParser
    public float getFloatValue() {
        return this.parser.mo20626r();
    }

    @Override // com.google.api.client.json.JsonParser
    public int getIntValue() {
        return this.parser.mo20627s();
    }

    @Override // com.google.api.client.json.JsonParser
    public long getLongValue() {
        return this.parser.mo20628t();
    }

    @Override // com.google.api.client.json.JsonParser
    public short getShortValue() {
        return this.parser.m20629u();
    }

    @Override // com.google.api.client.json.JsonParser
    public String getText() {
        return this.parser.mo20614C();
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonToken nextToken() {
        return JacksonFactory.convert(this.parser.mo20616H());
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonParser skipChildren() {
        this.parser.mo20617J();
        return this;
    }

    @Override // com.google.api.client.json.JsonParser
    public JacksonFactory getFactory() {
        return this.factory;
    }
}
