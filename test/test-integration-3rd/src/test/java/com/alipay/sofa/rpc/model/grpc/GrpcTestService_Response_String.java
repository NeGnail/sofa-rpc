/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcTestService.proto

package com.alipay.sofa.rpc.model.grpc;

/**
 * Protobuf type {@code GrpcTestService_Response_String}
 */
public final class GrpcTestService_Response_String extends
                                                  com.google.protobuf.GeneratedMessageV3 implements
                                                                                        // @@protoc_insertion_point(message_implements:GrpcTestService_Response_String)
                                                                                        GrpcTestService_Response_StringOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use GrpcTestService_Response_String.newBuilder() to construct.
    private GrpcTestService_Response_String(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GrpcTestService_Response_String() {
        result_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
        return this.unknownFields;
    }

    private GrpcTestService_Response_String(
                                            com.google.protobuf.CodedInputStream input,
                                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                                        throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!parseUnknownFieldProto3(
                            input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 10: {
                        String s = input.readStringRequireUtf8();

                        result_ = s;
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                e).setUnfinishedMessage(this);
        } finally {
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
        return GrpcTestServiceProto.internal_static_GrpcTestService_Response_String_descriptor;
    }

    protected FieldAccessorTable
            internalGetFieldAccessorTable() {
        return GrpcTestServiceProto.internal_static_GrpcTestService_Response_String_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GrpcTestService_Response_String.class,
                Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private volatile Object result_;

    /**
     * <code>string result = 1;</code>
     */
    public String getResult() {
        Object ref = result_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            result_ = s;
            return s;
        }
    }

    /**
     * <code>string result = 1;</code>
     */
    public com.google.protobuf.ByteString
            getResultBytes() {
        Object ref = result_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (String) ref);
            result_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
            return true;
        if (isInitialized == 0)
            return false;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        if (!getResultBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, result_);
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;

        size = 0;
        if (!getResultBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, result_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrpcTestService_Response_String)) {
            return super.equals(obj);
        }
        GrpcTestService_Response_String other = (GrpcTestService_Response_String) obj;

        boolean result = true;
        result = result && getResult()
            .equals(other.getResult());
        result = result && unknownFields.equals(other.unknownFields);
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getResult().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static GrpcTestService_Response_String parseFrom(
                                                            java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static GrpcTestService_Response_String parseFrom(
                                                            java.nio.ByteBuffer data,
                                                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static GrpcTestService_Response_String parseFrom(
                                                            com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static GrpcTestService_Response_String parseFrom(
                                                            com.google.protobuf.ByteString data,
                                                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static GrpcTestService_Response_String parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static GrpcTestService_Response_String parseFrom(
                                                            byte[] data,
                                                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static GrpcTestService_Response_String parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static GrpcTestService_Response_String parseFrom(
                                                            java.io.InputStream input,
                                                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static GrpcTestService_Response_String parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
    }

    public static GrpcTestService_Response_String parseDelimitedFrom(
                                                                     java.io.InputStream input,
                                                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static GrpcTestService_Response_String parseFrom(
                                                            com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static GrpcTestService_Response_String parseFrom(
                                                            com.google.protobuf.CodedInputStream input,
                                                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(GrpcTestService_Response_String prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
                                        BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code GrpcTestService_Response_String}
     */
    public static final class Builder extends
                                     com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                                                                                            implements
                                                                                            // @@protoc_insertion_point(builder_implements:GrpcTestService_Response_String)
                                                                                            GrpcTestService_Response_StringOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
            return GrpcTestServiceProto.internal_static_GrpcTestService_Response_String_descriptor;
        }

        protected FieldAccessorTable
                internalGetFieldAccessorTable() {
            return GrpcTestServiceProto.internal_static_GrpcTestService_Response_String_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    GrpcTestService_Response_String.class,
                    Builder.class);
        }

        // Construct using com.alipay.sofa.rpc.model.grpc.GrpcTestService_Response_String.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                        BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
            }
        }

        public Builder clear() {
            super.clear();
            result_ = "";

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
            return GrpcTestServiceProto.internal_static_GrpcTestService_Response_String_descriptor;
        }

        public GrpcTestService_Response_String getDefaultInstanceForType() {
            return GrpcTestService_Response_String.getDefaultInstance();
        }

        public GrpcTestService_Response_String build() {
            GrpcTestService_Response_String result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public GrpcTestService_Response_String buildPartial() {
            GrpcTestService_Response_String result = new GrpcTestService_Response_String(
                this);
            result.result_ = result_;
            onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(
                                com.google.protobuf.Descriptors.FieldDescriptor field,
                                Object value) {
            return (Builder) super.setField(field, value);
        }

        public Builder clearField(
                                  com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        public Builder clearOneof(
                                  com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        public Builder setRepeatedField(
                                        com.google.protobuf.Descriptors.FieldDescriptor field,
                                        int index, Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(
                                        com.google.protobuf.Descriptors.FieldDescriptor field,
                                        Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof GrpcTestService_Response_String) {
                return mergeFrom((GrpcTestService_Response_String) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(GrpcTestService_Response_String other) {
            if (other == GrpcTestService_Response_String.getDefaultInstance())
                return this;
            if (!other.getResult().isEmpty()) {
                result_ = other.result_;
                onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(
                                 com.google.protobuf.CodedInputStream input,
                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            GrpcTestService_Response_String parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (GrpcTestService_Response_String) e
                    .getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private Object result_ = "";

        /**
         * <code>string result = 1;</code>
         */
        public String getResult() {
            Object ref = result_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                result_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>string result = 1;</code>
         */
        public com.google.protobuf.ByteString
                getResultBytes() {
            Object ref = result_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
                result_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string result = 1;</code>
         */
        public Builder setResult(
                                 String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            result_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string result = 1;</code>
         */
        public Builder clearResult() {

            result_ = getDefaultInstance().getResult();
            onChanged();
            return this;
        }

        /**
         * <code>string result = 1;</code>
         */
        public Builder setResultBytes(
                                      com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            result_ = value;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(
                                              final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(
                                                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }

        // @@protoc_insertion_point(builder_scope:GrpcTestService_Response_String)
    }

    // @@protoc_insertion_point(class_scope:GrpcTestService_Response_String)
    private static final GrpcTestService_Response_String DEFAULT_INSTANCE;
    static {
        DEFAULT_INSTANCE = new GrpcTestService_Response_String();
    }

    public static GrpcTestService_Response_String getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GrpcTestService_Response_String> PARSER = new com.google.protobuf.AbstractParser<GrpcTestService_Response_String>() {
                                                                                                public GrpcTestService_Response_String parsePartialFrom(
                                                                                                                                                        com.google.protobuf.CodedInputStream input,
                                                                                                                                                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                                                                                    throws com.google.protobuf.InvalidProtocolBufferException {
                                                                                                    return new GrpcTestService_Response_String(
                                                                                                        input,
                                                                                                        extensionRegistry);
                                                                                                }
                                                                                            };

    public static com.google.protobuf.Parser<GrpcTestService_Response_String> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<GrpcTestService_Response_String> getParserForType() {
        return PARSER;
    }

    public GrpcTestService_Response_String getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
