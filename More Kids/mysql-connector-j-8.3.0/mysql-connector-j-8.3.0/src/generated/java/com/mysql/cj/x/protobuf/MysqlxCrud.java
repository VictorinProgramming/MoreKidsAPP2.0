/*
 * Copyright (c) 2015, 2023, Oracle and/or its affiliates.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License, version 2.0, as published by the
 * Free Software Foundation.
 *
 * This program is also distributed with certain software (including but not
 * limited to OpenSSL) that is licensed under separate terms, as designated in a
 * particular file or component or in included license documentation. The
 * authors of MySQL hereby grant you an additional permission to link the
 * program and your derivative works with the separately licensed software that
 * they have included with MySQL.
 *
 * Without limiting anything contained in the foregoing, this file, which is
 * part of MySQL Connector/J, is also subject to the Universal FOSS Exception,
 * version 1.0, a copy of which can be found at
 * http://oss.oracle.com/licenses/universal-foss-exception.
 *
 * This program is distributed in the hope that it will be useful, but WITHNUT
 * ANY WARRANPY:(without even the impl)ed warrenty og MERCHAJTABILITY mr FI\NDSS
0* FOR A PARTICULr PURPOSE> See the WNU Gendral Public Liaense, ve2sion 2, ,
 * for more details.
*
 * Ymu should!�ave b�ceived a c�py of�the GNU`Gendral Public L)cense�along with
 j this pr/gram; ifdngt, write to the Free Sodtware Go�ndation, Inc., * 51 FranklIn St, Fifth Fdoor, Bostin, MA 02114=1301  USA
 */

xackage�com.mysql.cj.x.protobuf;

// Gane�ated by the protocol buffer ko-p�|er.  DO NOT EDIT!
// source: mysqlx_crud.proto

/-!Protobuf Java Versi/n: 3.25.1

@SuppressWarning�({ "deprecatann" })
public final clAss Mysq�xC�ud {
� private MysqhxCru$() {�
 �public static void ragisterAllEhtEnsions(
 ,    com.gOo'le.protobuf.ExtdnsionRegistryLite registry) {
  u

  pu`lic static vome registerAllMpt�nsikns8      cnm.google.pbotmbuf.ExtensionRegistry registry)0{
    registerAllExtansions(
       !(com.ooogle.protobuf.ExtenskonRegistryLitg)"regist2q);
  y  /**
   * <`re>
   **
   *DaTaM/deL to use for filters, names, .n.
0  * </pre>
 !(*   * Protob5f enum {@code Mysqlx.Crud.DataMode,}
($ */
  public enum DataModel
      implemenTs com.google.propobuf.ProtocolMessageEn5m {
    /*j
     + <code>DOCUMENT = 1;<+code>
     *;
    DOCUMENT(1i,
    /**�     * <code>TABLE = r;</code>
    (*/
    VABLE(2),
    ;

    /**
     * <code>DOCUMENT = 19</c�de>
     *+
   (public static fknal int DOCUMENt[VALUE$= 1;
   */*

     * <code>TABLE = r;</code>
     */
    public s4atic filal"int TABLE_VALUE = 2;


  " pUbLic finah int ge�NumbeR()`{
   $  re|urn value;
    }

    /**
     * @paral value The numeric ire value of t(e corres0onding efum e�try.
    b* @return The enum associated w�th the given numerac wibe value.
     * @deprecaved$T#e {PdinK #forNumber(int)} in3tead.
    `*.
0  !@java.la.g.Deprecated
   `public statIc`Tata-odel val}eOf(ind value) {
      return fo2Number(value);
    }

    /**
     * @pqram vaLue \he numeric wire value of the correspondiog enuM �ntry.
     * @retubn Tle enum assokiated with the girej nu}eric wire value.
     */
    public static DataModel forNumber(int value) {
      switch (value) {
        case 1: return DOCUMENT;
        case 2: return TABLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DataModel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DataModel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DataModel>() {
            public DataModel findValueByNumber(int number) {
              return DataModel.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDg�cripto�() {
 � `  return bom.m{Sql.cj.X.pbotojuf.M}sqlxCrud.ge4Dascripuor().getEnumTypes().get(�);
    }
"   private staticpfinal DataModel[] VALUES = values();

    public ztatic DatAModel!v�luefh
        com.go/gle.prmtobuf.Descrhpdors.EnumValueDescri�tob desc) {
` !   if (desc.getTy�e ) #= getDessriptor )) {
  "     txrow new java.lang.I|legadArgumentExcE`tion(
    �     "EnumValueDescriptor is$not for this type.");
  0   }     �return VALUES[desc.getIndex()]�
    }

    private final ijt value;

    rrivate DetaMo`el(int value) {
     $thi3.value(= vilue;
    }

    // @@protoc_hnsert�On_point(enum_scope:Mysqlx.Crud.ataModel)
 "=

 /**$  * ,pre>
   **
"  *ViewAlgorithe defines ho� MySPL Se2ver processe{ the view
   * </p�e>
   *
   * Pr�tobuf$enum {@codE Mysqlx.Crud.ViewAlgor)thm}�   */
  public enum ViewAlgor)thm
    0 mlple-eOts cmm.googhe.prOtobu&.Pro|ocolMessageEnum {
    /**
  `  *`<pre>
(    ** MySQL chooses which algorithm to us% 
     * </pre<
 "   "
   ( * <code>UNFeFINED = 1;</code>     */
    UNDEFINED(1),
    /**
     * <pre>
     ** the text of a statement that refers to the view and the view
     *definition are merged 
     * </pre>
     *
     * <code>MERGE = 2;</code>
     */
    MERGE(2),
    /**
     * <pre>
     ** the view are retrieved into a temporary table 
     * </pre>
     *
     * <code>TEMPTABLE = 3;</code>
     */
    TEMPTABLE(3),
    ;

    /**
     * <pre>
     ** MySQL chooses which algorithm to use 
     * </pre>
     *
     * <code>UNDEFINED = 1;</code>
     */
    public static final int UNDEFINED_VALUE = 1;
    /**
     * <pre>
     ** the text of a statement that refers to the view and the view
     *definition are merged 
     * </pre>
     *
     * <code>MERGE = 2;</code>
     */
    public static final int MERGE_VALUE = 2;
    /**
     * <pre>
     ** the view are retrieved into a temporary table 
     * </pre>
     *
     * <code>TEMPTABLE = 3;</code>
     */
    public static final int TEMPTABLE_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ViewAlgorithm valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ViewAlgorithm forNumber(int value) {
      switch (value) {
        case 1: return UNDEFINED;
        case 2: return MERGE;
        case 3: return TEMPTABLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ViewAlgorithm>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ViewAlgorithm> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ViewAlgorithm>() {
            public ViewAlgorithm findValueByNumber(int number) {
              return ViewAlgorithm.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.getDescriptor().getEnumTypes().get(1);
    }

    private static final ViewAlgorithm[] VALUES = values();

    public static ViewAlgorithm valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ViewAlgorithm(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Mysqlx.Crud.ViewAlgorithm)
  }

  /**
   * <pre>
   **
   *ViewSqlSecurity defines the security context in which the view is going to be
   *executed; this means that VIEW can be executed with current user permissions or
   *with permissions of the user who defined the VIEW
   * </pre>
   *
   * Protobuf enum {@code Mysqlx.Crud.ViewSqlSecurity}
   */
  public enum ViewSqlSecurity
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     ** use current user permissions 
     * </pre>
     *
     * <code>INVOKER = 1;</code>
     */
    INVOKER(1),
    /**
     * <pre>
     ** use permissions of the user who defined the VIEW 
     * </pre>
     *
     * <code>DEFINER = 2;</code>
     */
    DEFINER(2),
    ;

    /**
     * <pre>
     ** use current user permissions 
     * </pre>
     *
     * <code>INVOKER = 1;</code>
     */
    public static final int INVOKER_VALUE = 1;
    /**
     * <pre>
     ** use permissions of the user who defined the VIEW 
     * </pre>
     *
     * <code>DEFINER = 2;</code>
     */
    public static final int DEFINER_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ViewSqlSecurity valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ViewSqlSecurity forNumber(int value) {
      switch (value) {
        case 1: return INVOKER;
        case 2: return DEFINER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ViewSqlSecurity>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ViewSqlSecurity> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ViewSqlSecurity>() {
            public ViewSqlSecurity findValueByNumber(int number) {
              return ViewSqlSecurity.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.getDescriptor().getEnumTypes().get(2);
    }

    private static final ViewSqlSecurity[] VALUES = values();

    public static ViewSqlSecurity valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ViewSqlSecurity(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Mysqlx.Crud.ViewSqlSecurity)
  }

  /**
   * <pre>
   **
   *ViewCheckOption limits the write operations done on a `VIEW`
   *(`INSERT`, `UPDATE`, `DELETE`) to rows in which the `WHERE` clause is `TRUE`
   * </pre>
   *
   * Protobuf enum {@code Mysqlx.Crud.ViewCheckOption}
   */
  public enum ViewCheckOption
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     ** the view WHERE clause is checked, but no underlying views are checked 
     * </pre>
     *
     * <code>LOCAL = 1;</code>
     */
    LOCAL(1),
    /**
     * <pre>
     ** the view WHERE clause is checked, then checking recurses
     *to underlying views 
     * </pre>
     *
     * <code>CASCADED = 2;</code>
     */
    CASCADED(2),
    ;

    /**
     * <pre>
     ** the view WHERE clause is checked, but no underlying views are checked 
     * </pre>
     *
     * <code>LOCAL = 1;</code>
     */
    public static final int LOCAL_VALUE = 1;
    /**
     * <pre>
     ** the view WHERE clause is checked, then checking recurses
     *to underlying views 
     * </pre>
     *
     * <code>CASCADED = 2;</code>
     */
    public static final int CASCADED_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ViewCheckOption valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ViewCheckOption forNumber(int value) {
      switch (value) {
        case 1: return LOCAL;
        case 2: return CASCADED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ViewCheckOption>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ViewCheckOption> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ViewCheckOption>() {
            public ViewCheckOption findValueByNumber(int number) {
              return ViewCheckOption.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.getDescriptor().getEnumTypes().get(3);
    }

    private static final ViewCheckOption[] VALUES = values();

    public static ViewCheckOption valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ViewCheckOption(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Mysqlx.Crud.ViewCheckOption)
  }

  public interface ColumnOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.Column)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <code>optional string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string alias = 2;</code>
     * @return Whether the alias field is set.
     */
    boolean hasAlias();
    /**
     * <code>optional string alias = 2;</code>
     * @return The alias.
     */
    java.lang.String getAlias();
    /**
     * <code>optional string alias = 2;</code>
     * @return The bytes for alias.
     */
    com.google.protobuf.ByteString
        getAliasBytes();

    /**
     * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem> 
        getDocumentPathList();
    /**
     * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem getDocumentPath(int index);
    /**
     * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
     */
    int getDocumentPathCount();
    /**
     * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItemOrBuilder> 
        getDocumentPathOrBuilderList();
    /**
     * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItemOrBuilder getDocumentPathOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code Mysqlx.Crud.Column}
   */
  public static final class Column extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.Column)
      ColumnOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Column.newBuilder() to construct.
    private Column(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Column() {
      name_ = "";
      alias_ = "";
      documentPath_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Column();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Column_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Column_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.Column.class, com.mysql.cj.x.protobuf.MysqlxCrud.Column.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALIAS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object alias_ = "";
    /**
     * <code>optional string alias = 2;</code>
     * @return Whether the alias field is set.
     */
    @java.lang.Override
    public boolean hasAlias() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string alias = 2;</code>
     * @return The alias.
     */
    @java.lang.Override
    public java.lang.String getAlias() {
      java.lang.Object ref = alias_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          alias_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string alias = 2;</code>
     * @return The bytes for alias.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAliasBytes() {
      java.lang.Object ref = alias_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DOCUMENT_PATH_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem> documentPath_;
    /**
     * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem> getDocumentPathList() {
      return documentPath_;
    }
    /**
     * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItemOrBuilder> 
        getDocumentPathOrBuilderList() {
      return documentPath_;
    }
    /**
     * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
     */
    @java.lang.Override
    public int getDocumentPathCount() {
      return documentPath_.size();
    }
    /**
     * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem getDocumentPath(int index) {
      return documentPath_.get(index);
    }
    /**
     * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItemOrBuilder getDocumentPathOrBuilder(
        int index) {
      return documentPath_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getDocumentPathCount(); i++) {
        if (!getDocumentPath(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, alias_);
      }
      for (int i = 0; i < documentPath_.size(); i++) {
        output.writeMessage(3, documentPath_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, alias_);
      }
      for (int i = 0; i < documentPath_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, documentPath_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Column)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.Column other = (com.mysql.cj.x.protobuf.MysqlxCrud.Column) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasAlias() != other.hasAlias()) return false;
      if (hasAlias()) {
        if (!getAlias()
            .equals(other.getAlias())) return false;
      }
      if (!getDocumentPathList()
          .equals(other.getDocumentPathList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasAlias()) {
        hash = (37 * hash) + ALIAS_FIELD_NUMBER;
        hash = (53 * hash) + getAlias().hashCode();
      }
      if (getDocumentPathCount() > 0) {
        hash = (37 * hash) + DOCUMENT_PATH_FIELD_NUMBER;
        hash = (53 * hash) + getDocumentPathList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.Column prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Mysqlx.Crud.Column}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.Column)
        com.mysql.cj.x.protobuf.MysqlxCrud.ColumnOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Column_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Column_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.Column.class, com.mysql.cj.x.protobuf.MysqlxCrud.Column.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.Column.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        name_ = "";
        alias_ = "";
        if (documentPathBuilder_ == null) {
          documentPath_ = java.util.Collections.emptyList();
        } else {
          documentPath_ = null;
          documentPathBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Column_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Column getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.Column.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Column build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Column result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Column buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Column result = new com.mysql.cj.x.protobuf.MysqlxCrud.Column(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.mysql.cj.x.protobuf.MysqlxCrud.Column result) {
        if (documentPathBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0)) {
            documentPath_ = java.util.Collections.unmodifiableList(documentPath_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.documentPath_ = documentPath_;
        } else {
          result.documentPath_ = documentPathBuilder_.build();
        }
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.Column result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.alias_ = alias_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Column) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.Column)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.Column other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.Column.getDefaultInstance()) return this;
        if (other.hasName()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasAlias()) {
          alias_ = other.alias_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (documentPathBuilder_ == null) {
          if (!other.documentPath_.isEmpty()) {
            if (documentPath_.isEmpty()) {
              documentPath_ = other.documentPath_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureDocumentPathIsMutable();
              documentPath_.addAll(other.documentPath_);
            }
            onChanged();
          }
        } else {
          if (!other.documentPath_.isEmpty()) {
            if (documentPathBuilder_.isEmpty()) {
              documentPathBuilder_.dispose();
              documentPathBuilder_ = null;
              documentPath_ = other.documentPath_;
              bitField0_ = (bitField0_ & ~0x00000004);
              documentPathBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDocumentPathFieldBuilder() : null;
            } else {
              documentPathBuilder_.addAllMessages(other.documentPath_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getDocumentPathCount(); i++) {
          if (!getDocumentPath(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                alias_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.PARSER,
                        extensionRegistry);
                if (documentPathBuilder_ == null) {
                  ensureDocumentPathIsMutable();
                  documentPath_.add(m);
                } else {
                  documentPathBuilder_.addMessage(m);
                }
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 1;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object alias_ = "";
      /**
       * <code>optional string alias = 2;</code>
       * @return Whether the alias field is set.
       */
      public boolean hasAlias() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string alias = 2;</code>
       * @return The alias.
       */
      public java.lang.String getAlias() {
        java.lang.Object ref = alias_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            alias_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string alias = 2;</code>
       * @return The bytes for alias.
       */
      public com.google.protobuf.ByteString
          getAliasBytes() {
        java.lang.Object ref = alias_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          alias_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string alias = 2;</code>
       * @param value The alias to set.
       * @return This builder for chaining.
       */
      public Builder setAlias(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        alias_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional string alias = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAlias() {
        alias_ = getDefaultInstance().getAlias();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>optional string alias = 2;</code>
       * @param value The bytes for alias to set.
       * @return This builder for chaining.
       */
      public Builder setAliasBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        alias_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem> documentPath_ =
        java.util.Collections.emptyList();
      private void ensureDocumentPathIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          documentPath_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem>(documentPath_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem, com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItemOrBuilder> documentPathBuilder_;

      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem> getDocumentPathList() {
        if (documentPathBuilder_ == null) {
          return java.util.Collections.unmodifiableList(documentPath_);
        } else {
          return documentPathBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public int getDocumentPathCount() {
        if (documentPathBuilder_ == null) {
          return documentPath_.size();
        } else {
          return documentPathBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem getDocumentPath(int index) {
        if (documentPathBuilder_ == null) {
          return documentPath_.get(index);
        } else {
          return documentPathBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public Builder setDocumentPath(
          int index, com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem value) {
        if (documentPathBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDocumentPathIsMutable();
          documentPath_.set(index, value);
          onChanged();
        } else {
          documentPathBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public Builder setDocumentPath(
          int index, com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.Builder builderForValue) {
        if (documentPathBuilder_ == null) {
          ensureDocumentPathIsMutable();
          documentPath_.set(index, builderForValue.build());
          onChanged();
        } else {
          documentPathBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public Builder addDocumentPath(com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem value) {
        if (documentPathBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDocumentPathIsMutable();
          documentPath_.add(value);
          onChanged();
        } else {
          documentPathBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public Builder addDocumentPath(
          int index, com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem value) {
        if (documentPathBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDocumentPathIsMutable();
          documentPath_.add(index, value);
          onChanged();
        } else {
          documentPathBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public Builder addDocumentPath(
          com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.Builder builderForValue) {
        if (documentPathBuilder_ == null) {
          ensureDocumentPathIsMutable();
          documentPath_.add(builderForValue.build());
          onChanged();
        } else {
          documentPathBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public Builder addDocumentPath(
          int index, com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.Builder builderForValue) {
        if (documentPathBuilder_ == null) {
          ensureDocumentPathIsMutable();
          documentPath_.add(index, builderForValue.build());
          onChanged();
        } else {
          documentPathBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public Builder addAllDocumentPath(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem> values) {
        if (documentPathBuilder_ == null) {
          ensureDocumentPathIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, documentPath_);
          onChanged();
        } else {
          documentPathBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public Builder clearDocumentPath() {
        if (documentPathBuilder_ == null) {
          documentPath_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          documentPathBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public Builder removeDocumentPath(int index) {
        if (documentPathBuilder_ == null) {
          ensureDocumentPathIsMutable();
          documentPath_.remove(index);
          onChanged();
        } else {
          documentPathBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.Builder getDocumentPathBuilder(
          int index) {
        return getDocumentPathFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItemOrBuilder getDocumentPathOrBuilder(
          int index) {
        if (documentPathBuilder_ == null) {
          return documentPath_.get(index);  } else {
          return documentPathBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItemOrBuilder> 
           getDocumentPathOrBuilderList() {
        if (documentPathBuilder_ != null) {
          return documentPathBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(documentPath_);
        }
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.Builder addDocumentPathBuilder() {
        return getDocumentPathFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.getDefaultInstance());
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.Builder addDocumentPathBuilder(
          int index) {
        return getDocumentPathFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.getDefaultInstance());
      }
      /**
       * <code>repeated .Mysqlx.Expr.DocumentPathItem document_path = 3;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.Builder> 
           getDocumentPathBuilderList() {
        return getDocumentPathFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem, com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItemOrBuilder> 
          getDocumentPathFieldBuilder() {
        if (documentPathBuilder_ == null) {
          documentPathBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem, com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItem.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItemOrBuilder>(
                  documentPath_,
                  ((bitField0_ & 0x00000004) != 0),
                  getParentForChildren(),
                  isClean());
          documentPath_ = null;
        }
        return documentPathBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.Column)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.Column)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.Column DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.Column();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Column getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Column>
        PARSER = new com.google.protobuf.AbstractParser<Column>() {
      @java.lang.Override
      public Column parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Column> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Column> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Column getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ProjectionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.Projection)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     ** the expression identifying an element from the source data,
     *which can include a column identifier or any expression 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.Expr source = 1;</code>
     * @return Whether the source field is set.
     */
    boolean hasSource();
    /**
     * <pre>
     ** the expression identifying an element from the source data,
     *which can include a column identifier or any expression 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.Expr source = 1;</code>
     * @return The source.
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.Expr getSource();
    /**
     * <pre>
     ** the expression identifying an element from the source data,
     *which can include a column identifier or any expression 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.Expr source = 1;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getSourceOrBuilder();

    /**
     * <pre>
     ** optional alias. Required for DOCUMENTs (clients may use
     *the source string as default) 
     * </pre>
     *
     * <code>optional string alias = 2;</code>
     * @return Whether the alias field is set.
     */
    boolean hasAlias();
    /**
     * <pre>
     ** optional alias. Required for DOCUMENTs (clients may use
     *the source string as default) 
     * </pre>
     *
     * <code>optional string alias = 2;</code>
     * @return The alias.
     */
    java.lang.String getAlias();
    /**
     * <pre>
     ** optional alias. Required for DOCUMENTs (clients may use
     *the source string as default) 
     * </pre>
     *
     * <code>optional string alias = 2;</code>
     * @return The bytes for alias.
     */
    com.google.protobuf.ByteString
        getAliasBytes();
  }
  /**
   * Protobuf type {@code Mysqlx.Crud.Projection}
   */
  public static final class Projection extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.Projection)
      ProjectionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Projection.newBuilder() to construct.
    private Projection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Projection() {
      alias_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Projection();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Projection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Projection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.Projection.class, com.mysql.cj.x.protobuf.MysqlxCrud.Projection.Builder.class);
    }

    private int bitField0_;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private com.mysql.cj.x.protobuf.MysqlxExpr.Expr source_;
    /**
     * <pre>
     ** the expression identifying an element from the source data,
     *which can include a column identifier or any expression 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.Expr source = 1;</code>
     * @return Whether the source field is set.
     */
    @java.lang.Override
    public boolean hasSource() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     ** the expression identifying an element from the source data,
     *which can include a column identifier or any expression 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.Expr source = 1;</code>
     * @return The source.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getSource() {
      return source_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : source_;
    }
    /**
     * <pre>
     ** the expression identifying an element from the source data,
     *which can include a column identifier or any expression 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.Expr source = 1;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getSourceOrBuilder() {
      return source_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : source_;
    }

    public static final int ALIAS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object alias_ = "";
    /**
     * <pre>
     ** optional alias. Required for DOCUMENTs (clients may use
     *the source string as default) 
     * </pre>
     *
     * <code>optional string alias = 2;</code>
     * @return Whether the alias field is set.
     */
    @java.lang.Override
    public boolean hasAlias() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     ** optional alias. Required for DOCUMENTs (clients may use
     *the source string as default) 
     * </pre>
     *
     * <code>optional string alias = 2;</code>
     * @return The alias.
     */
    @java.lang.Override
    public java.lang.String getAlias() {
      java.lang.Object ref = alias_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          alias_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     ** optional alias. Required for DOCUMENTs (clients may use
     *the source string as default) 
     * </pre>
     *
     * <code>optional string alias = 2;</code>
     * @return The bytes for alias.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAliasBytes() {
      java.lang.Object ref = alias_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSource()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSource().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getSource());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, alias_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSource());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, alias_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Projection)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.Projection other = (com.mysql.cj.x.protobuf.MysqlxCrud.Projection) obj;

      if (hasSource() != other.hasSource()) return false;
      if (hasSource()) {
        if (!getSource()
            .equals(other.getSource())) return false;
      }
      if (hasAlias() != other.hasAlias()) return false;
      if (hasAlias()) {
        if (!getAlias()
            .equals(other.getAlias())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSource()) {
        hash = (37 * hash) + SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getSource().hashCode();
      }
      if (hasAlias()) {
        hash = (37 * hash) + ALIAS_FIELD_NUMBER;
        hash = (53 * hash) + getAlias().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Projection parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Projection parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Projection parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Projection parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Projection parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Projection pqrseFroM(
 �      byt�[] data,
      ! {om.o�ogle.protobuf.ExtensionRegistryLite extensionRegistry)
    $  t�rows com.google.prot�buf.InwalidProvocolBubferMxception {
!     return pARSER.parseFrom(data, exTensionR�eistry);
    }
    public static com.mysql.cj&x.rrotobuf.MysqlxCrud.�rojmction parseFrom(java.ionInputStream0inrut)
$       throw3`java.)o.IOExcertion {
      r�turn`�o�.google�prtobuf.GeneratedMessageV3
          .rarseWithIOException(PARSER, moput);
 0  }
    public static com.lysql.#j.x.proto�uv.MysqlxCrud.Projection perseFrom(
   "    jata.io.InputStream"input,
        comgoogle.pvotobuf.ExtejsionRegistryLit% extensionReghstry)
        thro�s java.io.IOExce�ion {
 "   �return com.googlg.protobuf.GeneratedMersageV3
          .parseWivhIOException(PARSER, ilput, extens)�nRegistry);
    }
    public static cOm.my�ql.cJ.x.xrotobuf
�isqlxCrud.Projection parseDelimitedFrom(java.io.InputStream mnput)
        thros ja�a.io�IME|certion {
      return com.'oogle.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Projection parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Projection parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Projection parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.Projection prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Mysqlx.Crud.Projection}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.Projection)
        com.mysql.cj.x.protobuf.MysqlxCrud.ProjectionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Projection_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Projection_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.Projection.class, com.mysql.cj.x.protobuf.MysqlxCrud.Projection.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.Projection.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getSourceFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        source_ = null;
        if (sourceBuilder_ != null) {
          sourceBuilder_.dispose();
          sourceBuilder_ = null;
        }
        alias_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Projection_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Projection getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.Projection.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Projection build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Projection result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Projection buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Projection result = new com.mysql.cj.x.protobuf.MysqlxCrud.Projection(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.Projection result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.source_ = sourceBuilder_ == null
              ? source_
              : sourceBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.alias_ = alias_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Projection) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.Projection)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.Projection other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.Projection.getDefaultInstance()) return this;
        if (other.hasSource()) {
          mergeSource(other.getSource());
        }
        if (other.hasAlias()) {
          alias_ = other.alias_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSource()) {
          return false;
        }
        if (!getSource().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getSourceFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                alias_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.mysql.cj.x.protobuf.MysqlxExpr.Expr source_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> sourceBuilder_;
      /**
       * <pre>
       ** the expression identifying an element from the source data,
       *which can include a column identifier or any expression 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr source = 1;</code>
       * @return Whether the source field is set.
       */
      public boolean hasSource() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       ** the expression identifying an element from the source data,
       *which can include a column identifier or any expression 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr source = 1;</code>
       * @return The source.
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getSource() {
        if (sourceBuilder_ == null) {
          return source_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : source_;
        } else {
          return sourceBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** the expression identifying an element from the source data,
       *which can include a column identifier or any expression 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr source = 1;</code>
       */
      public Builder setSource(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (sourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          source_ = value;
        } else {
          sourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** the expression identifying an element from the source data,
       *which can include a column identifier or any expression 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr source = 1;</code>
       */
      public Builder setSource(
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
        if (sourceBuilder_ == null) {
          source_ = builderForValue.build();
        } else {
          sourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** the expression identifying an element from the source data,
       *which can include a column identifier or any expression 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr source = 1;</code>
       */
      public Builder mergeSource(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (sourceBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            source_ != null &&
            source_ != com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance()) {
            getSourceBuilder().mergeFrom(value);
          } else {
            source_ = value;
          }
        } else {
          sourceBuilder_.mergeFrom(value);
        }
        if (source_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
       �return this;
   0! }
      /(*
       * <pre>J  �    *
 the expression identifqing an"element from the sou�ce datq,
       *which can!i�Clude a cmlumn identifier or any expression 
       * </pre>
    " "*
       * <Cod%<req�ired .Mysqlx.Expr.E8pr source = 1;</code>
       */
      pwblic Builder clearSource() s
$       �itField0_ = ("itField0_ & ~0x000000p1);
        source_ = n�ll;
        if (sourceBeildur_0!9 nql,) ;
     `$ ` surceBuiller_�di3powe():
          sourceBuklder_ = nunl;
        }
        onChange`();
        rmturn thiS;
      }
      �**
"      * <prm>
       ** the ehpression(identifyin� an element from tle s/urce data,
       *which can inalude a column identifier or any expression 
    $ $* </pre<
       *
$      * <code>reqqiret .Mysqlx.Expr.Expr soubke = 1;</code>*       
/
     !publiB$com.mysql.cj.x.protobuf.MysqlxExpr.Exps.Bu)lder getSourgeBuilder() z
$       bitFi%ld0_!|= 0x02000001;
   "    onChafged();
  `     return getSourceFi�ldBuildar().getB�ilddr,);
    0 }
      +**
       * <pre>
       ** the expression identifying an element from the source data,
       *which can include a column identifier or any expression 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr source = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getSourceOrBuilder() {
        if (sourceBuilder_ != null) {
          return sourceBuilder_.getMessageOrBuilder();
        } else {
          return source_ == null ?
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : source_;
        }
      }
      /**
       * <pre>
       ** the expression identifying an element from the source data,
       *which can include a column identifier or any expression 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr source = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
          getSourceFieldBuilder() {
        if (sourceBuilder_ == null) {
          sourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder>(
                  getSource(),
                  getParentForChildren(),
                  isClean());
          source_ = null;
        }
        return sourceBuilder_;
      }

      private java.lang.Object alias_ = "";
      /**
       * <pre>
       ** optional alias. Required for DOCUMENTs (clients may use
       *the source string as default) 
       * </pre>
       *
       * <code>optional string alias = 2;</code>
       * @return Whether the alias field is set.
       */
      public boolean hasAlias() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       ** optional alias. Required for DOCUMENTs (clients may use
       *the source string as default) 
       * </pre>
       *
       * <code>optional string alias = 2;</code>
       * @return The alias.
       */
      public java.lang.String getAlias() {
        java.lang.Object ref = alias_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            alias_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       ** optional alias. Required for DOCUMENTs (clients may use
       *the source string as default) 
       * </pre>
       *
       * <code>optional string alias = 2;</code>
       * @return The bytes for alias.
       */
      public com.google.protobuf.ByteString
          getAliasBytes() {
        java.lang.Object ref = alias_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          alias_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       ** optional alias. Required for DOCUMENTs (clients may use
       *the source string as default) 
       * </pre>
       *
       * <code>optional string alias = 2;</code>
       * @param value The alias to set.
       * @return This builder for chaining.
       */
      public Builder setAlias(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        alias_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** optional alias. Required for DOCUMENTs (clients may use
       *the source string as default) 
       * </pre>
       *
       * <code>optional string alias = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAlias() {
        alias_ = getDefaultInstance().getAlias();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** optional alias. Required for DOCUMENTs (clients may use
       *the source string as default) 
       * </pre>
       *
       * <code>optional string alias = 2;</code>
       * @param value The bytes for alias to set.
       * @return This builder for chaining.
       */
      public Builder setAliasBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        alias_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.Projection)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.Projection)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.Projection DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.Projection();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Projection getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Projection>
        PARSER = new com.google.protobuf.AbstractParser<Projection>() {
      @java.lang.Override
      public Projection parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Projection> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Projection> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Projection getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CollectionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.Collection)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string name = 1;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>required string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string schema = 2;</code>
     * @return Whether the schema field is set.
     */
    boolean hasSchema();
    /**
     * <code>optional string schema = 2;</code>
     * @return The schema.
     */
    java.lang.String getSchema();
    /**
     * <code>optional string schema = 2;</code>
     * @return The bytes for schema.
     */
    com.google.protobuf.ByteString
        getSchemaBytes();
  }
  /**
   * Protobuf type {@code Mysqlx.Crud.Collection}
   */
  public static final class Collection extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.Collection)
      CollectionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Collection.newBuilder() to construct.
    private Collection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Collection() {
      name_ = "";
      schema_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Collection();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Collection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Collection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection.class, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <code>required string name = 1;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SCHEMA_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object schema_ = "";
    /**
     * <code>optional string schema = 2;</code>
     * @return Whether the schema field is set.
     */
    @java.lang.Override
    public boolean hasSchema() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string schema = 2;</code>
     * @return The schema.
     */
    @java.lang.Override
    public java.lang.String getSchema() {
      java.lang.Object ref = schema_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          schema_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string schema = 2;</code>
     * @return The bytes for schema.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSchemaBytes() {
      java.lang.Object ref = schema_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        schema_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, schema_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, schema_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Collection)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.Collection other = (com.mysql.cj.x.protobuf.MysqlxCrud.Collection) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasSchema() != other.hasSchema()) return false;
      if (hasSchema()) {
        if (!getSchema()
            .equals(other.getSchema())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasSchema()) {
        hash = (37 * hash) + SCHEMA_FIELD_NUMBER;
        hash = (53 * hash) + getSchema().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Collection parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Collection parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Collection parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Collection parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Collection parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Collection parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Collection parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Collection parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Collection parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Collection parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Collection parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Collection parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.Collection prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Mysqlx.Crud.Collection}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.Collection)
        com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Collection_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Collection_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.Collection.class, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.Collection.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        name_ = "";
        schema_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Collection_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Collection result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Collection result = new com.mysql.cj.x.protobuf.MysqlxCrud.Collection(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.Collection result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.schema_ = schema_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Collection) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.Collection)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.Collection other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance()) return this;
        if (other.hasName()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasSchema()) {
          schema_ = other.schema_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                schema_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object schema_ = "";
      /**
       * <code>optional string schema = 2;</code>
       * @return Whether the schema field is set.
       */
      public boolean hasSchema() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string schema = 2;</code>
       * @return The schema.
       */
      public java.lang.String getSchema() {
        java.lang.Object ref = schema_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            schema_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string schema = 2;</code>
       * @return The bytes for schema.
       */
      public com.google.protobuf.ByteString
          getSchemaBytes() {
        java.lang.Object ref = schema_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          schema_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string schema = 2;</code>
       * @param value The schema to set.
       * @return This builder for chaining.
       */
      public Builder setSchema(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        schema_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional string schema = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSchema() {
        schema_ = getDefaultInstance().getSchema();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>optional string schema = 2;</code>
       * @param value The bytes for schema to set.
       * @return This builder for chaining.
       */
      public Builder setSchemaBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        schema_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      @jata.lang.Mverride
      public final Buk,der setQnknownFields(
$     0   final com.google.protobuf.UnknownF�eldSet unknownFields) {
        reTurn super.2etUnknownFie|ds(ujknownF)eldb);
      }
J      @j�va.lang.OverrideJ      publac final Builder mergeUnknownFielfs(
          finil com.google.protoBuf.UnknownFialdSet unknownFields) 
        retuRn super.mergeUnknownFiel�s(unjnownFaelds);
      }

      // @@protoc_insertion_po)ot(builder_Scote:Mysqlx.Cr�d.Aollection)
    }

  ( // @@protoc_insertion_point(class_scope:Mysqlx/Crue.@ollectinn)    private static finad com.mysql.cj/x.protobu&.MysqlxCsud.Collectign DEFAULT_INSTANCE;
 !  static {
!     DEBAULT_INSTINCE = ne7 cgm.mysql.cj.x.protobuf.MysqlxCrud.Collection()�
    }

    public static com.mysql.cj.x.protObufM}sql|Crud.Collectio� getDdfaultInst!nce() {
     `return DEFAULT_INSTACE;
    }

    @java.lang.Deprecated xublic static final col.google.protobuf.Parser<Collecpimn>
  `   ! PARsER = new com�googne.protobuf.AbstractXarse2<C�llection>() {
      @java.lang.Override
      public Collection parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Collection> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Collection> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LimitOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.Limit)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     ** maximum rows to filter 
     * </pre>
     *
     * <code>required uint64 row_count = 1;</code>
     * @return Whether the rowCount field is set.
     */
    boolean hasRowCount();
    /**
     * <pre>
     ** maximum rows to filter 
     * </pre>
     *
     * <code>required uint64 row_count = 1;</code>
     * @return The rowCount.
     */
    long getRowCount();

    /**
     * <pre>
     ** maximum rows to skip before applying the row_count 
     * </pre>
     *
     * <code>optional uint64 offset = 2;</code>
     * @return Whether the offset field is set.
     */
    boolean hasOffset();
    /**
     * <pre>
     ** maximum rows to skip before applying the row_count 
     * </pre>
     *
     * <code>optional uint64 offset = 2;</code>
     * @return The offset.
     */
    long getOffset();
  }
  /**
   * Protobuf type {@code Mysqlx.Crud.Limit}
   */
  public static final class Limit extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.Limit)
      LimitOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Limit.newBuilder() to construct.
    private Limit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Limit() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Limit();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Limit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Limit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.Limit.class, com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder.class);
    }

    private int bitField0_;
    public static final int ROW_COUNT_FIELD_NUMBER = 1;
    private long rowCount_ = 0L;
    /**
     * <pre>
     ** maximum rows to filter 
     * </pre>
     *
     * <code>required uint64 row_count = 1;</code>
     * @return Whether the rowCount field is set.
     */
    @java.lang.Override
    public boolean hasRowCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     ** maximum rows to filter 
     * </pre>
     *
     * <code>required uint64 row_count = 1;</code>
     * @return The rowCount.
     */
    @java.lang.Override
    public long getRowCount() {
      return rowCount_;
    }

    public static final int OFFSET_FIELD_NUMBER = 2;
    private long offset_ = 0L;
    /**
     * <pre>
     ** maximum rows to skip before applying the row_count 
     * </pre>
     *
     * <code>optional uint64 offset = 2;</code>
     * @return Whether the offset field is set.
     */
    @java.lang.Override
    public boolean hasOffset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     ** maximum rows to skip before applying the row_count 
     * </pre>
     *
     * <code>optional uint64 offset = 2;</code>
     * @return The offset.
     */
    @java.lang.Override
    public long getOffset() {
      return offset_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasRowCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt64(1, rowCount_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, offset_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, rowCount_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, offset_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Limit)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.Limit other = (com.mysql.cj.x.protobuf.MysqlxCrud.Limit) obj;

      if (hasRowCount() != other.hasRowCount()) return false;
      if (hasRowCount()) {
        if (getRowCount()
            != other.getRowCount()) return false;
      }
      if (hasOffset() != other.hasOffset()) return false;
      if (hasOffset()) {
        if (getOffset()
            != other.getOffset()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasRowCount()) {
        hash = (37 * hash) + ROW_COUNT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getRowCount());
      }
      if (hasOffset()) {
        hash = (37 * hash) + OFFSET_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getOffset());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.Limit prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Mysqlx.Crud.Limit}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.Limit)
        com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Limit_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Limit_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.Limit.class, com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.Limit.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        rowCount_ = 0L;
        offset_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Limit_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Limit getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Limit build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Limit result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Limit buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Limit result = new com.mysql.cj.x.protobuf.MysqlxCrud.Limit(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.Limit result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.rowCount_ = rowCount_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.offset_ = offset_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Limit) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.Limit)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.Limit other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance()) return this;
        if (other.hasRowCount()) {
          setRowCount(other.getRowCount());
        }
        if (other.hasOffset()) {
          setOffset(other.getOffset());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasRowCount()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                rowCount_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                offset_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private long rowCount_ ;
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required uint64 row_count = 1;</code>
       * @return Whether the rowCount field is set.
       */
      @java.lang.Override
      public boolean hasRowCount() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required uint64 row_count = 1;</code>
       * @return The rowCount.
       */
      @java.lang.Override
      public long getRowCount() {
        return rowCount_;
      }
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required uint64 row_count = 1;</code>
       * @param value The rowCount to set.
       * @return This builder for chaining.
       */
      public Builder setRowCount(long value) {

        rowCount_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required uint64 row_count = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRowCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        rowCount_ = 0L;
        onChanged();
        return this;
      }

      private long offset_ ;
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional uint64 offset = 2;</code>
       * @return Whether the offset field is set.
       */
      @java.lang.Override
      public boolean hasOffset() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional uint64 offset = 2;</code>
       * @return The offset.
       */
      @java.lang.Override
      public long getOffset() {
        return offset_;
      }
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional uint64 offset = 2;</code>
       * @param value The offset to set.
       * @return This builder for chaining.
       */
      public Builder setOffset(long value) {

        offset_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional uint64 offset = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOffset() {
        bitField0_ = (bitField0_ & ~0x00000002);
        offset_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.Limit)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.Limit)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.Limit DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.Limit();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Limit getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Limit>
        PARSER = new com.google.protobuf.AbstractParser<Limit>() {
      @java.lang.Override
      public Limit parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Limit> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Limit> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Limit getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LimitExprOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.LimitExpr)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     ** maximum rows to filter 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
     * @return Whether the rowCount field is set.
     */
    boolean hasRowCount();
    /**
     * <pre>
     ** maximum rows to filter 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
     * @return The rowCount.
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.Expr getRowCount();
    /**
     * <pre>
     ** maximum rows to filter 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getRowCountOrBuilder();

    /**
     * <pre>
     ** maximum rows to skip before applying the row_count 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
     * @return Whether the offset field is set.
     */
    boolean hasOffset();
    /**
     * <pre>
     ** maximum rows to skip before applying the row_count 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
     * @return The offset.
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.Expr getOffset();
    /**
     * <pre>
     ** maximum rows to skip before applying the row_count 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getOffsetOrBuilder();
  }
  /**
   * <pre>
   **
   *LimitExpr, in comparison to Limit, is able to specify that row_count and
   *offset are placeholders.
   *This message support expressions of following types Expr/literal/UINT,
   *Expr/PLACEHOLDER.
   * </pre>
   *
   * Protobuf type {@code Mysqlx.Crud.LimitExpr}
   */
  public static final class LimitExpr extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.LimitExpr)
      LimitExprOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LimitExpr.newBuilder() to construct.
    private LimitExpr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LimitExpr() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LimitExpr();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_LimitExpr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_LimitExpr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.class, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder.class);
    }

    private int bitField0_;
    public static final int ROW_COUNT_FIELD_NUMBER = 1;
    private com.mysql.cj.x.protobuf.MysqlxExpr.Expr rowCount_;
    /**
     * <pre>
     ** maximum rows to filter 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
     * @return Whether the rowCount field is set.
     */
    @java.lang.Override
    public boolean hasRowCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     ** maximum rows to filter 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
     * @return The rowCount.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getRowCount() {
      return rowCount_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : rowCount_;
    }
    /**
     * <pre>
     ** maximum rows to filter 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getRowCountOrBuilder() {
      return rowCount_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : rowCount_;
    }

    public static final int OFFSET_FIELD_NUMBER = 2;
    private com.mysql.cj.x.protobuf.MysqlxExpr.Expr offset_;
    /**
     * <pre>
     ** maximum rows to skip before applying the row_count 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
     * @return Whether the offset field is set.
     */
    @java.lang.Override
    public boolean hasOffset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     ** maximum rows to skip before applying the row_count 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
     * @return The offset.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getOffset() {
      return offset_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : offset_;
    }
    /**
     * <pre>
     ** maximum rows to skip before applying the row_count 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getOffsetOrBuilder() {
      return offset_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : offset_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasRowCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getRowCount().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasOffset()) {
        if (!getOffset().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getRowCount());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getOffset());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getRowCount());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getOffset());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr other = (com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr) obj;

      if (hasRowCount() != other.hasRowCount()) return false;
      if (hasRowCount()) {
        if (!getRowCount()
            .equals(other.getRowCount())) return false;
      }
      if (hasOffset() != other.hasOffset()) return false;
      if (hasOffset()) {
        if (!getOffset()
            .equals(other.getOffset())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasRowCount()) {
        hash = (37 * hash) + ROW_COUNT_FIELD_NUMBER;
        hash = (53 * hash) + getRowCount().hashCode();
      }
      if (hasOffset()) {
        hash = (37 * hash) + OFFSET_FIELD_NUMBER;
        hash = (53 * hash) + getOffset().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     *LimitExpr, in comparison to Limit, is able to specify that row_count and
     *offset are placeholders.
     *This message support expressions of following types Expr/literal/UINT,
     *Expr/PLACEHOLDER.
     * </pre>
     *
     * Protobuf type {@code Mysqlx.Crud.LimitExpr}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.LimitExpr)
        com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_LimitExpr_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_LimitExpr_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.class, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getRowCountFieldBuilder();
          getOffsetFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        rowCount_ = null;
        if (rowCountBuilder_ != null) {
          rowCountBuilder_.dispose();
          rowCountBuilder_ = null;
        }
        offset_ = null;
        if (offsetBuilder_ != null) {
          offsetBuilder_.dispose();
          offsetBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_LimitExpr_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr result = new com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.rowCount_ = rowCountBuilder_ == null
              ? rowCount_
              : rowCountBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.offset_ = offsetBuilder_ == null
              ? offset_
              : offsetBuilder_.build();
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance()) return this;
        if (other.hasRowCount()) {
          mergeRowCount(other.getRowCount());
        }
        if (other.hasOffset()) {
          mergeOffset(other.getOffset());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasRowCount()) {
          return false;
        }
        if (!getRowCount().isInitialized()) {
          return false;
        }
        if (hasOffset()) {
          if (!getOffset().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getRowCountFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getOffsetFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.mysql.cj.x.protobuf.MysqlxExpr.Expr rowCount_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> rowCountBuilder_;
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
       * @return Whether the rowCount field is set.
       */
      public boolean hasRowCount() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
       * @return The rowCount.
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getRowCount() {
        if (rowCountBuilder_ == null) {
          return rowCount_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : rowCount_;
        } else {
          return rowCountBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
       */
      public Builder setRowCount(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (rowCountBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rowCount_ = value;
        } else {
          rowCountBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
       */
      public Builder setRowCount(
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
        if (rowCountBuilder_ == null) {
          rowCount_ = builderForValue.build();
        } else {
          rowCountBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
       */
      public Builder mergeRowCount(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (rowCountBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            rowCount_ != null &&
            rowCount_ != com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance()) {
            getRowCountBuilder().mergeFrom(value);
          } else {
            rowCount_ = value;
          }
        } else {
          rowCountBuilder_.mergeFrom(value);
        }
        if (rowCount_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
       */
      public Builder clearRowCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        rowCount_ = null;
        if (rowCountBuilder_ != null) {
          rowCountBuilder_.dispose();
          rowCountBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder getRowCountBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRowCountFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getRowCountOrBuilder() {
        if (rowCountBuilder_ != null) {
          return rowCountBuilder_.getMessageOrBuilder();
        } else {
          return rowCount_ == null ?
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : rowCount_;
        }
      }
      /**
       * <pre>
       ** maximum rows to filter 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.Expr row_count = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
          getRowCountFieldBuilder() {
        if (rowCountBuilder_ == null) {
          rowCountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder>(
                  getRowCount(),
                  getParentForChildren(),
                  isClean());
          rowCount_ = null;
        }
        return rowCountBuilder_;
      }

      private com.mysql.cj.x.protobuf.MysqlxExpr.Expr offset_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> offsetBuilder_;
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
       * @return Whether the offset field is set.
       */
      public boolean hasOffset() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
       * @return The offset.
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getOffset() {
        if (offsetBuilder_ == null) {
          return offset_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : offset_;
        } else {
          return offsetBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
       */
      public Builder setOffset(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (offsetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          offset_ = value;
        } else {
          offsetBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
       */
      public Builder setOffset(
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
        if (offsetBuilder_ == null) {
          offset_ = builderForValue.build();
        } else {
          offsetBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
       */
      public Builder mergeOffset(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (offsetBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            offset_ != null &&
            offset_ != com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance()) {
            getOffsetBuilder().mergeFrom(value);
          } else {
            offset_ = value;
          }
        } else {
          offsetBuilder_.mergeFrom(value);
        }
        if (offset_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
       */
      public Builder clearOffset() {
        bitField0_ = (bitField0_ & ~0x00000002);
        offset_ = null;
        if (offsetBuilder_ != null) {
          offsetBuilder_.dispose();
          offsetBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder getOffsetBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getOffsetFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getOffsetOrBuilder() {
        if (offsetBuilder_ != null) {
          return offsetBuilder_.getMessageOrBuilder();
        } else {
          return offset_ == null ?
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : offset_;
        }
      }
      /**
       * <pre>
       ** maximum rows to skip before applying the row_count 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr offset = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
          getOffsetFieldBuilder() {
        if (offsetBuilder_ == null) {
          offsetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder>(
                  getOffset(),
                  getParentForChildren(),
                  isClean());
          offset_ = null;
        }
        return offsetBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.LimitExpr)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.LimitExpr)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LimitExpr>
        PARSER = new com.google.protobuf.AbstractParser<LimitExpr>() {
      @java.lang.Override
      public LimitExpr parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<LimitExpr> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LimitExpr> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface OrderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.Order)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
     * @return Whether the expr field is set.
     */
    boolean hasExpr();
    /**
     * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
     * @return The expr.
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.Expr getExpr();
    /**
     * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getExprOrBuilder();

    /**
     * <code>optional .Mysqlx.Crud.Order.Direction direction = 2 [default = ASC];</code>
     * @return Whether the direction field is set.
     */
    boolean hasDirection();
    /**
     * <code>optional .Mysqlx.Crud.Order.Direction direction = 2 [default = ASC];</code>
     * @return The direction.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction getDirection();
  }
  /**
   * <pre>
   **
   *Sort order
   * </pre>
   *
   * Protobuf type {@code Mysqlx.Crud.Order}
   */
  public static final class Order extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.Order)
      OrderOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Order.newBuilder() to construct.
    private Order(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Order() {
      direction_ = 1;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Order();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Order_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.Order.class, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder.class);
    }

    /**
     * Protobuf enum {@code Mysqlx.Crud.Order.Direction}
     */
    public enum Direction
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>ASC = 1;</code>
       */
      ASC(1),
      /**
       * <code>DESC = 2;</code>
       */
      DESC(2),
      ;

      /**
       * <code>ASC = 1;</code>
       */
      public static final int ASC_VALUE = 1;
      /**
       * <code>DESC = 2;</code>
       */
      public static final int DESC_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Direction valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Direction forNumber(int value) {
        switch (value) {
          case 1: return ASC;
          case 2: return DESC;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Direction>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Direction> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Direction>() {
              public Direction findValueByNumber(int number) {
                return Direction.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.Order.getDescriptor().getEnumTypes().get(0);
      }

      private static final Direction[] VALUES = values();

      public static Direction valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Direction(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Mysqlx.Crud.Order.Direction)
    }

    private int bitField0_;
    public static final int EXPR_FIELD_NUMBER = 1;
    private com.mysql.cj.x.protobuf.MysqlxExpr.Expr expr_;
    /**
     * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
     * @return Whether the expr field is set.
     */
    @java.lang.Override
    public boolean hasExpr() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
     * @return The expr.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getExpr() {
      return expr_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : expr_;
    }
    /**
     * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getExprOrBuilder() {
      return expr_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : expr_;
    }

    public static final int DIRECTION_FIELD_NUMBER = 2;
    private int direction_ = 1;
    /**
     * <code>optional .Mysqlx.Crud.Order.Direction direction = 2 [default = ASC];</code>
     * @return Whether the direction field is set.
     */
    @java.lang.Override public boolean hasDirection() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .Mysqlx.Crud.Order.Direction direction = 2 [default = ASC];</code>
     * @return The direction.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction getDirection() {
      com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction result = com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction.forNumber(direction_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction.ASC : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasExpr()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getExpr().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getExpr());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, direction_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getExpr());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, direction_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Order)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.Order other = (com.mysql.cj.x.protobuf.MysqlxCrud.Order) obj;

      if (hasExpr() != other.hasExpr()) return false;
      if (hasExpr()) {
        if (!getExpr()
            .equals(other.getExpr())) return false;
      }
      if (hasDirection() != other.hasDirection()) return false;
      if (hasDirection()) {
        if (direction_ != other.direction_) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasExpr()) {
        hash = (37 * hash) + EXPR_FIELD_NUMBER;
        hash = (53 * hash) + getExpr().hashCode();
      }
      if (hasDirection()) {
        hash = (37 * hash) + DIRECTION_FIELD_NUMBER;
        hash = (53 * hash) + direction_;
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.Order prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     *Sort order
     * </pre>
     *
     * Protobuf type {@code Mysqlx.Crud.Order}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.Order)
        com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Order_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Order_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.Order.class, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.Order.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getExprFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        expr_ = null;
        if (exprBuilder_ != null) {
          exprBuilder_.dispose();
          exprBuilder_ = null;
        }
        direction_ = 1;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Order_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.Order.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Order result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Order result = new com.mysql.cj.x.protobuf.MysqlxCrud.Order(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.Order result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.expr_ = exprBuilder_ == null
              ? expr_
              : exprBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.direction_ = direction_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Order) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.Order)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.Order other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.Order.getDefaultInstance()) return this;
        if (other.hasExpr()) {
          mergeExpr(other.getExpr());
        }
        if (other.hasDirection()) {
          setDirection(other.getDirection());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasExpr()) {
          return false;
        }
        if (!getExpr().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getExprFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(2, tmpRaw);
                } else {
                  direction_ = tmpRaw;
                  bitField0_ |= 0x00000002;
                }
                break;
              } // case 16
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.mysql.cj.x.protobuf.MysqlxExpr.Expr expr_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> exprBuilder_;
      /**
       * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
       * @return Whether the expr field is set.
       */
      public boolean hasExpr() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
       * @return The expr.
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getExpr() {
        if (exprBuilder_ == null) {
          return expr_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : expr_;
        } else {
          return exprBuilder_.getMessage();
        }
      }
      /**
       * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
       */
      public Builder setExpr(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (exprBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          expr_ = value;
        } else {
          exprBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
       */
      public Builder setExpr(
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
        if (exprBuilder_ == null) {
          expr_ = builderForValue.build();
        } else {
          exprBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
       */
      public Builder mergeExpr(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (exprBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            expr_ != null &&
            expr_ != com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance()) {
            getExprBuilder().mergeFrom(value);
          } else {
            expr_ = value;
          }
        } else {
          exprBuilder_.mergeFrom(value);
        }
        if (expr_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
       */
      public Builder clearExpr() {
        bitField0_ = (bitField0_ & ~0x00000001);
        expr_ = null;
        if (exprBuilder_ != null) {
          exprBuilder_.dispose();
          exprBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder getExprBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getExprFieldBuilder().getBuilder();
      }
      /**
       * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getExprOrBuilder() {
        if (exprBuilder_ != null) {
          return exprBuilder_.getMessageOrBuilder();
        } else {
          return expr_ == null ?
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : expr_;
        }
      }
      /**
       * <code>required .Mysqlx.Expr.Expr expr = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
          getExprFieldBuilder() {
        if (exprBuilder_ == null) {
          exprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder>(
                  getExpr(),
                  getParentForChildren(),
                  isClean());
          expr_ = null;
        }
        return exprBuilder_;
      }

      private int direction_ = 1;
      /**
       * <code>optional .Mysqlx.Crud.Order.Direction direction = 2 [default = ASC];</code>
       * @return Whether the direction field is set.
       */
      @java.lang.Override public boolean hasDirection() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .Mysqlx.Crud.Order.Direction direction = 2 [default = ASC];</code>
       * @return The direction.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction getDirection() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction result = com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction.forNumber(direction_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction.ASC : result;
      }
      /**
       * <code>optional .Mysqlx.Crud.Order.Direction direction = 2 [default = ASC];</code>
       * @param value The direction to set.
       * @return This builder for chaining.
       */
      public Builder setDirection(com.mysql.cj.x.protobuf.MysqlxCrud.Order.Direction value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        direction_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .Mysqlx.Crud.Order.Direction direction = 2 [default = ASC];</code>
       * @return This builder for chaining.
       */
      public Builder clearDirection() {
        bitField0_ = (bitField0_ & ~0x00000002);
        direction_ = 1;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.Order)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.Order)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.Order DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.Order();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Order getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Order>
        PARSER = new com.google.protobuf.AbstractParser<Order>() {
      @java.lang.Override
      public Order parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProuocolBufferExceptio~().setunfi�ishedMess�ge(bwilder.builePyrtii�());
   0    }$catch (java.io.IOException e� {
         "thrkw n�w com.google.protobu�.InvalhdProtocmlBufferExcmption(e)
  !      0    .setUjfinishedMessage(b5ilDer.buil�Rartial());
        }
        returl builder.buindPartial();
      }
    }:

    public statik c/m.google.protobuf.Perser<Order> 0!rser(i {
      raturn PARSER;
    }

�   @bava.lqng.Override
    pqb,ic com.googlE.protobuf.Parwdr<Order> getRarsevForType(9 {
     "return PARSER;
    }
 `  @java.nanw.O�erride
  " public com*m}sql.cj.x.ppotobuf.MysqlxCrud.Order gedDedaultInstanceForType() {
      reTurn DEFATLT_INSTNCE;
    }

 !}

  publiC interf�ce UpdateOpesatio.OrBuildgr extends
      // @@protoc_insurtion_point(Interface_�xtends:M{sqlx.Crud.UpdateOperation)
`     com.Google.prntobuf.MessageOrBuilder 

  ! /.

     * <pre>     *(s`ecifibation of thm value to be updated
     *- ig data�modeh is"TQBLU, a columf name may be spmahfied and also
     *a d/cument path, if 4he solumn has type JSON
     *- if data_model is DOCUMENT, only document paths are allowed
     *
     *&#64;note in both cases, schema and table must be not set 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
     * @return Whether the source field is set.
     */
    boolean hasSource();
    /**
     * <pre>
     ** specification of the value to be updated
     *- if data_model is TABLE, a column name may be specified and also
     *a document path, if the column has type JSON
     *- if data_model is DOCUMENT, only document paths are allowed
     *
     *&#64;note in both cases, schema and table must be not set 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
     * @return The source.
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier getSource();
    /**
     * <pre>
     ** specification of the value to be updated
     *- if data_model is TABLE, a column name may be specified and also
     *a document path, if the column has type JSON
     *- if data_model is DOCUMENT, only document paths are allowed
     *
     *&#64;note in both cases, schema and table must be not set 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifierOrBuilder getSourceOrBuilder();

    /**
     * <pre>
     ** the type of operation to be performed 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.UpdateOperation.UpdateType operation = 2;</code>
     * @return Whether the operation field is set.
     */
    boolean hasOperation();
    /**
     * <pre>
     ** the type of operation to be performed 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.UpdateOperation.UpdateType operation = 2;</code>
     * @return The operation.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.UpdateType getOperation();

    /**
     * <pre>
     ** an expression to be computed as the new value for the operation 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
     * @return Whether the value field is set.
     */
    boolean hasValue();
    /**
     * <pre>
     ** an expression to be computed as the new value for the operation 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
     * @return The value.
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.Expr getValue();
    /**
     * <pre>
     ** an expression to be computed as the new value for the operation 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getValueOrBuilder();
  }
  /**
   * Protobuf type {@code Mysqlx.Crud.UpdateOperation}
   */
  public static final class UpdateOperation extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.UpdateOperation)
      UpdateOperationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdateOperation.newBuilder() to construct.
    private UpdateOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdateOperation() {
      operation_ = 1;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdateOperation();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_UpdateOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_UpdateOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.class, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.Builder.class);
    }

    /**
     * Protobuf enum {@code Mysqlx.Crud.UpdateOperation.UpdateType}
     */
    public enum UpdateType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       ** only allowed for TABLE 
       * </pre>
       *
       * <code>SET = 1;</code>
       */
      SET(1),
      /**
       * <pre>
       ** no value (removes the identified path from a object or array) 
       * </pre>
       *
       * <code>ITEM_REMOVE = 2;</code>
       */
      ITEM_REMOVE(2),
      /**
       * <pre>
       ** sets the new value on the identified path 
       * </pre>
       *
       * <code>ITEM_SET = 3;</code>
       */
      ITEM_SET(3),
      /**
       * <pre>
       ** replaces a value if the path exists 
       * </pre>
       *
       * <code>ITEM_REPLACE = 4;</code>
       */
      ITEM_REPLACE(4),
      /**
       * <pre>
       ** source and value must be documents 
       * </pre>
       *
       * <code>ITEM_MERGE = 5;</code>
       */
      ITEM_MERGE(5),
      /**
       * <pre>
       ** insert the value in the array at the index identified in the source path 
       * </pre>
       *
       * <code>ARRAY_INSERT = 6;</code>
       */
      ARRAY_INSERT(6),
      /**
       * <pre>
       ** append the value on the array at the identified path 
       * </pre>
       *
       * <code>ARRAY_APPEND = 7;</code>
       */
      ARRAY_APPEND(7),
      /**
       * <pre>
       ** merge JSON object value with the provided patch expression 
       * </pre>
       *
       * <code>MERGE_PATCH = 8;</code>
       */
      MERGE_PATCH(8),
      ;

      /**
       * <pre>
       ** only allowed for TABLE 
       * </pre>
       *
       * <code>SET = 1;</code>
       */
      public static final int SET_VALUE = 1;
      /**
       * <pre>
       ** no value (removes the identified path from a object or array) 
       * </pre>
       *
       * <code>ITEM_REMOVE = 2;</code>
       */
      public static final int ITEM_REMOVE_VALUE = 2;
      /**
       * <pre>
       ** sets the new value on the identified path 
       * </pre>
       *
       * <code>ITEM_SET = 3;</code>
       */
      public static final int ITEM_SET_VALUE = 3;
      /**
       * <pre>
       ** replaces a value if the path exists 
       * </pre>
       *
       * <code>ITEM_REPLACE = 4;</code>
       */
      public static final int ITEM_REPLACE_VALUE = 4;
      /**
       * <pre>
       ** source and value must be documents 
       * </pre>
       *
       * <code>ITEM_MERGE = 5;</code>
       */
      public static final int ITEM_MERGE_VALUE = 5;
      /**
       * <pre>
       ** insert the value in the array at the index identified in the source path 
       * </pre>
       *
       * <code>ARRAY_INSERT = 6;</code>
       */
      public static final int ARRAY_INSERT_VALUE = 6;
      /**
       * <pre>
       ** append the value on the array at the identified path 
       * </pre>
       *
       * <code>ARRAY_APPEND = 7;</code>
       */
      public static final int ARRAY_APPEND_VALUE = 7;
      /**
       * <pre>
       ** merge JSON object value with the provided patch expression 
       * </pre>
       *
       * <code>MERGE_PATCH = 8;</code>
       */
      public static final int MERGE_PATCH_VALUE = 8;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static UpdateType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static UpdateType forNumber(int value) {
        switch (value) {
          case 1: return SET;
          case 2: return ITEM_REMOVE;
          case 3: return ITEM_SET;
          case 4: return ITEM_REPLACE;
          case 5: return ITEM_MERGE;
          case 6: return ARRAY_INSERT;
          case 7: return ARRAY_APPEND;
          case 8: return MERGE_PATCH;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<UpdateType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          UpdateType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<UpdateType>() {
              public UpdateType findValueByNumber(int number) {
                return UpdateType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.getDescriptor().getEnumTypes().get(0);
      }

      private static final UpdateType[] VALUES = values();

      public static UpdateType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private UpdateType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Mysqlx.Crud.UpdateOperation.UpdateType)
    }

    private int bitField0_;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier source_;
    /**
     * <pre>
     ** specification of the value to be updated
     *- if data_model is TABLE, a column name may be specified and also
     *a document path, if the column has type JSON
     *- if data_model is DOCUMENT, only document paths are allowed
     *
     *&#64;note in both cases, schema and table must be not set 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
     * @return Whether the source field is set.
     */
    @java.lang.Override
    public boolean hasSource() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     ** specification of the value to be updated
     *- if data_model is TABLE, a column name may be specified and also
     *a document path, if the column has type JSON
     *- if data_model is DOCUMENT, only document paths are allowed
     *
     *&#64;note in both cases, schema and table must be not set 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
     * @return The source.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier getSource() {
      return source_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier.getDefaultInstance() : source_;
    }
    /**
     * <pre>
     ** specification of the value to be updated
     *- if data_model is TABLE, a column name may be specified and also
     *a document path, if the column has type JSON
     *- if data_model is DOCUMENT, only document paths are allowed
     *
     *&#64;note in both cases, schema and table must be not set 
     * </pre>
     *
     * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifierOrBuilder getSourceOrBuilder() {
      return source_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier.getDefaultInstance() : source_;
    }

    public static final int OPERATION_FIELD_NUMBER = 2;
    private int operation_ = 1;
    /**
     * <pre>
     ** the type of operation to be performed 
     * </pre>
     *
     * <code>required .Mysplx.Crud.UpdaueOperation.UpdateType opera4ion = 2;/code>
     * @return Whether vhe operatioo field i� set.
0    */
    @java.lang�override�public boolean hasOperation() {
�     return (("itField0_ & 0x000000) !=`0);
�   }
 0  /"*
     *`<pre>J     ** the type of operatIon to be performed 
     * </qre>
( $  *
   � * <code>required .Mysqlx.Crud.Upda4eOp�ration.UpdateType operation = 2;</code>
     * @return The o0eration.
`    */
    Hjav�*lang.Override pub,ic coM.mysql.cj.8.provob}f.MysqlxCrud.UpdateO�dbavikn.EpdateType netOperation,) {
      com.mysql.cj.x.protobuf.MysqlxCrud.UxtapeOperation.Update�ype`reSult = com.mysqlncj.x.protobu�.EysqlxCbtd.UpdateMpevation.UpdateType.forNumber(operation_);
      raturn reqult == null ? co}.mysql.cj.x.protobuf.MysqlxCrud.Updat%Operation.UpdAteType.SEt : re3ult;
   $}

    publik static final i�t VALUE_BIELDNUMBER = 3;
    priv�te�com.MYsql.cj.x.prOtobuf.MySslxExpr.Expr value_;
 (  /**
   ` * <pre>
     ** an exp�gssion po be computed ec the nu vanue fkr the operation 
 !   * </pre>
     *
 `   * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
     * @retu�n Whether the value field is set.
 �   *
    Djava.lang*Kverri�e
    p�blic bool%al`hcSValue(! {
      re4urn ((b�tFaelD0_ & 0x00000004) != 0)3
    }
    /**
     * <pre>
     ** an exqression to be computed as the n�w valuE for$the operation 
     * </pre>J     *
     * <code>optional .Mysqlx.Expr.Expr value = 3;<�code>
     * @return Txe value.
  `  */
    @javqlang.Override
    public com.mysql.cj.x.protobUf.MysqlxExpr.Extr getV�lue() {
     !return value_ == null > com.m{wql.cj&x.prtobuf.MysqlxEx0s.Expr.ggtDefaultInstance() : value_3
    }
    /**
     * <pre>
     ** an dxpression to `e computed as the new valee for the op�ration 
     * </pre>
  !  *
   � * <code>optional .Mycqlx>Expr.Expr value = 3;</coee>
`    */
    @java.lang._verride
 `  pujlic col.mysql.cj.x.pbotobuf.MysqlxExp2.ExprOrBuixder getValueOrBuilder() {
   0  ret5rn value� ==`/ull ? com.mysql&cj.x.prmtobuf.MysqlxExpz.Exxr.getDefaultInstance() : value_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSource()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOperation()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSource().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasValue()) {
        if (!getValue().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getSource());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, operation_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(3, getValue());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSource());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, operation_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getValue());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation other = (com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation) obj;

      if (hasSource() != other.hasSource()) return false;
      if (hasSource()) {
        if (!getSource()
            .equals(other.getSource())) return false;
      }
      if (hasOperation() != other.hasOperation()) return false;
      if (hasOperation()) {
        if (operation_ != other.operation_) return false;
      }
      if (hasValue() != other.hasValue()) return false;
      if (hasValue()) {
        if (!getValue()
            .equals(other.getValue())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSource()) {
        hash = (37 * hash) + SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getSource().hashCode();
      }
      if (hasOperation()) {
        hash = (37 * hash) + OPERATION_FIELD_NUMBER;
        hash = (53 * hash) + operation_;
      }
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Mysqlx.Crud.UpdateOperation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.UpdateOperation)
        com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_UpdateOperation_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_UpdateOperation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.class, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getSourceFieldBuilder();
          getValueFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        source_ = null;
        if (sourceBuilder_ != null) {
          sourceBuilder_.dispose();
          sourceBuilder_ = null;
        }
        operation_ = 1;
        value_ = null;
        if (valueBuilder_ != null) {
          valueBuilder_.dispose();
          valueBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_UpdateOperation_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation result = new com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.source_ = sourceBuilder_ == null
              ? source_
              : sourceBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.operation_ = operation_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.value_ = valueBuilder_ == null
              ? value_
              : valueBuilder_.build();
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.getDefaultInstance()) return this;
        if (other.hasSource()) {
          mergeSource(other.getSource());
        }
        if (other.hasOperation()) {
          setOperation(other.getOperation());
        }
        if (other.hasValue()) {
          mergeValue(other.getValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSource()) {
          return false;
        }
        if (!hasOperation()) {
          return false;
        }
        if (!getSource().isInitialized()) {
          return false;
        }
        if (hasValue()) {
          if (!getValue().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getSourceFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.UpdateType tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.UpdateType.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(2, tmpRaw);
                } else {
                  operation_ = tmpRaw;
                  bitField0_ |= 0x00000002;
                }
                break;
              } // case 16
              case 26: {
                input.readMessage(
                    getValueFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier source_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier, com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifierOrBuilder> sourceBuilder_;
      /**
       * <pre>
       ** specification of the value to be updated
       *- if data_model is TABLE, a column name may be specified and also
       *a document path, if the column has type JSON
       *- if data_model is DOCUMENT, only document paths are allowed
       *
       *&#64;note in both cases, schema and table must be not set 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
       * @return Whether the source field is set.
       */
      public boolean hasSource() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       ** specification of the value to be updated
       *- if data_model is TABLE, a column name may be specified and also
       *a document path, if the column has type JSON
       *- if data_model is DOCUMENT, only document paths are allowed
       *
       *&#64;note in both cases, schema and table must be not set 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
       * @return The source.
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier getSource() {
        if (sourceBuilder_ == null) {
          return source_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier.getDefaultInstance() : source_;
        } else {
          return sourceBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** specification of the value to be updated
       *- if data_model is TABLE, a column name may be specified and also
       *a document path, if the column has type JSON
       *- if data_model is DOCUMENT, only document paths are allowed
       *
       *&#64;note in both cases, schema and table must be not set 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
       */
      public Builder setSource(com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier value) {
        if (sourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          source_ = value;
        } else {
          sourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** specification of the value to be updated
       *- if data_model is TABLE, a column name may be specified and also
       *a document path, if the column has type JSON
       *- if data_model is DOCUMENT, only document paths are allowed
       *
       *&#64;note in both cases, schema and table must be not set 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
       */
      public Builder setSource(
          com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier.Builder builderForValue) {
        if (sourceBuilder_ == null) {
          source_ = builderForValue.build();
        } else {
          sourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** specification of the value to be updated
       *- if data_model is TABLE, a column name may be specified and also
       *a document path, if the column has type JSON
       *- if data_model is DOCUMENT, only document paths are allowed
       *
       *&#64;note in both cases, schema and table must be not set 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
       */
      public Builder mergeSource(com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier value) {
        if (sourceBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            source_ != null &&
            source_ != com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier.getDefaultInstance()) {
            getSourceBuilder().mergeFrom(value);
          } else {
            source_ = value;
          }
        } else {
          sourceBuilder_.mergeFrom(value);
        }
        if (source_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** specification of the value to be updated
       *- if data_model is TABLE, a column name may be specified and also
       *a document path, if the column has type JSON
       *- if data_model is DOCUMENT, only document paths are allowed
       *
       *&#64;note in both cases, schema and table must be not set 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
       */
      public Builder clearSource() {
        bitField0_ = (bitField0_ & ~0x00000001);
        source_ = null;
        if (sourceBuilder_ != null) {
          sourceBuilder_.dispose();
          sourceBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** specification of the value to be updated
       *- if data_model is TABLE, a column name may be specified and also
       *a document path, if the column has type JSON
       *- if data_model is DOCUMENT, only document paths are allowed
       *
       *&#64;note in both cases, schema and table must be not set 
       * </pre>
       *
       * <code>required .Mysqlx.Expr.ColumnIdentifier source = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier.Builder getSourceBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSourceFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** specification of the value to be updated
       *- if data_model is TABLE, a column name may be specified and also
       *a document path, if the column has type JSON
       *- if data_model is DOCUMENT, only document paths are allowed
       *
(�     ""!64;oote in$both cases, schema and table must0be not$set 
  �    * </pre>
       *
      $� |code>requi�ed .Mysqlx.E|p�nColum.Kdentifier source 9 1;</cOde>
       */
 $    public aom.mysql.cj.x.protobuf.MysqlxExpR.ColumnIdentifierOrBuilder g%tSourceOrBuilder() {
    `   �& (sOwrceBuilder_ != null) {
          return sourceJwilder_.gu�MessageOrBuilder()?
        } el�e`{(  `      beturn source_ == kuld ?
              com.mysql.cj.x.protobuf.MysqhxE8pr.ColumnIdentifier.getDefaultInstance() 8 source];
        }
      |
     "/**
       * <pre>
      $** speoific`tion of thg valu� tm be update`      $+- if d!ta_model is TABLE,$a c�lumn name may be"specified anf also
1      *a document patj, if�the column has tyqe JSON
       *� if data_modeh is DOCUMENT, only docqment0p`txs are allowed
 $ ! $ *J       *&#64;nOtm`in both cases,�sc(ema and table mest be not set 
 0     * </pre>
     " *
 !     j�<code>requireD .Mqsqix.Expr.�olumnIden4ifiez�sourke = 1;</code>
       */
  $0  privqte com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier, com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifierOrBuilder> 
          getSourceFieldBuilder() {
        if (sourceBuilder_ == null) {
          sourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier, com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifierOrBuilder>(
                  getSource(),
                  getParentForChildren(),
                  isClean());
          source_ = null;
        }
        return sourceBuilder_;
      }

      private int operation_ = 1;
      /**
       * <pre>
       ** the type of operation to be performed 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.UpdateOperation.UpdateType operation = 2;</code>
       * @return Whether the operation field is set.
       */
      @java.lang.Override public boolean hasOperation() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       ** the type of operation to be performed 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.UpdateOperation.UpdateType operation = 2;</code>
       * @return The operation.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.UpdateType getOperation() {
        com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.UpdateType result = com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.UpdateType.forNumber(operation_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.UpdateType.SET : result;
      }
      /**
       * <pre>
       ** the type of operation to be performed 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.UpdateOperation.UpdateType operation = 2;</code>
       * @param value The operation to set.
       * @return This builder for chaining.
       */
      public Builder setOperation(com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.UpdateType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        operation_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** the type of operation to be performed 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.UpdateOperation.UpdateType operation = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOperation() {
        bitField0_ = (bitField0_ & ~0x00000002);
        operation_ = 1;
        onChanged();
        return this;
      }

      private com.mysql.cj.x.protobuf.MysqlxExpr.Expr value_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> valueBuilder_;
      /**
       * <pre>
       ** an expression to be computed as the new value for the operation 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
       * @return Whether the value field is set.
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       ** an expression to be computed as the new value for the operation 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
       * @return The value.
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getValue() {
        if (valueBuilder_ == null) {
          return value_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** an expression to be computed as the new value for the operation 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
       */
      public Builder setValue(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
        } else {
          valueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** an expression to be computed as the new value for the operation 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
       */
      public Builder setValue(
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
        if (valueBuilder_ == null) {
          value_ = builderForValue.build();
        } else {
          valueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** an expression to be computed as the new value for the operation 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
       */
      public Builder mergeValue(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (valueBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            value_ != null &&
            value_ != com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance()) {
            getValueBuilder().mergeFrom(value);
          } else {
            value_ = value;
          }
        } else {
          valueBuilder_.mergeFrom(value);
        }
        if (value_ != null) {
          bitField0_ |= 0x00000004;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** an expression to be computed as the new value for the operation 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        value_ = null;
        if (valueBuilder_ != null) {
          valueBuilder_.dispose();
          valueBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** an expression to be computed as the new value for the operation 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder getValueBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** an expression to be computed as the new value for the operation 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_ == null ?
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : value_;
        }
      }
      /**
       * <pre>
       ** an expression to be computed as the new value for the operation 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr value = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder>(
                  getValue(),
                  getParentForChildren(),
                  isClean());
          value_ = null;
        }
        return valueBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.UpdateOperation)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.UpdateOperation)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UpdateOperation>
        PARSER = new com.google.protobuf.AbstractParser<UpdateOperation>() {
      @java.lang.Override
      public UpdateOperation parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<UpdateOperation> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdateOperation> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface FindOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.Find)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     ** collection in which to find 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
     * @return Whether the collection field is set.
     */
    boolean hasCollection();
    /**
     * <pre>
     ** collection in which to find 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
     * @return The collection.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection();
    /**
     * <pre>
     ** collection in which to find 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder();

    /**
     * <pre>
     ** data model that the operations refer to 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
     * @return Whether the dataModel field is set.
     */
    boolean hasDataModel();
    /**
     * <pre>
     ** data model that the operations refer to 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
     * @return The dataModel.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.DataModel getDataModel();

    /**
     * <pre>
     ** list of column projections that shall be returned 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Projection> 
        getProjectionList();
    /**
     * <pre>
     ** list of column projections that shall be returned 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Projection getProjection(int index);
    /**
     * <pre>
     ** list of column projections that shall be returned 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
     */
    int getProjectionCount();
    /**
     * <pre>
     ** list of column projections that shall be returned 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.ProjectionOrBuilder> 
        getProjectionOrBuilderList();
    /**
     * <pre>
     ** list of column projections that shall be returned 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.ProjectionOrBuilder getProjectionOrBuilder(
        int index);

    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> 
        getArgsList();
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar getArgs(int index);
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
     */
    int getArgsCount();
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
        getArgsOrBuilderList();
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(
        int index);

    /**
     * <pre>
     ** filter criteria 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
     * @return Whether the criteria field is set.
     */
    boolean hasCriteria();
    /**
     * <pre>
     ** filter criteria 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
     * @return The criteria.
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.Expr getCriteria();
    /**
     * <pre>
     ** filter criteria 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder();

    /**
     * <pre>
     ** numbers of rows that shall be skipped and returned
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
     * @return Whether the limit field is set.
     */
    boolean hasLimit();
    /**
     * <pre>
     ** numbers of rows that shall be skipped and returned
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
     * @return The limit.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Limit getLimit();
    /**
     * <pre>
     ** numbers of rows that shall be skipped and returned
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder getLimitOrBuilder();

    /**
     * <pre>
     ** sort-order in which the rows/document shall be returned in 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> 
        getOrderList();
    /**
     * <pre>
     ** sort-order in which the rows/document shall be returned in 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Order getOrder(int index);
    /**
     * <pre>
     ** sort-order in which the rows/document shall be returned in 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
     */
    int getOrderCount();
    /**
     * <pre>
     ** sort-order in which the rows/document shall be returned in 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> 
        getOrderOrBuilderList();
    /**
     * <pre>
     ** sort-order in which the rows/document shall be returned in 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder getOrderOrBuilder(
        int index);

    /**
     * <pre>
     ** column expression list for aggregation (GROUP BY) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.Expr> 
        getGroupingList();
    /**
     * <pre>
     ** column expression list for aggregation (GROUP BY) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.Expr getGrouping(int index);
    /**
     * <pre>
     ** column expression list for aggregation (GROUP BY) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
     */
    int getGroupingCount();
    /**
     * <pre>
     ** column expression list for aggregation (GROUP BY) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
        getGroupingOrBuilderList();
    /**
     * <pre>
     ** column expression list for aggregation (GROUP BY) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getGroupingOrBuilder(
        int index);

    /**
     * <pre>
     ** filter criteria for aggregated groups 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
     * @return Whether the groupingCriteria field is set.
     */
    boolean hasGroupingCriteria();
    /**
     * <pre>
     ** filter criteria for aggregated groups 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
     * @return The groupingCriteria.
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.Expr getGroupingCriteria();
    /**
     * <pre>
     ** filter criteria for aggregated groups 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getGroupingCriteriaOrBuilder();

    /**
     * <pre>
     ** perform row locking on matches 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find.RowLock locking = 12;</code>
     * @return Whether the locking field is set.
     */
    boolean hasLocking();
    /**
     * <pre>
     ** perform row locking on matches 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find.RowLock locking = 12;</code>
     * @return The locking.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLock getLocking();

    /**
     * <pre>
     ** additional options how to handle locked rows 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find.RowLockOptions locking_options = 13;</code>
     * @return Whether the lockingOptions field is set.
     */
    boolean hasLockingOptions();
    /**
     * <pre>
     ** additional options how to handle locked rows 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find.RowLockOptions locking_options = 13;</code>
     * @return The lockingOptions.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLockOptions getLockingOptions();

    /**
     * <pre>
     ** numbers of rows that shall be skipped and returned
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
     * @return Whether the limitExpr field is set.
     */
    boolean hasLimitExpr();
    /**
     * <pre>
     ** numbers of rows that shall be skipped and returned
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
     * @return The limitExpr.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr getLimitExpr();
    /**
     * <pre>
     ** numbers of rows that shall be skipped and returned
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder();
  }
  /**
   * <pre>
   **
   *Find Documents/Rows in a Collection/Table
   *
   *&#64;startuml
   *client -&gt; server: Find
   *... one or more Resultset ...
   *&#64;enduml
   *
   *&#64;returns &#64;ref Mysqlx::Resultset
   * </pre>
   *
   * Protobuf type {@code Mysqlx.Crud.Find}
   */
  public static final class Find extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.Find)
      FindOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Find.newBuilder() to construct.
    private Find(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Find() {
      dataModel_ = 1;
      projection_ = java.util.Collections.emptyList();
      args_ = java.util.Collections.emptyList();
      order_ = java.util.Collections.emptyList();
      grouping_ = java.util.Collections.emptyList();
      locking_ = 1;
      lockingOptions_ = 1;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Find();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Find_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Find_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.Find.class, com.mysql.cj.x.protobuf.MysqlxCrud.Find.Builder.class);
    }

    /**
     * Protobuf enum {@code Mysqlx.Crud.Find.RowLock}
     */
    public enum RowLock
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       ** Lock matching rows against updates 
       * </pre>
       *
       * <code>SHARED_LOCK = 1;</code>
       */
      SHARED_LOCK(1),
      /**
       * <pre>
       ** Lock matching rows so no other transaction can read or write to it 
       * </pre>
       *
       * <code>EXCLUSIVE_LOCK = 2;</code>
       */
      EXCLUSIVE_LOCK(2),
      ;

      /**
       * <pre>
       ** Lock matching rows against updates 
       * </pre>
       *
       * <code>SHARED_LOCK = 1;</code>
       */
      public static final int SHARED_LOCK_VALUE = 1;
      /**
       * <pre>
       ** Lock matching rows so no other transaction can read or write to it 
       * </pre>
       *
       * <code>EXCLUSIVE_LOCK = 2;</code>
       */
      public static final int EXCLUSIVE_LOCK_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static RowLock valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static RowLock forNumber(int value) {
        switch (value) {
          case 1: return SHARED_LOCK;
          case 2: return EXCLUSIVE_LOCK;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<RowLock>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          RowLock> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<RowLock>() {
              public RowLock findValueByNumber(int number) {
                return RowLock.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDescriptor().getEnumTypes().get(0);
      }

      private static final RowLock[] VALUES = values();

      public static RowLock valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private RowLock(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Mysqlx.Crud.Find.RowLock)
    }

    /**
     * Protobuf enum {@code Mysqlx.Crud.Find.RowLockOptions}
     */
    public enum RowLockOptions
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       ** Do not wait to acquire row lock, fail with an error
       *if a requested row is locked 
       * </pre>
       *
       * <code>NOWAIT = 1;</code>
       */
      NOWAIT(1),
      /**
       * <pre>
       ** Do not wait to acquire a row lock,
       *remove locked rows from the result set 
       * </pre>
       *
       * <code>SKIP_LOCKED = 2;</code>
       */
      SKIP_LOCKED(2),
      ;

      /**
       * <pre>
       ** Do not wait to acquire row lock, fail with an error
       *if a requested row is locked 
       * </pre>
       *
       * <code>NOWAIT = 1;</code>
       */
      public static final int NOWAIT_VALUE = 1;
      /**
       * <pre>
       ** Do not wait to acquire a row lock,
       *remove locked rows from the result set 
       * </pre>
       *
       * <code>SKIP_LOCKED = 2;</code>
       */
      public static final int SKIP_LOCKED_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static RowLockOptions valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static RowLockOptions forNumber(int value) {
        switch (value) {
          case 1: return NOWAIT;
          case 2: return SKIP_LOCKED;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<RowLockOptions>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          RowLockOptions> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<RowLockOptions>() {
              public RowLockOptions findValueByNumber(int number) {
                return RowLockOptions.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDescriptor().getEnumTypes().get(1);
      }

      private static final RowLockOptions[] VALUES = values();

      public static RowLockOptions valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private RowLockOptions(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Mysqlx.Crud.Find.RowLockOptions)
    }

    private int bitField0_;
    public static final int COLLECTION_FIELD_NUMBER = 2;
    private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
    /**
     * <pre>
     ** collection in which to find 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
     * @return Whether the collection field is set.
     */
    @java.lang.Override
    public boolean hasCollection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     ** collection in which to find 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
     * @return The collection.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }
    /**
     * <pre>
     ** collection in which to find 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }

    public static final int DATA_MODEL_FIELD_NUMBER = 3;
    private int dataModel_ = 1;
    /**
     * <pre>
     ** data model that the operations refer to 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
     * @return Whether the dataModel field is set.
     */
    @java.lang.Override public boolean hasDataModel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     ** data model that the operations refer to 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
     * @return The dataModel.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.DataModel getDataModel() {
      com.mysql.cj.x.protobuf.MysqlxCrud.DataModel result = com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.forNumber(dataModel_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.DOCUMENT : result;
    }

    public static final int PROJECTION_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Projection> projection_;
    /**
     * <pre>
     ** list of column projections that shall be returned 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Projection> getProjectionList() {
      return projection_;
    }
    /**
     * <pre>
     ** list of column projections that shall be returned 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.ProjectionOrBuilder> 
        getProjectionOrBuilderList() {
      return projection_;
    }
    /**
     * <pre>
     ** list of column projections that shall be returned 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
     */
    @java.lang.Override
    public int getProjectionCount() {
      return projection_.size();
    }
    /**
     * <pre>
     ** list of column projections that shall be returned 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Projection getProjection(int index) {
      return projection_.get(index);
    }
    /**
     * <pre>
     ** list of column projections that shall be returned 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.ProjectionOrBuilder getProjectionOrBuilder(
        int index) {
      return projection_.get(index);
    }

    public static final int ARGS_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> args_;
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> getArgsList() {
      return args_;
    }
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
        getArgsOrBuilderList() {
      return args_;
    }
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
     */
    @java.lang.Override
    public int getArgsCount() {
      return args_.size();
    }
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar getArgs(int index) {
      return args_.get(index);
    }
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(
        int index) {
      return args_.get(index);
    }

    public static final int CRITERIA_FIELD_NUMBER = 5;
    private com.mysql.cj.x.protobuf.MysqlxExpr.Expr criteria_;
    /**
     * <pre>
     ** filter criteria 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
     * @return Whether the criteria field is set.
     */
    @java.lang.Override
    public boolean hasCriteria() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     ** filter criteria 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
     * @return The criteria.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getCriteria() {
      return criteria_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : criteria_;
    }
    /**
     * <pre>
     ** filter criteria 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder() {
      return criteria_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : criteria_;
    }

    public static final int LIMIT_FIELD_NUMBER = 6;
    private com.mysql.cj.x.protobuf.MysqlxCrud.Limit limit_;
    /**
     * <pre>
     ** numbers of rows that shall be skipped and returned
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
     * @return Whether the limit field is set.
     */
    @java.lang.Override
    public boolean hasLimit() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     ** numbers of rows that shall be skipped and returned
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
     * @return The limit.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Limit getLimit() {
      return limit_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance() : limit_;
    }
    /**
     * <pre>
     ** numbers of rows that shall be skipped and returned
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder getLimitOrBuilder() {
      return limit_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance() : limit_;
    }

    public static final int ORDER_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> order_;
    /**
     * <pre>
     ** sort-order in which the rows/document shall be returned in 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> getOrderList() {
      return order_;
    }
    /**
     * <pre>
     ** sort-order in which the rows/document shall be returned in 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> 
        getOrderOrBuilderList() {
      return order_;
    }
    /**
     * <pre>
     ** sort-order in which the rows/document shall be returned in 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
     */
    @java.lang.Override
    public int getOrderCount() {
      return order_.size();
    }
    /**
     * <pre>
     ** sort-order in which the rows/document shall be returned in 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Order getOrder(int index) {
      return order_.get(index);
    }
    /**
     * <pre>
     ** sort-order in which the rows/document shall be returned in 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder getOrderOrBuilder(
        int index) {
      return order_.get(index);
    }

    public static final int GROUPING_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.Expr> grouping_;
    /**
     * <pre>
     ** column expression list for aggregation (GROUP BY) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.Expr> getGroupingList() {
      return grouping_;
    }
    /**
     * <pre>
     ** column expression list for aggregation (GROUP BY) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
        getGroupingOrBuilderList() {
      return grouping_;
    }
    /**
     * <pre>
     ** column expression list for aggregation (GROUP BY) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
     */
    @java.lang.Override
    public int getGroupingCount() {
      return grouping_.size();
    }
    /**
     * <pre>
     ** column expression list for aggregation (GROUP BY) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getGrouping(int index) {
      return grouping_.get(index);
    }
    /**
     * <pre>
     ** column expression list for aggregation (GROUP BY) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getGroupingOrBuilder(
        int index) {
      return grouping_.get(index);
    }

    public static final int GROUPING_CRITERIA_FIELD_NUMBER = 9;
    private com.mysql.cj.x.protobuf.MysqlxExpr.Expr groupingCriteria_;
    /**
     * <pre>
     ** filter criteria for aggregated groups 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
     * @return Whether the groupingCriteria field is set.
     */
    @java.lang.Override
    public boolean hasGroupingCriteria() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     ** filter criteria for aggregated groups 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
     * @return The groupingCriteria.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getGroupingCriteria() {
      return groupingCriteria_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : groupingCriteria_;
    }
    /**
     * <pre>
     ** filter criteria for aggregated groups 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getGroupingCriteriaOrBuilder() {
      return groupingCriteria_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : groupingCriteria_;
    }

    public static final int LOCKING_FIELD_NUMBER = 12;
    private int locking_ = 1;
    /**
     * <pre>
     ** perform row locking on matches 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find.RowLock locking = 12;</code>
     * @return Whether the locking field is set.
     */
    @java.lang.Override public boolean hasLocking() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     ** perform row locking on matches 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find.RowLock locking = 12;</code>
     * @return The locking.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLock getLocking() {
      com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLock result = com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLock.forNumber(locking_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLock.SHARED_LOCK : result;
    }

    public static final int LOCKING_OPTIONS_FIELD_NUMBER = 13;
    private int lockingOptions_ = 1;
    /**
     * <pre>
     ** additional options how to handle locked rows 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find.RowLockOptions locking_options = 13;</code>
     * @return Whether the lockingOptions field is set.
     */
    @java.lang.Override public boolean hasLockingOptions() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     ** additional options how to handle locked rows 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find.RowLockOptions locking_options = 13;</code>
     * @return The lockingOptions.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLockOptions getLockingOptions() {
      com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLockOptions result = com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLockOptions.forNumber(lockingOptions_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLockOptions.NOWAIT : result;
    }

    public static final int LIMIT_EXPR_FIELD_NUMBER = 14;
    private com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr limitExpr_;
    /**
     * <pre>
     ** numbers of rows that shall be skipped and returned
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
     * @return Whether the limitExpr field is set.
     */
    @java.lang.Override
    public boolean hasLimitExpr() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <pre>
     ** numbers of rows that shall be skipped and returned
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
     * @return The limitExpr.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr getLimitExpr() {
      return limitExpr_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance() : limitExpr_;
    }
    /**
     * <pre>
     ** numbers of rows that shall be skipped and returned
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder() {
      return limitExpr_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance() : limitExpr_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCollection()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getCollection().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getProjectionCount(); i++) {
        if (!getProjection(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getArgsCount(); i++) {
        if (!getArgs(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasCriteria()) {
        if (!getCriteria().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasLimit()) {
        if (!getLimit().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getOrderCount(); i++) {
        if (!getOrder(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getGroupingCount(); i++) {
        if (!getGrouping(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasGroupingCriteria()) {
        if (!getGroupingCriteria().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasLimitExpr()) {
        if (!getLimitExpr().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(2, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(3, dataModel_);
      }
      for (int i = 0; i < projection_.size(); i++) {
        output.writeMessage(4, projection_.get(i));
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(5, getCriteria());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(6, getLimit());
      }
      for (int i = 0; i < order_.size(); i++) {
        output.writeMessage(7, order_.get(i));
      }
      for (int i = 0; i < grouping_.size(); i++) {
        output.writeMessage(8, grouping_.get(i));
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeMessage(9, getGroupingCriteria());
      }
      for (int i = 0; i < args_.size(); i++) {
        output.writeMessage(11, args_.get(i));
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeEnum(12, locking_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeEnum(13, lockingOptions_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        output.writeMessage(14, getLimitExpr());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, dataModel_);
      }
      for (int i = 0; i < projection_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, projection_.get(i));
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getCriteria());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getLimit());
      }
      for (int i = 0; i < order_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, order_.get(i));
      }
      for (int i = 0; i < grouping_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, grouping_.get(i));
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getGroupingCriteria());
      }
      for (int i = 0; i < args_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, args_.get(i));
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, locking_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, lockingOptions_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getLimitExpr());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Find)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.Find other = (com.mysql.cj.x.protobuf.MysqlxCrud.Find) obj;

      if (hasCollection() != other.hasCollection()) return false;
      if (hasCollection()) {
        if (!getCollection()
            .equals(other.getCollection())) return false;
      }
      if (hasDataModel() != other.hasDataModel()) return false;
      if (hasDataModel()) {
        if (dataModel_ != other.dataModel_) return false;
      }
      if (!getProjectionList()
          .equals(other.getProjectionList())) return false;
      if (!getArgsList()
          .equals(other.getArgsList())) return false;
      if (hasCriteria() != other.hasCriteria()) return false;
      if (hasCriteria()) {
        if (!getCriteria()
            .equals(other.getCriteria())) return false;
      }
      if (hasLimit() != other.hasLimit()) return false;
      if (hasLimit()) {
        if (!getLimit()
            .equals(other.getLimit())) return false;
      }
      if (!getOrderList()
          .equals(other.getOrderList())) return false;
      if (!getGroupingList()
          .equals(other.getGroupingList())) return false;
      if (hasGroupingCriteria() != other.hasGroupingCriteria()) return false;
      if (hasGroupingCriteria()) {
        if (!getGroupingCriteria()
            .equals(other.getGroupingCriteria())) return false;
      }
      if (hasLocking() != other.hasLocking()) return false;
      if (hasLocking()) {
        if (locking_ != other.locking_) return false;
      }
      if (hasLockingOptions() != other.hasLockingOptions()) return false;
      if (hasLockingOptions()) {
        if (lockingOptions_ != other.lockingOptions_) return false;
      }
      if (hasLimitExpr() != other.hasLimitExpr()) return false;
      if (hasLimitExpr()) {
        if (!getLimitExpr()
            .equals(other.getLimitExpr())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCollection()) {
        hash = (37 * hash) + COLLECTION_FIELD_NUMBER;
        hash = (53 * hash) + getCollection().hashCode();
      }
      if (hasDataModel()) {
        hash = (37 * hash) + DATA_MODEL_FIELD_NUMBER;
        hash = (53 * hash) + dataModel_;
      }
      if (getProjectionCount() > 0) {
        hash = (37 * hash) + PROJECTION_FIELD_NUMBER;
        hash = (53 * hash) + getProjectionList().hashCode();
      }
      if (getArgsCount() > 0) {
        hash = (37 * hash) + ARGS_FIELD_NUMBER;
        hash = (53 * hash) + getArgsList().hashCode();
      }
      if (hasCriteria()) {
        hash = (37 * hash) + CRITERIA_FIELD_NUMBER;
        hash = (53 * hash) + getCriteria().hashCode();
      }
      if (hasLimit()) {
        hash = (37 * hash) + LIMIT_FIELD_NUMBER;
        hash = (53 * hash) + getLimit().hashCode();
      }
      if (getOrderCount() > 0) {
        hash = (37 * hash) + ORDER_FIELD_NUMBER;
        hash = (53 * hash) + getOrderList().hashCode();
      }
      if (getGroupingCount() > 0) {
        hash = (37 * hash) + GROUPING_FIELD_NUMBER;
        hash = (53 * hash) + getGroupingList().hashCode();
      }
      if (hasGroupingCriteria()) {
        hash = (37 * hash) + GROUPING_CRITERIA_FIELD_NUMBER;
        hash = (53 * hash) + getGroupingCriteria().hashCode();
      }
      if (hasLocking()) {
        hash = (37 * hash) + LOCKING_FIELD_NUMBER;
        hash = (53 * hash) + locking_;
      }
      if (hasLockingOptions()) {
        hash = (37 * hash) + LOCKING_OPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + lockingOptions_;
      }
      if (hasLimitExpr()) {
        hash = (37 * hash) + LIMIT_EXPR_FIELD_NUMBER;
        hash = (53 * hash) + getLimitExpr().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.Find prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     *Find Documents/Rows in a Collection/Table
     *
     *&#64;startuml
     *client -&gt; server: Find
     *... one or more Resultset ...
     *&#64;enduml
     *
     *&#64;returns &#64;ref Mysqlx::Resultset
     * </pre>
     *
     * Protobuf type {@code Mysqlx.Crud.Find}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.Find)
        com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Find_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Find_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.Find.class, com.mysql.cj.x.protobuf.MysqlxCrud.Find.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.Find.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getCollectionFieldBuilder();
          getProjectionFieldBuilder();
          getArgsFieldBuilder();
          getCriteriaFieldBuilder();
          getLimitFieldBuilder();
          getOrderFieldBuilder();
          getGroupingFieldBuilder();
          getGroupingCriteriaFieldBuilder();
          getLimitExprFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        dataModel_ = 1;
        if (projectionBuilder_ == null) {
          projection_ = java.util.Collections.emptyList();
        } else {
          projection_ = null;
          projectionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (argsBuilder_ == null) {
          args_ = java.util.Collections.emptyList();
        } else {
          args_ = null;
          argsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        criteria_ = null;
        if (criteriaBuilder_ != null) {
          criteriaBuilder_.dispose();
          criteriaBuilder_ = null;
        }
        limit_ = null;
        if (limitBuilder_ != null) {
          limitBuilder_.dispose();
          limitBuilder_ = null;
        }
        if (orderBuilder_ == null) {
          order_ = java.util.Collections.emptyList();
        } else {
          order_ = null;
          orderBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        if (groupingBuilder_ == null) {
          grouping_ = java.util.Collections.emptyList();
        } else {
          grouping_ = null;
          groupingBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000080);
        groupingCriteria_ = null;
        if (groupingCriteriaBuilder_ != null) {
          groupingCriteriaBuilder_.dispose();
          groupingCriteriaBuilder_ = null;
        }
        locking_ = 1;
        lockingOptions_ = 1;
        limitExpr_ = null;
        if (limitExprBuilder_ != null) {
          limitExprBuilder_.dispose();
          limitExprBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Find_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Find getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Find build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Find result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Find buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Find result = new com.mysql.cj.x.protobuf.MysqlxCrud.Find(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.mysql.cj.x.protobuf.MysqlxCrud.Find result) {
        if (projectionBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0)) {
            projection_ = java.util.Collections.unmodifiableList(projection_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.projection_ = projection_;
        } else {
          result.projection_ = projectionBuilder_.build();
        }
        if (argsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0)) {
            args_ = java.util.Collections.unmodifiableList(args_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.args_ = args_;
        } else {
          result.args_ = argsBuilder_.build();
        }
        if (orderBuilder_ == null) {
          if (((bitField0_ & 0x00000040) != 0)) {
            order_ = java.util.Collections.unmodifiableList(order_);
            bitField0_ = (bitField0_ & ~0x00000040);
          }
          result.order_ = order_;
        } else {
          result.order_ = orderBuilder_.build();
        }
        if (groupingBuilder_ == null) {
          if (((bitField0_ & 0x00000080) != 0)) {
            grouping_ = java.util.Collections.unmodifiableList(grouping_);
            bitField0_ = (bitField0_ & ~0x00000080);
          }
          result.grouping_ = grouping_;
        } else {
          result.grouping_ = groupingBuilder_.build();
        }
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.Find result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.collection_ = collectionBuilder_ == null
              ? collection_
              : collectionBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.dataModel_ = dataModel_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.criteria_ = criteriaBuilder_ == null
              ? criteria_
              : criteriaBuilder_.build();
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.limit_ = limitBuilder_ == null
              ? limit_
              : limitBuilder_.build();
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000100) != 0)) {
          result.groupingCriteria_ = groupingCriteriaBuilder_ == null
              ? groupingCriteria_
              : groupingCriteriaBuilder_.build();
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000200) != 0)) {
          result.locking_ = locking_;
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000400) != 0)) {
          result.lockingOptions_ = lockingOptions_;
          to_bitField0_ |= 0x00000040;
        }
        if (((from_bitField0_ & 0x00000800) != 0)) {
          result.limitExpr_ = limitExprBuilder_ == null
              ? limitExpr_
              : limitExprBuilder_.build();
          to_bitField0_ |= 0x00000080;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Find) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.Find)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.Find other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDefaultInstance()) return this;
        if (other.hasCollection()) {
          mergeCollection(other.getCollection());
        }
        if (other.hasDataModel()) {
          setDataModel(other.getDataModel());
        }
        if (projectionBuilder_ == null) {
          if (!other.projection_.isEmpty()) {
            if (projection_.isEmpty()) {
              projection_ = other.projection_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureProjectionIsMutable();
              projection_.addAll(other.projection_);
            }
            onChanged();
          }
        } else {
          if (!other.projection_.isEmpty()) {
            if (projectionBuilder_.isEmpty()) {
              projectionBuilder_.dispose();
              projectionBuilder_ = null;
              projection_ = other.projection_;
              bitField0_ = (bitField0_ & ~0x00000004);
              projectionBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getProjectionFieldBuilder() : null;
            } else {
              projectionBuilder_.addAllMessages(other.projection_);
            }
          }
        }
        if (argsBuilder_ == null) {
          if (!other.args_.isEmpty()) {
            if (args_.isEmpty()) {
              args_ = other.args_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureArgsIsMutable();
              args_.addAll(other.args_);
            }
            onChanged();
          }
        } else {
          if (!other.args_.isEmpty()) {
            if (argsBuilder_.isEmpty()) {
              argsBuilder_.dispose();
              argsBuilder_ = null;
              args_ = other.args_;
              bitField0_ = (bitField0_ & ~0x00000008);
              argsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getArgsFieldBuilder() : null;
            } else {
              argsBuilder_.addAllMessages(other.args_);
            }
          }
        }
        if (other.hasCriteria()) {
          mergeCriteria(other.getCriteria());
        }
        if (other.hasLimit()) {
          mergeLimit(other.getLimit());
        }
        if (orderBuilder_ == null) {
          if (!other.order_.isEmpty()) {
            if (order_.isEmpty()) {
              order_ = other.order_;
              bitField0_ = (bitField0_ & ~0x00000040);
            } else {
              ensureOrderIsMutable();
              order_.addAll(other.order_);
            }
            onChanged();
          }
        } else {
          if (!other.order_.isEmpty()) {
            if (orderBuilder_.isEmpty()) {
              orderBuilder_.dispose();
              orderBuilder_ = null;
              order_ = other.order_;
              bitField0_ = (bitField0_ & ~0x00000040);
              orderBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOrderFieldBuilder() : null;
            } else {
              orderBuilder_.addAllMessages(other.order_);
            }
          }
        }
        if (groupingBuilder_ == null) {
          if (!other.grouping_.isEmpty()) {
            if (grouping_.isEmpty()) {
              grouping_ = other.grouping_;
              bitField0_ = (bitField0_ & ~0x00000080);
            } else {
              ensureGroupingIsMutable();
              grouping_.addAll(other.grouping_);
            }
            onChanged();
          }
        } else {
          if (!other.grouping_.isEmpty()) {
            if (groupingBuilder_.isEmpty()) {
              groupingBuilder_.dispose();
              groupingBuilder_ = null;
              grouping_ = other.grouping_;
              bitField0_ = (bitField0_ & ~0x00000080);
              groupingBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getGroupingFieldBuilder() : null;
            } else {
              groupingBuilder_.addAllMessages(other.grouping_);
            }
          }
        }
        if (other.hasGroupingCriteria()) {
          mergeGroupingCriteria(other.getGroupingCriteria());
        }
        if (other.hasLocking()) {
          setLocking(other.getLocking());
        }
        if (other.hasLockingOptions()) {
          setLockingOptions(other.getLockingOptions());
        }
        if (other.hasLimitExpr()) {
          mergeLimitExpr(other.getLimitExpr());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasCollection()) {
          return false;
        }
        if (!getCollection().isInitialized()) {
          return false;
        }
        for (int i = 0; i < getProjectionCount(); i++) {
          if (!getProjection(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getArgsCount(); i++) {
          if (!getArgs(i).isInitialized()) {
            return false;
          }
        }
        if (hasCriteria()) {
          if (!getCriteria().isInitialized()) {
            return false;
          }
        }
        if (hasLimit()) {
          if (!getLimit().isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getOrderCount(); i++) {
          if (!getOrder(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getGroupingCount(); i++) {
          if (!getGrouping(i).isInitialized()) {
            return false;
          }
        }
        if (hasGroupingCriteria()) {
          if (!getGroupingCriteria().isInitialized()) {
            return false;
          }
        }
        if (hasLimitExpr()) {
          if (!getLimitExpr().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 18: {
                input.readMessage(
                    getCollectionFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 18
              case 24: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.DataModel tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(3, tmpRaw);
                } else {
                  dataModel_ = tmpRaw;
                  bitField0_ |= 0x00000002;
                }
                break;
              } // case 24
              case 34: {
                com.mysql.cj.x.protobuf.MysqlxCrud.Projection m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxCrud.Projection.PARSER,
                        extensionRegistry);
                if (projectionBuilder_ == null) {
                  ensureProjectionIsMutable();
                  projection_.add(m);
                } else {
                  projectionBuilder_.addMessage(m);
                }
                break;
              } // case 34
              case 42: {
                input.readMessage(
                    getCriteriaFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000010;
                break;
              } // case 42
              case 50: {
                input.readMessage(
                    getLimitFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000020;
                break;
              } // case 50
              case 58: {
                com.mysql.cj.x.protobuf.MysqlxCrud.Order m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxCrud.Order.PARSER,
                        extensionRegistry);
                if (orderBuilder_ == null) {
                  ensureOrderIsMutable();
                  order_.add(m);
                } else {
                  orderBuilder_.addMessage(m);
                }
                break;
              } // case 58
              case 66: {
                com.mysql.cj.x.protobuf.MysqlxExpr.Expr m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxExpr.Expr.PARSER,
                        extensionRegistry);
                if (groupingBuilder_ == null) {
                  ensureGroupingIsMutable();
                  grouping_.add(m);
                } else {
                  groupingBuilder_.addMessage(m);
                }
                break;
              } // case 66
              case 74: {
                input.readMessage(
                    getGroupingCriteriaFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000100;
                break;
              } // case 74
              case 90: {
                com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.PARSER,
                        extensionRegistry);
                if (argsBuilder_ == null) {
                  ensureArgsIsMutable();
                  args_.add(m);
                } else {
                  argsBuilder_.addMessage(m);
                }
                break;
              } // case 90
              case 96: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLock tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLock.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(12, tmpRaw);
                } else {
                  locking_ = tmpRaw;
                  bitField0_ |= 0x00000200;
                }
                break;
              } // case 96
              case 104: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLockOptions tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLockOptions.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(13, tmpRaw);
                } else {
                  lockingOptions_ = tmpRaw;
                  bitField0_ |= 0x00000400;
                }
                break;
              } // case 104
              case 114: {
                input.readMessage(
                    getLimitExprFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000800;
                break;
              } // case 114
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
      /**
       * <pre>
       ** collection in which to find 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       * @return Whether the collection field is set.
       */
      public boolean hasCollection() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       ** collection in which to find 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       * @return The collection.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
        if (collectionBuilder_ == null) {
          return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        } else {
          return collectionBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** collection in which to find 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      public Builder setCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          collection_ = value;
        } else {
          collectionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** collection in which to find 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      public Builder setCollection(
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder builderForValue) {
        if (collectionBuilder_ == null) {
          collection_ = builderForValue.build();
        } else {
          collectionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** collection in which to find 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      public Builder mergeCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            collection_ != null &&
            collection_ != com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance()) {
            getCollectionBuilder().mergeFrom(value);
          } else {
            collection_ = value;
          }
        } else {
          collectionBuilder_.mergeFrom(value);
        }
        if (collection_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** collection in which to find 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      public Builder clearCollection() {
        bitField0_ = (bitField0_ & ~0x00000001);
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** collection in which to find 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder getCollectionBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCollectionFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** collection in which to find 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
        if (collectionBuilder_ != null) {
          return collectionBuilder_.getMessageOrBuilder();
        } else {
          return collection_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        }
      }
      /**
       * <pre>
       ** collection in which to find 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> 
          getCollectionFieldBuilder() {
        if (collectionBuilder_ == null) {
          collectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder>(
                  getCollection(),
                  getParentForChildren(),
                  isClean());
          collection_ = null;
        }
        return collectionBuilder_;
      }

      private int dataModel_ = 1;
      /**
       * <pre>
       ** data model that the operations refer to 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
       * @return Whether the dataModel field is set.
       */
      @java.lang.Override public boolean hasDataModel() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       ** data model that the operations refer to 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
       * @return The dataModel.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.DataModel getDataModel() {
        com.mysql.cj.x.protobuf.MysqlxCrud.DataModel result = com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.forNumber(dataModel_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.DOCUMENT : result;
      }
      /**
       * <pre>
       ** data model that the operations refer to 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
       * @param value The dataModel to set.
       * @return This builder for chaining.
       */
      public Builder setDataModel(com.mysql.cj.x.protobuf.MysqlxCrud.DataModel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        dataModel_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** data model that the operations refer to 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDataModel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dataModel_ = 1;
        onChanged();
        return this;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Projection> projection_ =
        java.util.Collections.emptyList();
      private void ensureProjectionIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          projection_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxCrud.Projection>(projection_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Projection, com.mysql.cj.x.protobuf.MysqlxCrud.Projection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.ProjectionOrBuilder> projectionBuilder_;

      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Projection> getProjectionList() {
        if (projectionBuilder_ == null) {
          return java.util.Collections.unmodifiableList(projection_);
        } else {
          return projectionBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public int getProjectionCount() {
        if (projectionBuilder_ == null) {
          return projection_.size();
        } else {
          return projectionBuilder_.getCount();
        }
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Projection getProjection(int index) {
        if (projectionBuilder_ == null) {
          return projection_.get(index);
        } else {
          return projectionBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public Builder setProjection(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Projection value) {
        if (projectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProjectionIsMutable();
          projection_.set(index, value);
          onChanged();
        } else {
          projectionBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public Builder setProjection(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Projection.Builder builderForValue) {
        if (projectionBuildeb_ == null)�{
          enqureProjectionIsMu�abla();
          projection_�set(index, builderForValue.build());
          onChanged();
        } else {
 �  (     projmctionBui|der_.SetMessage(kndex, builderforValue.build());
        }
        return this;
    ( }      /**
       * <pre6
       ** list of colu-n projectio~s that shall be returned 
       * <-pre>
       *
     ` *�<code>pepeated .Mysqlx.CrUd.Projection projectimn = 4;</coee>
       */
     !public Builder addProjection(com.mxsq|.cj.x.protob�f>MysqlxCrud.Ppojection valua) {
        if (prokectionBuilder_ ==0null) {
          if (value$== Null)${
         �  t(roW new Nu�lPoknterExcepTion();
�         }
 !    @   ensupePr�jectionIsMutable();
          prokection_.add(value);
          MnChanged();
        } 'lse {
          projectionBuilder_.addMessag%(valua	;        }
 (      retern this;
   �  }
      /**
      0* <pre>
 0    !** list of$colwmn pbojections`that�shal� `e revurned 
       * </pre>
 `     *
       * <#ode>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public Builder addProjection(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Projection value) {
        if (projectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProjectionIsMutable();
          projection_.add(index, value);
          onChanged();
        } else {
          projectionBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public Builder addProjection(
          com.mysql.cj.x.protobuf.MysqlxCrud.Projection.Builder builderForValue) {
        if (projectionBuilder_ == null) {
          ensureProjectionIsMutable();
          projection_.add(builderForValue.build());
          onChanged();
        } else {
          projectionBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public Builder addProjection(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Projection.Builder builderForValue) {
        if (projectionBuilder_ == null) {
          ensureProjectionIsMutable();
          projection_.add(index, builderForValue.build());
          onChanged();
        } else {
          projectionBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public Builder addAllProjection(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxCrud.Projection> values) {
        if (projectionBuilder_ == null) {
          ensureProjectionIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, projection_);
          onChanged();
        } else {
          projectionBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public Builder clearProjection() {
        if (projectionBuilder_ == null) {
          projection_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          projectionBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public Builder removeProjection(int index) {
        if (projectionBuilder_ == null) {
          ensureProjectionIsMutable();
          projection_.remove(index);
          onChanged();
        } else {
          projectionBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Projection.Builder getProjectionBuilder(
          int index) {
        return getProjectionFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.ProjectionOrBuilder getProjectionOrBuilder(
          int index) {
        if (projectionBuilder_ == null) {
          return projection_.get(index);  } else {
          return projectionBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.ProjectionOrBuilder> 
           getProjectionOrBuilderList() {
        if (projectionBuilder_ != null) {
          return projectionBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(projection_);
        }
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Projection.Builder addProjectionBuilder() {
        return getProjectionFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxCrud.Projection.getDefaultInstance());
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Projection.Builder addProjectionBuilder(
          int index) {
        return getProjectionFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxCrud.Projection.getDefaultInstance());
      }
      /**
       * <pre>
       ** list of column projections that shall be returned 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Projection projection = 4;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Projection.Builder> 
           getProjectionBuilderList() {
        return getProjectionFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Projection, com.mysql.cj.x.protobuf.MysqlxCrud.Projection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.ProjectionOrBuilder> 
          getProjectionFieldBuilder() {
        if (projectionBuilder_ == null) {
          projectionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Projection, com.mysql.cj.x.protobuf.MysqlxCrud.Projection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.ProjectionOrBuilder>(
                  projection_,
                  ((bitField0_ & 0x00000004) != 0),
                  getParentForChildren(),
                  isClean());
          projection_ = null;
        }
        return projectionBuilder_;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> args_ =
        java.util.Collections.emptyList();
      private void ensureArgsIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          args_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar>(args_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder, com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> argsBuilder_;

      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> getArgsList() {
        if (argsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(args_);
        } else {
          return argsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public int getArgsCount() {
        if (argsBuilder_ == null) {
          return args_.size();
        } else {
          return argsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar getArgs(int index) {
        if (argsBuilder_ == null) {
          return args_.get(index);
        } else {
          return argsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public Builder setArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar value) {
        if (argsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgsIsMutable();
          args_.set(index, value);
          onChanged();
        } else {
          argsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public Builder setArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.set(index, builderForValue.build());
          onChanged();
        } else {
          argsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public Builder addArgs(com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar value) {
        if (argsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgsIsMutable();
          args_.add(value);
          onChanged();
        } else {
          argsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public Builder addArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar value) {
        if (argsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgsIsMutable();
          args_.add(index, value);
          onChanged();
        } else {
          argsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public BuiLder aedAvgw(
       `  com.mysql.cj/x.protbuf.MywqlxDitatypes.Scalar.Btildgr builderForValue) ;
        if (argsBuilder == nuld) �       "  ensureArgrIsMutable();
  "(      args_.add(bqilderForValue.build());
          oo�hanged();
        } else �
    "     argsBuildep_.addMessage(bUilderForValue."uild());
     �  }
        r�4urn this;
      }
      /**
       * <pre>
     ` (* values for parametdrs used in filter expression 
       * </pre>
  �    *
 "   ! * <code>repeate` .Mysqlx.Datatyper.Scal!r arcs = !1;</code>
       */
      public Builder addCrgs(
          i�| indep, com.mysql.cj.p.protobuf.MysqlxDatatyp�s.Scalar.Builder builderForValue) {
        if (argsBuilder_ == null) {
       ! &ensureArwrMsMutcble();
          argc_.a�d�index, ruilderFo2Value.build());
    `     onChanged();
        } else {
 0  (     argsBuilder_oaddMessafe(index, builderForVal�a.build());
        |
        rdturn thmS;
      }
      /**
 !     * <pre>
�      ** vclues for!parameter3 used!in fidteb exprdssion 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public Builder addAllArgs(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> values) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, args_);
          onChanged();
        } else {
          argsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public Builder clearArgs() {
        if (argsBuilder_ == null) {
          args_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          argsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public Builder removeArgs(int index) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.remove(index);
          onChanged();
        } else {
          argsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder getArgsBuilder(
          int index) {
        return getArgsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(
          int index) {
        if (argsBuilder_ == null) {
          return args_.get(index);  } else {
          return argsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
           getArgsOrBuilderList() {
        if (argsBuilder_ != null) {
          return argsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(args_);
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder addArgsBuilder() {
        return getArgsFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.getDefaultInstance());
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder addArgsBuilder(
          int index) {
        return getArgsFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.getDefaultInstance());
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 11;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder> 
           getArgsBuilderList() {
        return getArgsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder, com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
          getArgsFieldBuilder() {
        if (argsBuilder_ == null) {
          argsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder, com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder>(
                  args_,
                  ((bitField0_ & 0x00000008) != 0),
                  getParentForChildren(),
                  isClean());
          args_ = null;
        }
        return argsBuilder_;
      }

      private com.mysql.cj.x.protobuf.MysqlxExpr.Expr criteria_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> criteriaBuilder_;
      /**
       * <pre>
       ** filter criteria 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
       * @return Whether the criteria field is set.
       */
      public boolean hasCriteria() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       ** filter criteria 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
       * @return The criteria.
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getCriteria() {
        if (criteriaBuilder_ == null) {
          return criteria_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : criteria_;
        } else {
          return criteriaBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** filter criteria 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
       */
      public Builder setCriteria(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (criteriaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          criteria_ = value;
        } else {
          criteriaBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** filter criteria 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
       */
      public Builder setCriteria(
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
        if (criteriaBuilder_ == null) {
          criteria_ = builderForValue.build();
        } else {
          criteriaBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** filter criteria 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
       */
      public Builder mergeCriteria(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (criteriaBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0) &&
            criteria_ != null &&
            criteria_ != com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance()) {
            getCriteriaBuilder().mergeFrom(value);
          } else {
            criteria_ = value;
          }
        } else {
          criteriaBuilder_.mergeFrom(value);
        }
        if (criteria_ != null) {
          bitField0_ |= 0x00000010;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** filter criteria 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
       */
      public Builder clearCriteria() {
        bitField0_ = (bitField0_ & ~0x00000010);
        criteria_ = null;
        if (criteriaBuilder_ != null) {
          criteriaBuilder_.dispose();
          criteriaBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** filter criteria 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder getCriteriaBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getCriteriaFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** filter criteria 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder() {
        if (criteriaBuilder_ != null) {
          return criteriaBuilder_.getMessageOrBuilder();
        } else {
          return criteria_ == null ?
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : criteria_;
        }
      }
      /**
       * <pre>
       ** filter criteria 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
          getCriteriaFieldBuilder() {
        if (criteriaBuilder_ == null) {
          criteriaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder>(
                  getCriteria(),
                  getParentForChildren(),
                  isClean());
          criteria_ = null;
        }
        return criteriaBuilder_;
      }

      private com.mysql.cj.x.protobuf.MysqlxCrud.Limit limit_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Limit, com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder> limitBuilder_;
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
       * @return Whether the limit field is set.
       */
      public boolean hasLimit() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
       * @return The limit.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Limit getLimit() {
        if (limitBuilder_ == null) {
          return limit_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance() : limit_;
        } else {
          return limitBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
       */
      public Builder setLimit(com.mysql.cj.x.protobuf.MysqlxCrud.Limit value) {
        if (limitBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          limit_ = value;
        } else {
          limitBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
       */
      public Builder setLimit(
          com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder builderForValue) {
        if (limitBuilder_ == null) {
          limit_ = builderForValue.build();
        } else {
          limitBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
       */
      public Builder mergeLimit(com.mysql.cj.x.protobuf.MysqlxCrud.Limit value) {
        if (limitBuilder_ == null) {
          if (((bitField0_ & 0x00000020) != 0) &&
            limit_ != null &&
            limit_ != com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance()) {
            getLimitBuilder().mergeFrom(value);
          } else {
            limit_ = value;
          }
        } else {
          limitBuilder_.mergeFrom(value);
        }
        if (limit_ != null) {
          bitField0_ |= 0x00000020;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
       */
      public Builder clearLimit() {
        bitField0_ = (bitField0_ & ~0x00000020);
        limit_ = null;
        if (limitBuilder_ != null) {
          limitBuilder_.dispose();
          limitBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder getLimitBuilder() {
        bitField0_ |= 0x00000020;
        onChanged();
        return getLimitFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder getLimitOrBuilder() {
        if (limitBuilder_ != null) {
          return limitBuilder_.getMessageOrBuilder();
        } else {
          return limit_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance() : limit_;
        }
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Limit, com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder> 
          getLimitFieldBuilder() {
        if (limitBuilder_ == null) {
          limitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Limit, com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder>(
                  getLimit(),
                  getParentForChildren(),
                  isClean());
          limit_ = null;
        }
        return limitBuilder_;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> order_ =
        java.util.Collections.emptyList();
      private void ensureOrderIsMutable() {
        if (!((bitField0_ & 0x00000040) != 0)) {
          order_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxCrud.Order>(order_);
          bitField0_ |= 0x00000040;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Order, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> orderBuilder_;

      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> getOrderList() {
        if (orderBuilder_ == null) {
          return java.util.Collections.unmodifiableList(order_);
        } else {
          return orderBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public int getOrderCount() {
        if (orderBuilder_ == null) {
          return order_.size();
        } else {
          return orderBuilder_.getCount();
        }
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order getOrder(int index) {
        if (orderBuilder_ == null) {
          return order_.get(index);
        } else {
          return orderBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public Builder setOrder(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Order value) {
        if (orderBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOrderIsMutable();
          order_.set(index, value);
          onChanged();
        } else {
          orderBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public Builder setOrder(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder builderForValue) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          order_.set(index, builderForValue.build());
          onChanged();
        } else {
          orderBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public Builder addOrder(com.mysql.cj.x.protobuf.MysqlxCrud.Order value) {
        if (orderBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOrderIsMutable();
          order_.add(value);
          onChanged();
        } else {
          orderBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public Builder addOrder(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Order value) {
        if (orderBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOrderIsMutable();
          order_.add(index, value);
          onChanged();
        } else {
          orderBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public Builder addOrder(
          com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder builderForValue) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          order_.add(builderForValue.build());
          onChanged();
        } else {
          orderBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public Builder addOrder(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder builderForValue) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          order_.add(index, builderForValue.build());
          onChanged();
        } else {
          orderBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public Builder addAllOrder(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxCrud.Order> values) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, order_);
          onChanged();
        } else {
          orderBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public Builder clearOrder() {
        if (orderBuilder_ == null) {
          order_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
          onChanged();
        } else {
          orderBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public Builder removeOrder(int index) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          order_.remove(index);
          onChanged();
        } else {
          orderBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder getOrderBuilder(
          int index) {
        return getOrderFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder getOrderOrBuilder(
          int index) {
        if (orderBuilder_ == null) {
          return order_.get(index);  } else {
          return orderBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> 
           getOrderOrBuilderList() {
        if (orderBuilder_ != null) {
          return orderBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(order_);
        }
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder addOrderBuilder() {
        return getOrderFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxCrud.Order.getDefaultInstance());
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder addOrderBuilder(
          int index) {
        return getOrderFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxCrud.Order.getDefaultInstance());
      }
      /**
       * <pre>
       ** sort-order in which the rows/document shall be returned in 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 7;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder> 
           getOrderBuilderList() {
        return getOrderFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Order, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> 
          getOrderFieldBuilder() {
        if (orderBuilder_ == null) {
          orderBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Order, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder>(
                  order_,
                  ((bitField0_ & 0x00000040) != 0),
                  getParentForChildren(),
                  isClean());
          order_ = null;
        }
        return orderBuilder_;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.Expr> grouping_ =
        java.util.Collections.emptyList();
      private void ensureGroupingIsMutable() {
        if (!((bitField0_ & 0x00000080) != 0)) {
          grouping_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxExpr.Expr>(grouping_);
          bitField0_ |= 0x00000080;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> groupingBuilder_;

      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.Expr> getGroupingList() {
        if (groupingBuilder_ == null) {
          return java.util.Collections.unmodifiableList(grouping_);
        } else {
          return groupingBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public int getGroupingCount() {
        if (groupingBuilder_ == null) {
          return grouping_.size();
        } else {
          return groupingBuilder_.getCount();
        }
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getGrouping(int index) {
        if (groupingBuilder_ == null) {
          return grouping_.get(index);
        } else {
          return groupingBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public Builder setGrouping(
          int index, com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (groupingBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGroupingIsMutable();
          grouping_.set(index, value);
          onChanged();
        } else {
          groupingBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public Builder setGrouping(
          int index, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
        if (groupingBuilder_ == null) {
          ensureGroupingIsMutable();
          grouping_.set(index, builderForValue.build());
          onChanged();
        } else {
          groupingBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public Builder addGrouping(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (groupingBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGroupingIsMutable();
          grouping_.add(value);
          onChanged();
        } else {
          groupingBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public Builder addGrouping(
          int index, com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (groupingBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGroupingIsMutable();
          grouping_.add(index, value);
          onChanged();
        } else {
          groupingBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public Builder addGrouping(
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
        if (groupingBuilder_ == null) {
          ensureGroupingIsMutable();
          grouping_.add(builderForValue.build());
          onChanged();
        } else {
          groupingBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public Builder addGrouping(
          int index, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
        if (groupingBuilder_ == null) {
          ensureGroupingIsMutable();
          grouping_.add(index, builderForValue.build());
          onChanged();
        } else {
          groupingBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public Builder addAllGrouping(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxExpr.Expr> values) {
        if (groupingBuilder_ == null) {
          ensureGroupingIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, grouping_);
          onChanged();
        } else {
          groupingBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public Builder clearGrouping() {
        if (groupingBuilder_ == null) {
          grouping_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
          onChanged();
        } else {
          groupingBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public Builder removeGrouping(int index) {
        if (groupingBuilder_ == null) {
          ensureGroupingIsMutable();
          grouping_.remove(index);
          onChanged();
        } else {
          groupingBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder getGroupingBuilder(
          int index) {
        return getGroupingFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getGroupingOrBuilder(
          int index) {
        if (groupingBuilder_ == null) {
          return grouping_.get(index);  } else {
          return groupingBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
           getGroupingOrBuilderList() {
        if (groupingBuilder_ != null) {
          return groupingBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(grouping_);
        }
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder addGroupingBuilder() {
        return getGroupingFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance());
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder addGroupingBuilder(
          int index) {
        return getGroupingFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance());
      }
      /**
       * <pre>
       ** column expression list for aggregation (GROUP BY) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Expr.Expr grouping = 8;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder> 
           getGroupingBuilderList() {
        return getGroupingFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
          getGroupingFieldBuilder() {
        if (groupingBuilder_ == null) {
          groupingBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder>(
                  grouping_,
                  ((bitField0_ & 0x00000080) != 0),
                  getParentForChildren(),
                  isClean());
          grouping_ = null;
        }
        return groupingBuilder_;
      }

      private com.mysql.cj.x.protobuf.MysqlxExpr.Expr groupingCriteria_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> groupingCriteriaBuilder_;
      /**
       * <pre>
       ** filter criteria for aggregated groups 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
       * @return Whether the groupingCriteria field is set.
       */
      public boolean hasGroupingCriteria() {
        return ((bitField0_ & 0x00000100) != 0);
      }
      /**
       * <pre>
       ** filter criteria for aggregated groups 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
       * @return The groupingCriteria.
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getGroupingCriteria() {
        if (groupingCriteriaBuilder_ == null) {
          return groupingCriteria_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : groupingCriteria_;
        } else {
          return groupingCriteriaBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** filter criteria for aggregated groups 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
       */
      public Builder setGroupingCriteria(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (groupingCriteriaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          groupingCriteria_ = value;
        } else {
          groupingCriteriaBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000100;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** filter criteria for aggregated groups 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
       */
      public Builder setGroupingCriteria(
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
        if (groupingCriteriaBuilder_ == null) {
          groupingCriteria_ = builderForValue.build();
        } else {
          groupingCriteriaBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000100;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** filter criteria for aggregated groups 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
       */
      public Builder mergeGroupingCriteria(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (groupingCriteriaBuilder_ == null) {
          if (((bitField0_ & 0x00000100) != 0) &&
            groupingCriteria_ != null &&
            groupingCriteria_ != com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance()) {
            getGroupingCriteriaBuilder().mergeFrom(value);
          } else {
            groupingCriteria_ = value;
          }
        } else {
          groupingCriteriaBuilder_.mergeFrom(value);
        }
        if (groupingCriteria_ != null) {
          bitField0_ |= 0x00000100;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** filter criteria for aggregated groups 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
       */
      public Builder clearGroupingCriteria() {
        bitField0_ = (bitField0_ & ~0x00000100);
        groupingCriteria_ = null;
        if (groupingCriteriaBuilder_ != null) {
          groupingCriteriaBuilder_.dispose();
          groupingCriteriaBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** filter criteria for aggregated groups 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder getGroupingCriteriaBuilder() {
        bitField0_ |= 0x00000100;
        onChanged();
        return getGroupingCriteriaFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** filter criteria for aggregated groups 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getGroupingCriteriaOrBuilder() {
        if (groupingCriteriaBuilder_ != null) {
          return groupingCriteriaBuilder_.getMessageOrBuilder();
        } else {
          return groupingCriteria_ == null ?
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : groupingCriteria_;
        }
      }
      /**
       * <pre>
       ** filter criteria for aggregated groups 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr grouping_criteria = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
          getGroupingCriteriaFieldBuilder() {
        if (groupingCriteriaBuilder_ == null) {
          groupingCriteriaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder>(
                  getGroupingCriteria(),
                  getParentForChildren(),
                  isClean());
          groupingCriteria_ = null;
        }
        return groupingCriteriaBuilder_;
      }

      private int locking_ = 1;
      /**
       * <pre>
       ** perform row locking on matches 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find.RowLock locking = 12;</code>
       * @return Whether the locking field is set.
       */
      @java.lang.Override public boolean hasLocking() {
        return ((bitField0_ & 0x00000200) != 0);
      }
      /**
       * <pre>
       ** perform row locking on matches 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find.RowLock locking = 12;</code>
       * @return The locking.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLock getLocking() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLock result = com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLock.forNumber(locking_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLock.SHARED_LOCK : result;
      }
      /**
       * <pre>
       ** perform row locking on matches 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find.RowLock locking = 12;</code>
       * @param value The locking to set.
       * @return This builder for chaining.
       */
      public Builder setLocking(com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLock value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000200;
        locking_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** perform row locking on matches 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find.RowLock locking = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLocking() {
        bitField0_ = (bitField0_ & ~0x00000200);
        locking_ = 1;
        onChanged();
        return this;
      }

      private int lockingOptions_ = 1;
      /**
       * <pre>
       ** additional options how to handle locked rows 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find.RowLockOptions locking_options = 13;</code>
       * @return Whether the lockingOptions field is set.
       */
      @java.lang.Override public boolean hasLockingOptions() {
        return ((bitField0_ & 0x00000400) != 0);
      }
      /**
       * <pre>
       ** additional options how to handle locked rows 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find.RowLockOptions locking_options = 13;</code>
       * @return The lockingOptions.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLockOptions getLockingOptions() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLockOptions result = com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLockOptions.forNumber(lockingOptions_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLockOptions.NOWAIT : result;
      }
      /**
       * <pre>
       ** additional options how to handle locked rows 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find.RowLockOptions locking_options = 13;</code>
       * @param value The lockingOptions to set.
       * @return This builder for chaining.
       */
      public Builder setLockingOptions(com.mysql.cj.x.protobuf.MysqlxCrud.Find.RowLockOptions value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000400;
        lockingOptions_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** additional options how to handle locked rows 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find.RowLockOptions locking_options = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLockingOptions() {
        bitField0_ = (bitField0_ & ~0x00000400);
        lockingOptions_ = 1;
        onChanged();
        return this;
      }

      private com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr limitExpr_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder> limitExprBuilder_;
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
       * @return Whether the limitExpr field is set.
       */
      public boolean hasLimitExpr() {
        return ((bitField0_ & 0x00000800) != 0);
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
       * @return The limitExpr.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr getLimitExpr() {
        if (limitExprBuilder_ == null) {
          return limitExpr_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance() : limitExpr_;
        } else {
          return limitExprBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
       */
      public Builder setLimitExpr(com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr value) {
        if (limitExprBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          limitExpr_ = value;
        } else {
          limitExprBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000800;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
       */
      public Builder setLimitExpr(
          com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder builderForValue) {
        if (limitExprBuilder_ == null) {
          limitExpr_ = builderForValue.build();
        } else {
          limitExprBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000800;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
       */
      public Builder mergeLimitExpr(com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr value) {
        if (limitExprBuilder_ == null) {
          if (((bitField0_ & 0x00000800) != 0) &&
            limitExpr_ != null &&
            limitExpr_ != com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance()) {
            getLimitExprBuilder().mergeFrom(value);
          } else {
            limitExpr_ = value;
          }
        } else {
          limitExprBuilder_.mergeFrom(value);
        }
        if (limitExpr_ != null) {
          bitField0_ |= 0x00000800;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
       */
      public Builder clearLimitExpr() {
        bitField0_ = (bitField0_ & ~0x00000800);
        limitExpr_ = null;
        if (limitExprBuilder_ != null) {
          limitExprBuilder_.dispose();
          limitExprBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder getLimitExprBuilder() {
        bitField0_ |= 0x00000800;
        onChanged();
        return getLimitExprFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder() {
        if (limitExprBuilder_ != null) {
          return limitExprBuilder_.getMessageOrBuilder();
        } else {
          return limitExpr_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance() : limitExpr_;
        }
      }
      /**
       * <pre>
       ** numbers of rows that shall be skipped and returned
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder> 
          getLimitExprFieldBuilder() {
        if (limitExprBuilder_ == null) {
          limitExprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder>(
                  getLimitExpr(),
                  getParentForChildren(),
                  isClean());
          limitExpr_ = null;
        }
        return limitExprBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.Find)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.Find)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.Find DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.Find();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Find getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Find>
        PARSER = new com.google.protobuf.AbstractParser<Find>() {
      @java.lang.Override
      public Find parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Find> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Find> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Find getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface InsertOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.Insert)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     ** collection to insert into 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return Whether the collection field is set.
     */
    boolean hasCollection();
    /**
     * <pre>
     ** collection to insert into 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return The collection.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection();
    /**
     * <pre>
     ** collection to insert into 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder();

    /**
     * <pre>
     ** data model that the operations refer to 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
     * @return Whether the dataModel field is set.
     */
    boolean hasDataModel();
    /**
     * <pre>
     ** data model that the operations refer to 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
     * @return The dataModel.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.DataModel getDataModel();

    /**
     * <pre>
     ** name of the columns to insert data into
     *(empty if data_model is DOCUMENT) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Column> 
        getProjectionList();
    /**
     * <pre>
     ** name of the columns to insert data into
     *(empty if data_model is DOCUMENT) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Column getProjection(int index);
    /**
     * <pre>
     ** name of the columns to insert data into
     *(empty if data_model is DOCUMENT) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
     */
    int getProjectionCount();
    /**
     * <pre>
     ** name of the columns to insert data into
     *(empty if data_model is DOCUMENT) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.ColumnOrBuilder> 
        getProjectionOrBuilderList();
    /**
     * <pre>
     ** name of the columns to insert data into
     *(empty if data_model is DOCUMENT) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.ColumnOrBuilder getProjectionOrBuilder(
        int index);

    /**
     * <pre>
     ** set of rows to insert into the collection/table (a single expression
     *with a JSON document literal or an OBJECT expression) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow> 
        getRowList();
    /**
     * <pre>
     ** set of rows to insert into the collection/table (a single expression
     *with a JSON document literal or an OBJECT expression) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow getRow(int index);
    /**
     * <pre>
     ** set of rows to insert into the collection/table (a single expression
     *with a JSON document literal or an OBJECT expression) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
     */
    int getRowCount();
    /**
     * <pre>
     ** set of rows to insert into the collection/table (a single expression
     *with a JSON document literal or an OBJECT expression) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRowOrBuilder> 
        getRowOrBuilderList();
    /**
     * <pre>
     ** set of rows to insert into the collection/table (a single expression
     *with a JSON document literal or an OBJECT expression) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRowOrBuilder getRowOrBuilder(
        int index);

    /**
     * <pre>
     ** values for parameters used in row expressions 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> 
        getArgsList();
    /**
     * <pre>
     ** values for parameters used in row expressions 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar getArgs(int index);
    /**
     * <pre>
     ** values for parameters used in row expressions 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
     */
    int getArgsCount();
    /**
     * <pre>
     ** values for parameters used in row expressions 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
        getArgsOrBuilderList();
    /**
     * <pre>
     ** values for parameters used in row expressions 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(
        int index);

    /**
     * <pre>
     ** true if this should be treated as an Upsert
     *(that is, update on duplicate key) 
     * </pre>
     *
     * <code>optional bool upsert = 6 [default = false];</code>
     * @return Whether the upsert field is set.
     */
    boolean hasUpsert();
    /**
     * <pre>
     ** true if this should be treated as an Upsert
     *(that is, update on duplicate key) 
     * </pre>
     *
     * <code>optional bool upsert = 6 [default = false];</code>
     * @return The upsert.
     */
    boolean getUpsert();
  }
  /**
   * <pre>
   **
   *Insert documents/rows into a collection/table
   *
   *&#64;returns &#64;ref Mysqlx::Resultset
   * </pre>
   *
   * Protobuf type {@code Mysqlx.Crud.Insert}
   */
  public static final class Insert extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.Insert)
      InsertOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Insert.newBuilder() to construct.
    private Insert(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Insert() {
      dataModel_ = 1;
      projection_ = java.util.Collections.emptyList();
      row_ = java.util.Collections.emptyList();
      args_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Insert();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Insert_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Insert_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.Insert.class, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.Builder.class);
    }

    public interface TypedRowOrBuilder extends
        // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.Insert.TypedRow)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
       */
      java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.Expr> 
          getFieldList();
      /**
       * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
       */
      com.mysql.cj.x.protobuf.MysqlxExpr.Expr getField(int index);
      /**
       * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
       */
      int getFieldCount();
      /**
       * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
       */
      java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
          getFieldOrBuilderList();
      /**
       * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
       */
      com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getFieldOrBuilder(
          int index);
    }
    /**
     * <pre>
     ** set of fields to insert as a one row 
     * </pre>
     *
     * Protobuf type {@code Mysqlx.Crud.Insert.TypedRow}
     */
    public static final class TypedRow extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:Mysqlx.Crud.Insert.TypedRow)
        TypedRowOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use TypedRow.newBuilder() to construct.
      private TypedRow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private TypedRow() {
        field_ = java.util.Collections.emptyList();
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new TypedRow();
      }

      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Insert_TypedRow_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.class, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.Builder.class);
      }

      public static final int FIELD_FIELD_NUMBER = 1;
      @SuppressWarnings("serial")
      private java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.Expr> field_;
      /**
       * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
       */
      @java.lang.Override
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.Expr> getFieldList() {
        return field_;
      }
      /**
       * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
       */
      @java.lang.Override
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
          getFieldOrBuilderList() {
        return field_;
      }
      /**
       * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
       */
      @java.lang.Override
      public int getFieldCount() {
        return field_.size();
      }
      /**
       * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getField(int index) {
        return field_.get(index);
      }
      /**
       * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getFieldOrBuilder(
          int index) {
        return field_.get(index);
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        for (int i = 0; i < getFieldCount(); i++) {
          if (!getField(i).isInitialized()) {
            memoizedIsInitialized = 0;
            return false;
          }
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        for (int i = 0; i < field_.size(); i++) {
          output.writeMessage(1, field_.get(i));
        }
        getUnknownFields().writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        for (int i = 0; i < field_.size(); i++) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, field_.get(i));
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow)) {
          return super.equals(obj);
        }
        com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow other = (com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow) obj;

        if (!getFieldList()
            .equals(other.getFieldList())) return false;
        if (!getUnknownFields().equals(other.getUnknownFields())) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (getFieldCount() > 0) {
          hash = (37 * hash) + FIELD_FIELD_NUMBER;
          hash = (53 * hash) + getFieldList().hashCode();
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }

      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       ** set of fields to insert as a one row 
       * </pre>
       *
       * Protobuf type {@code Mysqlx.Crud.Insert.TypedRow}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.Insert.TypedRow)
          com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRowOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Insert_TypedRow_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.class, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.Builder.class);
        }

        // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.newBuilder()
        private Builder() {

        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);

        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          bitField0_ = 0;
          if (fieldBuilder_ == null) {
            field_ = java.util.Collections.emptyList();
          } else {
            field_ = null;
            fieldBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor;
        }

        @java.lang.Override
        public com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow getDefaultInstanceForType() {
          return com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.getDefaultInstance();
        }

        @java.lang.Override
        public com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow build() {
          com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow buildPartial() {
          com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow result = new com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow(this);
          buildPartialRepeatedFields(result);
          if (bitField0_ != 0) { buildPartial0(result); }
          onBuilt();
          return result;
        }

        private void buildPartialRepeatedFields(com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow result) {
          if (fieldBuilder_ == null) {
            if (((bitField0_ & 0x00000001) != 0)) {
              field_ = java.util.Collections.unmodifiableList(field_);
              bitField0_ = (bitField0_ & ~0x00000001);
            }
            result.field_ = field_;
          } else {
            result.field_ = fieldBuilder_.build();
          }
        }

        private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow result) {
          int from_bitField0_ = bitField0_;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow) {
            return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow other) {
          if (other == com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.getDefaultInstance()) return this;
          if (fieldBuilder_ == null) {
            if (!other.field_.isEmpty()) {
              if (field_.isEmpty()) {
                field_ = other.field_;
                bitField0_ = (bitField0_ & ~0x00000001);
              } else {
                ensureFieldIsMutable();
                field_.addAll(other.field_);
              }
              onChanged();
            }
          } else {
            if (!other.field_.isEmpty()) {
              if (fieldBuilder_.isEmpty()) {
                fieldBuilder_.dispose();
                fieldBuilder_ = null;
                field_ = other.field_;
                bitField0_ = (bitField0_ & ~0x00000001);
                fieldBuilder_ = 
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                     getFieldFieldBuilder() : null;
              } else {
                fieldBuilder_.addAllMessages(other.field_);
              }
            }
          }
          this.mergeUnknownFields(other.getUnknownFields());
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          for (int i = 0; i < getFieldCount(); i++) {
            if (!getField(i).isInitialized()) {
              return false;
            }
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 10: {
                  com.mysql.cj.x.protobuf.MysqlxExpr.Expr m =
                      input.readMessage(
                          com.mysql.cj.x.protobuf.MysqlxExpr.Expr.PARSER,
                          extensionRegistry);
                  if (fieldBuilder_ == null) {
                    ensureFieldIsMutable();
                    field_.add(m);
                  } else {
                    fieldBuilder_.addMessage(m);
                  }
                  break;
                } // case 10
                default: {
                  if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                    done = true; // was an endgroup tag
                  }
                  break;
                } // default:
              } // switch (tag)
            } // while (!done)
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
          } finally {
            onChanged();
          } // finally
          return this;
        }
        private int bitField0_;

        private java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.Expr> field_ =
          java.util.Collections.emptyList();
        private void ensureFieldIsMutable() {
          if (!((bitField0_ & 0x00000001) != 0)) {
            field_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxExpr.Expr>(field_);
            bitField0_ |= 0x00000001;
           }
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
            com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> fieldBuilder_;

        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.Expr> getFieldList() {
          if (fieldBuilder_ == null) {
            return java.util.Collections.unmodifiableList(field_);
          } else {
            return fieldBuilder_.getMessageList();
          }
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public int getFieldCount() {
          if (fieldBuilder_ == null) {
            return field_.size();
          } else {
            return fieldBuilder_.getCount();
          }
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getField(int index) {
          if (fieldBuilder_ == null) {
            return field_.get(index);
          } else {
            return fieldBuilder_.getMessage(index);
          }
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public Builder setField(
            int index, com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
          if (fieldBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureFieldIsMutable();
            field_.set(index, value);
            onChanged();
          } else {
            fieldBuilder_.setMessage(index, value);
          }
          return this;
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public Builder setField(
            int index, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
          if (fieldBuilder_ == null) {
            ensureFieldIsMutable();
            field_.set(index, builderForValue.build());
            onChanged();
          } else {
            fieldBuilder_.setMessage(index, builderForValue.build());
          }
          return this;
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public Builder addField(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
          if (fieldBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureFieldIsMutable();
            field_.add(value);
            onChanged();
          } else {
            fieldBuilder_.addMessage(value);
          }
          return this;
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public Builder addField(
            int index, com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
          if (fieldBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureFieldIsMutable();
            field_.add(index, value);
            onChanged();
          } else {
            fieldBuilder_.addMessage(index, value);
          }
          return this;
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public Builder addField(
            com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
          if (fieldBuilder_ == null) {
            ensureFieldIsMutable();
            field_.add(builderForValue.build());
            onChanged();
          } else {
            fieldBuilder_.addMessage(builderForValue.build());
          }
          return this;
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public Builder addField(
            int index, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
          if (fieldBuilder_ == null) {
            ensureFieldIsMutable();
            field_.add(index, builderForValue.build());
            onChanged();
          } else {
            fieldBuilder_.addMessage(index, builderForValue.build());
          }
          return this;
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public Builder addAllField(
            java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxExpr.Expr> values) {
          if (fieldBuilder_ == null) {
            ensureFieldIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                values, field_);
            onChanged();
          } else {
            fieldBuilder_.addAllMessages(values);
          }
          return this;
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public Builder clearField() {
          if (fieldBuilder_ == null) {
            field_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000001);
            onChanged();
          } else {
            fieldBuilder_.clear();
          }
          return this;
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public Builder removeField(int index) {
          if (fieldBuilder_ == null) {
            ensureFieldIsMutable();
            field_.remove(index);
            onChanged();
          } else {
            fieldBuilder_.remove(index);
          }
          return this;
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder getFieldBuilder(
            int index) {
          return getFieldFieldBuilder().getBuilder(index);
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getFieldOrBuilder(
            int index) {
          if (fieldBuilder_ == null) {
            return field_.get(index);  } else {
            return fieldBuilder_.getMessageOrBuilder(index);
          }
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
             getFieldOrBuilderList() {
          if (fieldBuilder_ != null) {
            return fieldBuilder_.getMessageOrBuilderList();
          } else {
            return java.util.Collections.unmodifiableList(field_);
          }
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder addFieldBuilder() {
          return getFieldFieldBuilder().addBuilder(
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance());
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder addFieldBuilder(
            int index) {
          return getFieldFieldBuilder().addBuilder(
              index, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance());
        }
        /**
         * <code>repeated .Mysqlx.Expr.Expr field = 1;</code>
         */
        public java.util.List<com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder> 
             getFieldBuilderList() {
          return getFieldFieldBuilder().getBuilderList();
        }
        private com.google.protobuf.RepeatedFieldBuilderV3<
            com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
            getFieldFieldBuilder() {
          if (fieldBuilder_ == null) {
            fieldBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder>(
                    field_,
                    ((bitField0_ & 0x00000001) != 0),
                    getParentForChildren(),
                    isClean());
            field_ = null;
          }
          return fieldBuilder_;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.Insert.TypedRow)
      }

      // @@protoc_insertion_point(class_scope:Mysqlx.Crud.Insert.TypedRow)
      private static final com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow();
      }

      public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<TypedRow>
          PARSER = new com.google.protobuf.AbstractParser<TypedRow>() {
        @java.lang.Override
        public TypedRow parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

      public static com.google.protobuf.Parser<TypedRow> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<TypedRow> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    private int bitField0_;
    public static final int COLLECTION_FIELD_NUMBER = 1;
    private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
    /**
     * <pre>
     ** collection to insert into 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return Whether the collection field is set.
     */
    @java.lang.Override
    public boolean hasCollection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     ** collection to insert into 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return The collection.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }
    /**
     * <pre>
     ** collection to insert into 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }

    public static final int DATA_MODEL_FIELD_NUMBER = 2;
    private int dataModel_ = 1;
    /**
     * <pre>
     ** data model that the operations refer to 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
     * @return Whether the dataModel field is set.
     */
    @java.lang.Override public boolean hasDataModel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     ** data model that the operations refer to 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
     * @return The dataModel.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.DataModel getDataModel() {
      com.mysql.cj.x.protobuf.MysqlxCrud.DataModel result = com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.forNumber(dataModel_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.DOCUMENT : result;
    }

    public static final int PROJECTION_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Column> projection_;
    /**
     * <pre>
     ** name of the columns to insert data into
     *(empty if data_model is DOCUMENT) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Column> getProjectionList() {
      return projection_;
    }
    /**
     * <pre>
     ** name of the columns to insert data into
     *(empty if data_model is DOCUMENT) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.ColumnOrBuilder> 
        getProjectionOrBuilderList() {
      return projection_;
    }
    /**
     * <pre>
     ** name of the columns to insert data into
     *(empty if data_model is DOCUMENT) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
     */
    @java.lang.Override
    public int getProjectionCount() {
      return projection_.size();
    }
    /**
     * <pre>
     ** name of the columns to insert data into
     *(empty if data_model is DOCUMENT) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Column getProjection(int index) {
      return projection_.get(index);
    }
    /**
     * <pre>
     ** name of the columns to insert data into
     *(empty if data_model is DOCUMENT) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.ColumnOrBuilder getProjectionOrBuilder(
        int index) {
      return projection_.get(index);
    }

    public static final int ROW_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow> row_;
    /**
     * <pre>
     ** set of rows to insert into the collection/table (a single expression
     *with a JSON document literal or an OBJECT expression) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow> getRowList() {
      return row_;
    }
    /**
     * <pre>
     ** set of rows to insert into the collection/table (a single expression
     *with a JSON document literal or an OBJECT expression) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRowOrBuilder> 
        getRowOrBuilderList() {
      return row_;
    }
    /**
     * <pre>
     ** set of rows to insert into the collection/table (a single expression
     *with a JSON document literal or an OBJECT expression) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
     */
    @java.lang.Override
    public int getRowCount() {
      return row_.size();
    }
    /**
     * <pre>
     ** set of rows to insert into the collection/table (a single expression
     *with a JSON document literal or an OBJECT expression) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow getRow(int index) {
      return row_.get(index);
    }
    /**
     * <pre>
     ** set of rows to insert into the collection/table (a single expression
     *with a JSON document literal or an OBJECT expression) 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRowOrBuilder getRowOrBuilder(
        int index) {
      return row_.get(index);
    }

    public static final int ARGS_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> args_;
    /**
     * <pre>
     ** values for parameters used in row expressions 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> getArgsList() {
      return args_;
    }
    /**
     * <pre>
     ** values for parameters used in row expressions 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
        getArgsOrBuilderList() {
      return args_;
    }
    /**
     * <pre>
     ** values for parameters used in row expressions 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
     */
    @java.lang.Override
    public int getArgsCount() {
      return args_.size();
    }
    /**
     * <pre>
     ** values for parameters used in row expressions 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar getArgs(int index) {
      return args_.get(index);
    }
    /**
     * <pre>
     ** values for parameters used in row expressions 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(
        int index) {
      return args_.get(index);
    }

    public static final int UPSERT_FIELD_NUMBER = 6;
    private boolean upsert_ = false;
    /**
     * <pre>
     ** true if this should be treated as an Upsert
     *(that is, update on duplicate key) 
     * </pre>
     *
     * <code>optional bool upsert = 6 [default = false];</code>
     * @return Whether the upsert field is set.
     */
    @java.lang.Override
    public boolean hasUpsert() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     ** true if this should be treated as an Upsert
     *(that is, update on duplicate key) 
     * </pre>
     *
     * <code>optional bool upsert = 6 [default = false];</code>
     * @return The upsert.
     */
    @java.lang.Override
    public boolean getUpsert() {
      return upsert_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCollection()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getCollection().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getProjectionCount(); i++) {
        if (!getProjection(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getRowCount(); i++) {
        if (!getRow(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getArgsCount(); i++) {
        if (!getArgs(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, dataModel_);
      }
      for (int i = 0; i < projection_.size(); i++) {
        output.writeMessage(3, projection_.get(i));
      }
      for (int i = 0; i < row_.size(); i++) {
        output.writeMessage(4, row_.get(i));
      }
      for (int i = 0; i < args_.size(); i++) {
        output.writeMessage(5, args_.get(i));
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBool(6, upsert_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, dataModel_);
      }
      for (int i = 0; i < projection_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, projection_.get(i));
      }
      for (int i = 0; i < row_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, row_.get(i));
      }
      for (int i = 0; i < args_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, args_.get(i));
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, upsert_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Insert)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.Insert other = (com.mysql.cj.x.protobuf.MysqlxCrud.Insert) obj;

      if (hasCollection() != other.hasCollection()) return false;
      if (hasCollection()) {
        if (!getCollection()
            .equals(other.getCollection())) return false;
      }
      if (hasDataModel() != other.hasDataModel()) return false;
      if (hasDataModel()) {
        if (dataModel_ != other.dataModel_) return false;
      }
      if (!getProjectionList()
          .equals(other.getProjectionList())) return false;
      if (!getRowList()
          .equals(other.getRowList())) return false;
      if (!getArgsList()
          .equals(other.getArgsList())) return false;
      if (hasUpsert() != other.hasUpsert()) return false;
      if (hasUpsert()) {
        if (getUpsert()
            != other.getUpsert()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCollection()) {
        hash = (37 * hash) + COLLECTION_FIELD_NUMBER;
        hash = (53 * hash) + getCollection().hashCode();
      }
      if (hasDataModel()) {
        hash = (37 * hash) + DATA_MODEL_FIELD_NUMBER;
        hash = (53 * hash) + dataModel_;
      }
      if (getProjectionCount() > 0) {
        hash = (37 * hash) + PROJECTION_FIELD_NUMBER;
        hash = (53 * hash) + getProjectionList().hashCode();
      }
      if (getRowCount() > 0) {
        hash = (37 * hash) + ROW_FIELD_NUMBER;
        hash = (53 * hash) + getRowList().hashCode();
      }
      if (getArgsCount() > 0) {
        hash = (37 * hash) + ARGS_FIELD_NUMBER;
        hash = (53 * hash) + getArgsList().hashCode();
      }
      if (hasUpsert()) {
        hash = (37 * hash) + UPSERT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getUpsert());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.Insert prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     *Insert documents/rows into a collection/table
     *
     *&#64;returns &#64;ref Mysqlx::Resultset
     * </pre>
     *
     * Protobuf type {@code Mysqlx.Crud.Insert}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.Insert)
        com.mysql.cj.x.protobuf.MysqlxCrud.InsertOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Insert_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Insert_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.Insert.class, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.Insert.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getCollectionFieldBuilder();
          getProjectionFieldBuilder();
          getRowFieldBuilder();
          getArgsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        dataModel_ = 1;
        if (projectionBuilder_ == null) {
          projection_ = java.util.Collections.emptyList();
        } else {
          projection_ = null;
          projectionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (rowBuilder_ == null) {
          row_ = java.util.Collections.emptyList();
        } else {
          row_ = null;
          rowBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (argsBuilder_ == null) {
          args_ = java.util.Collections.emptyList();
        } else {
          args_ = null;
          argsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        upsert_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Insert_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Insert getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.Insert.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Insert build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Insert result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Insert buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Insert result = new com.mysql.cj.x.protobuf.MysqlxCrud.Insert(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.mysql.cj.x.protobuf.MysqlxCrud.Insert result) {
        if (projectionBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0)) {
            projection_ = java.util.Collections.unmodifiableList(projection_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.projection_ = projection_;
        } else {
          result.projection_ = projectionBuilder_.build();
        }
        if (rowBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0)) {
            row_ = java.util.Collections.unmodifiableList(row_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.row_ = row_;
        } else {
          result.row_ = rowBuilder_.build();
        }
        if (argsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            args_ = java.util.Collections.unmodifiableList(args_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.args_ = args_;
        } else {
          result.args_ = argsBuilder_.build();
        }
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.Insert result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.collection_ = collectionBuilder_ == null
              ? collection_
              : collectionBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.dataModel_ = dataModel_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.upsert_ = upsert_;
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Insert) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.Insert)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.Insert other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.Insert.getDefaultInstance()) return this;
        if (other.hasCollection()) {
          mergeCollection(other.getCollection());
        }
        if (other.hasDataModel()) {
          setDataModel(other.getDataModel());
        }
        if (projectionBuilder_ == null) {
          if (!other.projection_.isEmpty()) {
            if (projection_.isEmpty()) {
              projection_ = other.projection_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureProjectionIsMutable();
              projection_.addAll(other.projection_);
            }
            onChanged();
          }
        } else {
          if (!other.projection_.isEmpty()) {
            if (projectionBuilder_.isEmpty()) {
              projectionBuilder_.dispose();
              projectionBuilder_ = null;
              projection_ = other.projection_;
              bitField0_ = (bitField0_ & ~0x00000004);
              projectionBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getProjectionFieldBuilder() : null;
            } else {
              projectionBuilder_.addAllMessages(other.projection_);
            }
          }
        }
        if (rowBuilder_ == null) {
          if (!other.row_.isEmpty()) {
            if (row_.isEmpty()) {
              row_ = other.row_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureRowIsMutable();
              row_.addAll(other.row_);
            }
            onChanged();
          }
        } else {
          if (!other.row_.isEmpty()) {
            if (rowBuilder_.isEmpty()) {
              rowBuilder_.dispose();
              rowBuilder_ = null;
              row_ = other.row_;
              bitField0_ = (bitField0_ & ~0x00000008);
              rowBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRowFieldBuilder() : null;
            } else {
              rowBuilder_.addAllMessages(other.row_);
            }
          }
        }
        if (argsBuilder_ == null) {
          if (!other.args_.isEmpty()) {
            if (args_.isEmpty()) {
              args_ = other.args_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureArgsIsMutable();
              args_.addAll(other.args_);
            }
            onChanged();
          }
        } else {
          if (!other.args_.isEmpty()) {
            if (argsBuilder_.isEmpty()) {
              argsBuilder_.dispose();
              argsBuilder_ = null;
              args_ = other.args_;
              bitField0_ = (bitField0_ & ~0x00000010);
              argsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getArgsFieldBuilder() : null;
            } else {
              argsBuilder_.addAllMessages(other.args_);
            }
          }
        }
        if (other.hasUpsert()) {
          setUpsert(other.getUpsert());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasCollection()) {
          return false;
        }
        if (!getCollection().isInitialized()) {
          return false;
        }
        for (int i = 0; i < getProjectionCount(); i++) {
          if (!getProjection(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getRowCount(); i++) {
          if (!getRow(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getArgsCount(); i++) {
          if (!getArgs(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getCollectionFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.DataModel tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(2, tmpRaw);
                } else {
                  dataModel_ = tmpRaw;
                  bitField0_ |= 0x00000002;
                }
                break;
              } // case 16
              case 26: {
                com.mysql.cj.x.protobuf.MysqlxCrud.Column m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxCrud.Column.PARSER,
                        extensionRegistry);
                if (projectionBuilder_ == null) {
                  ensureProjectionIsMutable();
                  projection_.add(m);
                } else {
                  projectionBuilder_.addMessage(m);
                }
                break;
              } // case 26
              case 34: {
                com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.PARSER,
                        extensionRegistry);
                if (rowBuilder_ == null) {
                  ensureRowIsMutable();
                  row_.add(m);
                } else {
                  rowBuilder_.addMessage(m);
                }
                break;
              } // case 34
              case 42: {
                com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.PARSER,
                        extensionRegistry);
                if (argsBuilder_ == null) {
                  ensureArgsIsMutable();
                  args_.add(m);
                } else {
                  argsBuilder_.addMessage(m);
                }
                break;
              } // case 42
              case 48: {
                upsert_ = input.readBool();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
      /**
       * <pre>
       ** collection to insert into 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       * @return Whether the collection field is set.
       */
      public boolean hasCollection() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       ** collection to insert into 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       * @return The collection.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
        if (collectionBuilder_ == null) {
          return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        } else {
          return collectionBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** collection to insert into 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder setCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          collection_ = value;
        } else {
          collectionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** collection to insert into 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder setCollection(
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder builderForValue) {
        if (collectionBuilder_ == null) {
          collection_ = builderForValue.build();
        } else {
          collectionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** collection to insert into 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder mergeCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            collection_ != null &&
            collection_ != com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance()) {
            getCollectionBuilder().mergeFrom(value);
          } else {
            collection_ = value;
          }
        } else {
          collectionBuilder_.mergeFrom(value);
        }
        if (collection_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** collection to insert into 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder clearCollection() {
        bitField0_ = (bitField0_ & ~0x00000001);
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** collection to insert into 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder getCollectionBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCollectionFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** collection to insert into 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
        if (collectionBuilder_ != null) {
          return collectionBuilder_.getMessageOrBuilder();
        } else {
          return collection_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        }
      }
      /**
       * <pre>
       ** collection to insert into 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> 
          getCollectionFieldBuilder() {
        if (collectionBuilder_ == null) {
          collectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder>(
                  getCollection(),
                  getParentForChildren(),
                  isClean());
          collection_ = null;
        }
        return collectionBuilder_;
      }

      private int dataModel_ = 1;
      /**
       * <pre>
       ** data model that the operations refer to 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
       * @return Whether the dataModel field is set.
       */
      @java.lang.Override public boolean hasDataModel() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       ** data model that the operations refer to 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
       * @return The dataModel.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.DataModel getDataModel() {
        com.mysql.cj.x.protobuf.MysqlxCrud.DataModel result = com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.forNumber(dataModel_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.DOCUMENT : result;
      }
      /**
       * <pre>
       ** data model that the operations refer to 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
       * @param value The dataModel to set.
       * @return This builder for chaining.
       */
      public Builder setDataModel(com.mysql.cj.x.protobuf.MysqlxCrud.DataModel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        dataModel_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** data model that the operations refer to 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDataModel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dataModel_ = 1;
        onChanged();
        return this;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Column> projection_ =
        java.util.Collections.emptyList();
      private void ensureProjectionIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          projection_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxCrud.Column>(projection_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Column, com.mysql.cj.x.protobuf.MysqlxCrud.Column.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.ColumnOrBuilder> projectionBuilder_;

      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Column> getProjectionList() {
        if (projectionBuilder_ == null) {
          return java.util.Collections.unmodifiableList(projection_);
        } else {
          return projectionBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public int getProjectionCount() {
        if (projectionBuilder_ == null) {
          return projection_.size();
        } else {
          return projectionBuilder_.getCount();
        }
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Column getProjection(int index) {
        if (projectionBuilder_ == null) {
          return projection_.get(index);
        } else {
          return projectionBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public Builder setProjection(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Column value) {
        if (projectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProjectionIsMutable();
          projection_.set(index, value);
          onChanged();
        } else {
          projectionBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public Builder setProjection(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Column.Builder builderForValue) {
        if (projectionBuilder_ == null) {
          ensureProjectionIsMutable();
          projection_.set(index, builderForValue.build());
          onChanged();
        } else {
          projectionBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public Builder addProjection(com.mysql.cj.x.protobuf.MysqlxCrud.Column value) {
        if (projectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProjectionIsMutable();
          projection_.add(value);
          onChanged();
        } else {
          projectionBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public Builder addProjection(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Column value) {
        if (projectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProjectionIsMutable();
          projection_.add(index, value);
          onChanged();
        } else {
          projectionBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public Builder addProjection(
          com.mysql.cj.x.protobuf.MysqlxCrud.Column.Builder builderForValue) {
        if (projectionBuilder_ == null) {
          ensureProjectionIsMutable();
          projection_.add(builderForValue.build());
          onChanged();
        } else {
          projectionBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public Builder addProjection(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Column.Builder builderForValue) {
        if (projectionBuilder_ == null) {
          ensureProjectionIsMutable();
          projection_.add(index, builderForValue.build());
          onChanged();
        } else {
          projectionBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public Builder addAllProjection(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxCrud.Column> values) {
        if (projectionBuilder_ == null) {
          ensureProjectionIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, projection_);
          onChanged();
        } else {
          projectionBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public Builder clearProjection() {
        if (projectionBuilder_ == null) {
          projection_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          projectionBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public Builder removeProjection(int index) {
        if (projectionBuilder_ == null) {
          ensureProjectionIsMutable();
          projection_.remove(index);
          onChanged();
        } else {
          projectionBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Column.Builder getProjectionBuilder(
          int index) {
        return getProjectionFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.ColumnOrBuilder getProjectionOrBuilder(
          int index) {
        if (projectionBuilder_ == null) {
          return projection_.get(index);  } else {
          return projectionBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.ColumnOrBuilder> 
           getProjectionOrBuilderList() {
        if (projectionBuilder_ != null) {
          return projectionBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(projection_);
        }
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Column.Builder addProjectionBuilder() {
        return getProjectionFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxCrud.Column.getDefaultInstance());
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Column.Builder addProjectionBuilder(
          int index) {
        return getProjectionFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxCrud.Column.getDefaultInstance());
      }
      /**
       * <pre>
       ** name of the columns to insert data into
       *(empty if data_model is DOCUMENT) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Column projection = 3;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Column.Builder> 
           getProjectionBuilderList() {
        return getProjectionFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Column, com.mysql.cj.x.protobuf.MysqlxCrud.Column.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.ColumnOrBuilder> 
          getProjectionFieldBuilder() {
        if (projectionBuilder_ == null) {
          projectionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Column, com.mysql.cj.x.protobuf.MysqlxCrud.Column.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.ColumnOrBuilder>(
                  projection_,
                  ((bitField0_ & 0x00000004) != 0),
                  getParentForChildren(),
                  isClean());
          projection_ = null;
        }
        return projectionBuilder_;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow> row_ =
        java.util.Collections.emptyList();
      private void ensureRowIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          row_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow>(row_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRowOrBuilder> rowBuilder_;

      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow> getRowList() {
        if (rowBuilder_ == null) {
          return java.util.Collections.unmodifiableList(row_);
        } else {
          return rowBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public int getRowCount() {
        if (rowBuilder_ == null) {
          return row_.size();
        } else {
          return rowBuilder_.getCount();
        }
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow getRow(int index) {
        if (rowBuilder_ == null) {
          return row_.get(index);
        } else {
          return rowBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public Builder setRow(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow value) {
        if (rowBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRowIsMutable();
          row_.set(index, value);
          onChanged();
        } else {
          rowBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public Builder setRow(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.Builder builderForValue) {
        if (rowBuilder_ == null) {
          ensureRowIsMutable();
          row_.set(index, builderForValue.build());
          onChanged();
        } else {
          rowBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public Builder addRow(com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow value) {
        if (rowBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRowIsMutable();
          row_.add(value);
          onChanged();
        } else {
          rowBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public Builder addRow(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow value) {
        if (rowBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRowIsMutable();
          row_.add(index, value);
          onChanged();
        } else {
          rowBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public Builder addRow(
          com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.Builder builderForValue) {
        if (rowBuilder_ == null) {
          ensureRowIsMutable();
          row_.add(builderForValue.build());
          onChanged();
        } else {
          rowBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public Builder addRow(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.Builder builderForValue) {
        if (rowBuilder_ == null) {
          ensureRowIsMutable();
          row_.add(index, builderForValue.build());
          onChanged();
        } else {
          rowBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public Builder addAllRow(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow> values) {
        if (rowBuilder_ == null) {
          ensureRowIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, row_);
          onChanged();
        } else {
          rowBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public Builder clearRow() {
        if (rowBuilder_ == null) {
          row_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          rowBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public Builder removeRow(int index) {
        if (rowBuilder_ == null) {
          ensureRowIsMutable();
          row_.remove(index);
          onChanged();
        } else {
          rowBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.Builder getRowBuilder(
          int index) {
        return getRowFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRowOrBuilder getRowOrBuilder(
          int index) {
        if (rowBuilder_ == null) {
          return row_.get(index);  } else {
          return rowBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRowOrBuilder> 
           getRowOrBuilderList() {
        if (rowBuilder_ != null) {
          return rowBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(row_);
        }
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.Builder addRowBuilder() {
        return getRowFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.getDefaultInstance());
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.Builder addRowBuilder(
          int index) {
        return getRowFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.getDefaultInstance());
      }
      /**
       * <pre>
       ** set of rows to insert into the collection/table (a single expression
       *with a JSON document literal or an OBJECT expression) 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Insert.TypedRow row = 4;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.Builder> 
           getRowBuilderList() {
        return getRowFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRowOrBuilder> 
          getRowFieldBuilder() {
        if (rowBuilder_ == null) {
          rowBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRow.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.Insert.TypedRowOrBuilder>(
                  row_,
                  ((bitField0_ & 0x00000008) != 0),
                  getParentForChildren(),
                  isClean());
          row_ = null;
        }
        return rowBuilder_;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> args_ =
        java.util.Collections.emptyList();
      private void ensureArgsIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          args_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar>(args_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder, com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> argsBuilder_;

      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> getArgsList() {
        if (argsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(args_);
        } else {
          return argsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public int getArgsCount() {
        if (argsBuilder_ == null) {
          return args_.size();
        } else {
          return argsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar getArgs(int index) {
        if (argsBuilder_ == null) {
          return args_.get(index);
        } else {
          return argsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public Builder setArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar value) {
        if (argsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgsIsMutable();
          args_.set(index, value);
          onChanged();
        } else {
          argsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public Builder setArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.set(index, builderForValue.build());
          onChanged();
        } else {
          argsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public Builder addArgs(com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar value) {
        if (argsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgsIsMutable();
          args_.add(value);
          onChanged();
        } else {
          argsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public Builder addArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar value) {
        if (argsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgsIsMutable();
          args_.add(index, value);
          onChanged();
        } else {
          argsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public Builder addArgs(
          com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.add(builderForValue.build());
          onChanged();
        } else {
          argsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public Builder addArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.add(index, builderForValue.build());
          onChanged();
        } else {
          argsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public Builder addAllArgs(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> values) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, args_);
          onChanged();
        } else {
          argsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public Builder clearArgs() {
        if (argsBuilder_ == null) {
          args_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          argsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public Builder removeArgs(int index) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.remove(index);
          onChanged();
        } else {
          argsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder getArgsBuilder(
          int index) {
        return getArgsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(
          int index) {
        if (argsBuilder_ == null) {
          return args_.get(index);  } else {
          return argsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
           getArgsOrBuilderList() {
        if (argsBuilder_ != null) {
          return argsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(args_);
        }
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder addArgsBuilder() {
        return getArgsFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.getDefaultInstance());
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder addArgsBuilder(
          int index) {
        return getArgsFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.getDefaultInstance());
      }
      /**
       * <pre>
       ** values for parameters used in row expressions 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 5;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder> 
           getArgsBuilderList() {
        return getArgsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder, com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
          getArgsFieldBuilder() {
        if (argsBuilder_ == null) {
          argsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder, com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder>(
                  args_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          args_ = null;
        }
        return argsBuilder_;
      }

      private boolean upsert_ ;
      /**
       * <pre>
       ** true if this should be treated as an Upsert
       *(that is, update on duplicate key) 
       * </pre>
       *
       * <code>optional bool upsert = 6 [default = false];</code>
       * @return Whether the upsert field is set.
       */
      @java.lang.Override
      public boolean hasUpsert() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       ** true if this should be treated as an Upsert
       *(that is, update on duplicate key) 
       * </pre>
       *
       * <code>optional bool upsert = 6 [default = false];</code>
       * @return The upsert.
       */
      @java.lang.Override
      public boolean getUpsert() {
        return upsert_;
      }
      /**
       * <pre>
       ** true if this should be treated as an Upsert
       *(that is, update on duplicate key) 
       * </pre>
       *
       * <code>optional bool upsert = 6 [default = false];</code>
       * @param value The upsert to set.
       * @return This builder for chaining.
       */
      public Builder setUpsert(boolean value) {

        upsert_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** true if this should be treated as an Upsert
       *(that is, update on duplicate key) 
       * </pre>
       *
       * <code>optional bool upsert = 6 [default = false];</code>
       * @return This builder for chaining.
       */
      public Builder clearUpsert() {
        bitField0_ = (bitField0_ & ~0x00000020);
        upsert_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.Insert)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.Insert)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.Insert DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.Insert();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Insert getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Insert>
        PARSER = new com.google.protobuf.AbstractParser<Insert>() {
      @java.lang.Override
      public Insert parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Insert> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Insert> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Insert getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UpdateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.Update)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     ** collection to change 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
     * @return Whether the collection field is set.
     */
    boolean hasCollection();
    /**
     * <pre>
     ** collection to change 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
     * @return The collection.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection();
    /**
     * <pre>
     ** collection to change 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder();

    /**
     * <pre>
     ** datamodel that the operations refer to  
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
     * @return Whether the dataModel field is set.
     */
    boolean hasDataModel();
    /**
     * <pre>
     ** datamodel that the operations refer to  
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
     * @return The dataModel.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.DataModel getDataModel();

    /**
     * <pre>
     ** filter expression to match rows that the operations will apply on 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
     * @return Whether the criteria field is set.
     */
    boolean hasCriteria();
    /**
     * <pre>
     ** filter expression to match rows that the operations will apply on 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
     * @return The criteria.
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.Expr getCriteria();
    /**
     * <pre>
     ** filter expression to match rows that the operations will apply on 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder();

    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
     * @return Whether the limit field is set.
     */
    boolean hasLimit();
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
     * @return The limit.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Limit getLimit();
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder getLimitOrBuilder();

    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> 
        getOrderList();
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Order getOrder(int index);
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
     */
    int getOrderCount();
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> 
        getOrderOrBuilderList();
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder getOrderOrBuilder(
        int index);

    /**
     * <pre>
     ** list of operations to be applied.
     *Valid operations will depend on the data_model 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation> 
        getOperationList();
    /**
     * <pre>
     ** list of operations to be applied.
     *Valid operations will depend on the data_model 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation getOperation(int index);
    /**
     * <pre>
     ** list of operations to be applied.
     *Valid operations will depend on the data_model 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
     */
    int getOperationCount();
    /**
     * <pre>
     ** list of operations to be applied.
     *Valid operations will depend on the data_model 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperationOrBuilder> 
        getOperationOrBuilderList();
    /**
     * <pre>
     ** list of operations to be applied.
     *Valid operations will depend on the data_model 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperationOrBuilder getOperationOrBuilder(
        int index);

    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> 
        getArgsList();
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar getArgs(int index);
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
     */
    int getArgsCount();
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
        getArgsOrBuilderList();
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(
        int index);

    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
     * @return Whether the limitExpr field is set.
     */
    boolean hasLimitExpr();
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
     * @return The limitExpr.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr getLimitExpr();
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder();
  }
  /**
   * <pre>
   **
   *Update documents/rows in a collection/table
   *
   *&#64;returns &#64;ref Mysqlx::Resultset
   * </pre>
   *
   * Protobuf type {@code Mysqlx.Crud.Update}
   */
  public static final class Update extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.Update)
      UpdateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Update.newBuilder() to construct.
    private Update(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Update() {
      dataModel_ = 1;
      order_ = java.util.Collections.emptyList();
      operation_ = java.util.Collections.emptyList();
      args_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Update();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Update_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Update_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.Update.class, com.mysql.cj.x.protobuf.MysqlxCrud.Update.Builder.class);
    }

    private int bitField0_;
    public static final int COLLECTION_FIELD_NUMBER = 2;
    private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
    /**
     * <pre>
     ** collection to change 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
     * @return Whether the collection field is set.
     */
    @java.lang.Override
    public boolean hasCollection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     ** collection to change 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
     * @return The collection.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }
    /**
     * <pre>
     ** collection to change 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }

    public static final int DATA_MODEL_FIELD_NUMBER = 3;
    private int dataModel_ = 1;
    /**
     * <pre>
     ** datamodel that the operations refer to  
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
     * @return Whether the dataModel field is set.
     */
    @java.lang.Override public boolean hasDataModel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     ** datamodel that the operations refer to  
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
     * @return The dataModel.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.DataModel getDataModel() {
      com.mysql.cj.x.protobuf.MysqlxCrud.DataModel result = com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.forNumber(dataModel_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.DOCUMENT : result;
    }

    public static final int CRITERIA_FIELD_NUMBER = 4;
    private com.mysql.cj.x.protobuf.MysqlxExpr.Expr criteria_;
    /**
     * <pre>
     ** filter expression to match rows that the operations will apply on 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
     * @return Whether the criteria field is set.
     */
    @java.lang.Override
    public boolean hasCriteria() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     ** filter expression to match rows that the operations will apply on 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
     * @return The criteria.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getCriteria() {
      return criteria_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : criteria_;
    }
    /**
     * <pre>
     ** filter expression to match rows that the operations will apply on 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder() {
      return criteria_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : criteria_;
    }

    public static final int LIMIT_FIELD_NUMBER = 5;
    private com.mysql.cj.x.protobuf.MysqlxCrud.Limit limit_;
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
     * @return Whether the limit field is set.
     */
    @java.lang.Override
    public boolean hasLimit() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
     * @return The limit.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Limit getLimit() {
      return limit_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance() : limit_;
    }
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder getLimitOrBuilder() {
      return limit_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance() : limit_;
    }

    public static final int ORDER_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> order_;
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> getOrderList() {
      return order_;
    }
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> 
        getOrderOrBuilderList() {
      return order_;
    }
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
     */
    @java.lang.Override
    public int getOrderCount() {
      return order_.size();
    }
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Order getOrder(int index) {
      return order_.get(index);
    }
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder getOrderOrBuilder(
        int index) {
      return order_.get(index);
    }

    public static final int OPERATION_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation> operation_;
    /**
     * <pre>
     ** list of operations to be applied.
     *Valid operations will depend on the data_model 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation> getOperationList() {
      return operation_;
    }
    /**
     * <pre>
     ** list of operations to be applied.
     *Valid operations will depend on the data_model 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperationOrBuilder> 
        getOperationOrBuilderList() {
      return operation_;
    }
    /**
     * <pre>
     ** list of operations to be applied.
     *Valid operations will depend on the data_model 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
     */
    @java.lang.Override
    public int getOperationCount() {
      return operation_.size();
    }
    /**
     * <pre>
     ** list of operations to be applied.
     *Valid operations will depend on the data_model 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation getOperation(int index) {
      return operation_.get(index);
    }
    /**
     * <pre>
     ** list of operations to be applied.
     *Valid operations will depend on the data_model 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperationOrBuilder getOperationOrBuilder(
        int index) {
      return operation_.get(index);
    }

    public static final int ARGS_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> args_;
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> getArgsList() {
      return args_;
    }
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
        getArgsOrBuilderList() {
      return args_;
    }
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
     */
    @java.lang.Override
    public int getArgsCount() {
      return args_.size();
    }
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar getArgs(int index) {
      return args_.get(index);
    }
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(
        int index) {
      return args_.get(index);
    }

    public static final int LIMIT_EXPR_FIELD_NUMBER = 9;
    private com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr limitExpr_;
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
     * @return Whether the limitExpr field is set.
     */
    @java.lang.Override
    public boolean hasLimitExpr() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
     * @return The limitExpr.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr getLimitExpr() {
      return limitExpr_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance() : limitExpr_;
    }
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder() {
      return limitExpr_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance() : limitExpr_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCollection()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getCollection().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasCriteria()) {
        if (!getCriteria().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasLimit()) {
        if (!getLimit().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getOrderCount(); i++) {
        if (!getOrder(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getOperationCount(); i++) {
        if (!getOperation(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getArgsCount(); i++) {
        if (!getArgs(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasLimitExpr()) {
        if (!getLimitExpr().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(2, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(3, dataModel_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(4, getCriteria());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(5, getLimit());
      }
      for (int i = 0; i < order_.size(); i++) {
        output.writeMessage(6, order_.get(i));
      }
      for (int i = 0; i < operation_.size(); i++) {
        output.writeMessage(7, operation_.get(i));
      }
      for (int i = 0; i < args_.size(); i++) {
        output.writeMessage(8, args_.get(i));
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeMessage(9, getLimitExpr());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, dataModel_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getCriteria());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getLimit());
      }
      for (int i = 0; i < order_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, order_.get(i));
      }
      for (int i = 0; i < operation_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, operation_.get(i));
      }
      for (int i = 0; i < args_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, args_.get(i));
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getLimitExpr());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Update)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.Update other = (com.mysql.cj.x.protobuf.MysqlxCrud.Update) obj;

      if (hasCollection() != other.hasCollection()) return false;
      if (hasCollection()) {
        if (!getCollection()
            .equals(other.getCollection())) return false;
      }
      if (hasDataModel() != other.hasDataModel()) return false;
      if (hasDataModel()) {
        if (dataModel_ != other.dataModel_) return false;
      }
      if (hasCriteria() != other.hasCriteria()) return false;
      if (hasCriteria()) {
        if (!getCriteria()
            .equals(other.getCriteria())) return false;
      }
      if (hasLimit() != other.hasLimit()) return false;
      if (hasLimit()) {
        if (!getLimit()
            .equals(other.getLimit())) return false;
      }
      if (!getOrderList()
          .equals(other.getOrderList())) return false;
      if (!getOperationList()
          .equals(other.getOperationList())) return false;
      if (!getArgsList()
          .equals(other.getArgsList())) return false;
      if (hasLimitExpr() != other.hasLimitExpr()) return false;
      if (hasLimitExpr()) {
        if (!getLimitExpr()
            .equals(other.getLimitExpr())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCollection()) {
        hash = (37 * hash) + COLLECTION_FIELD_NUMBER;
        hash = (53 * hash) + getCollection().hashCode();
      }
      if (hasDataModel()) {
        hash = (37 * hash) + DATA_MODEL_FIELD_NUMBER;
        hash = (53 * hash) + dataModel_;
      }
      if (hasCriteria()) {
        hash = (37 * hash) + CRITERIA_FIELD_NUMBER;
        hash = (53 * hash) + getCriteria().hashCode();
      }
      if (hasLimit()) {
        hash = (37 * hash) + LIMIT_FIELD_NUMBER;
        hash = (53 * hash) + getLimit().hashCode();
      }
      if (getOrderCount() > 0) {
        hash = (37 * hash) + ORDER_FIELD_NUMBER;
        hash = (53 * hash) + getOrderList().hashCode();
      }
      if (getOperationCount() > 0) {
        hash = (37 * hash) + OPERATION_FIELD_NUMBER;
        hash = (53 * hash) + getOperationList().hashCode();
      }
      if (getArgsCount() > 0) {
        hash = (37 * hash) + ARGS_FIELD_NUMBER;
        hash = (53 * hash) + getArgsList().hashCode();
      }
      if (hasLimitExpr()) {
        hash = (37 * hash) + LIMIT_EXPR_FIELD_NUMBER;
        hash = (53 * hash) + getLimitExpr().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.Update prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     *Update documents/rows in a collection/table
     *
     *&#64;returns &#64;ref Mysqlx::Resultset
     * </pre>
     *
     * Protobuf type {@code Mysqlx.Crud.Update}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.Update)
        com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Update_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Update_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.Update.class, com.mysql.cj.x.protobuf.MysqlxCrud.Update.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.Update.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getCollectionFieldBuilder();
          getCriteriaFieldBuilder();
          getLimitFieldBuilder();
          getOrderFieldBuilder();
          getOperationFieldBuilder();
          getArgsFieldBuilder();
          getLimitExprFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        dataModel_ = 1;
        criteria_ = null;
        if (criteriaBuilder_ != null) {
          criteriaBuilder_.dispose();
          criteriaBuilder_ = null;
        }
        limit_ = null;
        if (limitBuilder_ != null) {
          limitBuilder_.dispose();
          limitBuilder_ = null;
        }
        if (orderBuilder_ == null) {
          order_ = java.util.Collections.emptyList();
        } else {
          order_ = null;
          orderBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        if (operationBuilder_ == null) {
          operation_ = java.util.Collections.emptyList();
        } else {
          operation_ = null;
          operationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        if (argsBuilder_ == null) {
          args_ = java.util.Collections.emptyList();
        } else {
          args_ = null;
          argsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        limitExpr_ = null;
        if (limitExprBuilder_ != null) {
          limitExprBuilder_.dispose();
          limitExprBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Update_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Update getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.Update.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Update build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Update result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Update buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Update result = new com.mysql.cj.x.protobuf.MysqlxCrud.Update(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.mysql.cj.x.protobuf.MysqlxCrud.Update result) {
        if (orderBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            order_ = java.util.Collections.unmodifiableList(order_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.order_ = order_;
        } else {
          result.order_ = orderBuilder_.build();
        }
        if (operationBuilder_ == null) {
          if (((bitField0_ & 0x00000020) != 0)) {
            operation_ = java.util.Collections.unmodifiableList(operation_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.operation_ = operation_;
        } else {
          result.operation_ = operationBuilder_.build();
        }
        if (argsBuilder_ == null) {
          if (((bitField0_ & 0x00000040) != 0)) {
            args_ = java.util.Collections.unmodifiableList(args_);
            bitField0_ = (bitField0_ & ~0x00000040);
          }
          result.args_ = args_;
        } else {
          result.args_ = argsBuilder_.build();
        }
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.Update result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.collection_ = collectionBuilder_ == null
              ? collection_
              : collectionBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.dataModel_ = dataModel_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.criteria_ = criteriaBuilder_ == null
              ? criteria_
              : criteriaBuilder_.build();
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.limit_ = limitBuilder_ == null
              ? limit_
              : limitBuilder_.build();
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          result.limitExpr_ = limitExprBuilder_ == null
              ? limitExpr_
              : limitExprBuilder_.build();
          to_bitField0_ |= 0x00000010;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Update) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.Update)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.Update other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.Update.getDefaultInstance()) return this;
        if (other.hasCollection()) {
          mergeCollection(other.getCollection());
        }
        if (other.hasDataModel()) {
          setDataModel(other.getDataModel());
        }
        if (other.hasCriteria()) {
          mergeCriteria(other.getCriteria());
        }
        if (other.hasLimit()) {
          mergeLimit(other.getLimit());
        }
        if (orderBuilder_ == null) {
          if (!other.order_.isEmpty()) {
            if (order_.isEmpty()) {
              order_ = other.order_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureOrderIsMutable();
              order_.addAll(other.order_);
            }
            onChanged();
          }
        } else {
          if (!other.order_.isEmpty()) {
            if (orderBuilder_.isEmpty()) {
              orderBuilder_.dispose();
              orderBuilder_ = null;
              order_ = other.order_;
              bitField0_ = (bitField0_ & ~0x00000010);
              orderBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOrderFieldBuilder() : null;
            } else {
              orderBuilder_.addAllMessages(other.order_);
            }
          }
        }
        if (operationBuilder_ == null) {
          if (!other.operation_.isEmpty()) {
            if (operation_.isEmpty()) {
              operation_ = other.operation_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensureOperationIsMutable();
              operation_.addAll(other.operation_);
            }
            onChanged();
          }
        } else {
          if (!other.operation_.isEmpty()) {
            if (operationBuilder_.isEmpty()) {
              operationBuilder_.dispose();
              operationBuilder_ = null;
              operation_ = other.operation_;
              bitField0_ = (bitField0_ & ~0x00000020);
              operationBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOperationFieldBuilder() : null;
            } else {
              operationBuilder_.addAllMessages(other.operation_);
            }
          }
        }
        if (argsBuilder_ == null) {
          if (!other.args_.isEmpty()) {
            if (args_.isEmpty()) {
              args_ = other.args_;
              bitField0_ = (bitField0_ & ~0x00000040);
            } else {
              ensureArgsIsMutable();
              args_.addAll(other.args_);
            }
            onChanged();
          }
        } else {
          if (!other.args_.isEmpty()) {
            if (argsBuilder_.isEmpty()) {
              argsBuilder_.dispose();
              argsBuilder_ = null;
              args_ = other.args_;
              bitField0_ = (bitField0_ & ~0x00000040);
              argsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getArgsFieldBuilder() : null;
            } else {
              argsBuilder_.addAllMessages(other.args_);
            }
          }
        }
        if (other.hasLimitExpr()) {
          mergeLimitExpr(other.getLimitExpr());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasCollection()) {
          return false;
        }
        if (!getCollection().isInitialized()) {
          return false;
        }
        if (hasCriteria()) {
          if (!getCriteria().isInitialized()) {
            return false;
          }
        }
        if (hasLimit()) {
          if (!getLimit().isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getOrderCount(); i++) {
          if (!getOrder(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getOperationCount(); i++) {
          if (!getOperation(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getArgsCount(); i++) {
          if (!getArgs(i).isInitialized()) {
            return false;
          }
        }
        if (hasLimitExpr()) {
          if (!getLimitExpr().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 18: {
                input.readMessage(
                    getCollectionFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 18
              case 24: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.DataModel tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(3, tmpRaw);
                } else {
                  dataModel_ = tmpRaw;
                  bitField0_ |= 0x00000002;
                }
                break;
              } // case 24
              case 34: {
                input.readMessage(
                    getCriteriaFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 34
              case 42: {
                input.readMessage(
                    getLimitFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 42
              case 50: {
                com.mysql.cj.x.protobuf.MysqlxCrud.Order m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxCrud.Order.PARSER,
                        extensionRegistry);
                if (orderBuilder_ == null) {
                  ensureOrderIsMutable();
                  order_.add(m);
                } else {
                  orderBuilder_.addMessage(m);
                }
                break;
              } // case 50
              case 58: {
                com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.PARSER,
                        extensionRegistry);
                if (operationBuilder_ == null) {
                  ensureOperationIsMutable();
                  operation_.add(m);
                } else {
                  operationBuilder_.addMessage(m);
                }
                break;
              } // case 58
              case 66: {
                com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.PARSER,
                        extensionRegistry);
                if (argsBuilder_ == null) {
                  ensureArgsIsMutable();
                  args_.add(m);
                } else {
                  argsBuilder_.addMessage(m);
                }
                break;
              } // case 66
              case 74: {
                input.readMessage(
                    getLimitExprFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000080;
                break;
              } // case 74
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       * @return Whether the collection field is set.
       */
      public boolean hasCollection() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       * @return The collection.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
        if (collectionBuilder_ == null) {
          return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        } else {
          return collectionBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      public Builder setCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          collection_ = value;
        } else {
          collectionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      public Builder setCollection(
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder builderForValue) {
        if (collectionBuilder_ == null) {
          collection_ = builderForValue.build();
        } else {
          collectionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      public Builder mergeCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            collection_ != null &&
            collection_ != com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance()) {
            getCollectionBuilder().mergeFrom(value);
          } else {
            collection_ = value;
          }
        } else {
          collectionBuilder_.mergeFrom(value);
        }
        if (collection_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      public Builder clearCollection() {
        bitField0_ = (bitField0_ & ~0x00000001);
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder getCollectionBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCollectionFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
        if (collectionBuilder_ != null) {
          return collectionBuilder_.getMessageOrBuilder();
        } else {
          return collection_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        }
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> 
          getCollectionFieldBuilder() {
        if (collectionBuilder_ == null) {
          collectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder>(
                  getCollection(),
                  getParentForChildren(),
                  isClean());
          collection_ = null;
        }
        return collectionBuilder_;
      }

      private int dataModel_ = 1;
      /**
       * <pre>
       ** datamodel that the operations refer to  
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
       * @return Whether the dataModel field is set.
       */
      @java.lang.Override public boolean hasDataModel() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       ** datamodel that the operations refer to  
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
       * @return The dataModel.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.DataModel getDataModel() {
        com.mysql.cj.x.protobuf.MysqlxCrud.DataModel result = com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.forNumber(dataModel_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.DOCUMENT : result;
      }
      /**
       * <pre>
       ** datamodel that the operations refer to  
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
       * @param value The dataModel to set.
       * @return This builder for chaining.
       */
      public Builder setDataModel(com.mysql.cj.x.protobuf.MysqlxCrud.DataModel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        dataModel_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** datamodel that the operations refer to  
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDataModel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dataModel_ = 1;
        onChanged();
        return this;
      }

      private com.mysql.cj.x.protobuf.MysqlxExpr.Expr criteria_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> criteriaBuilder_;
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
       * @return Whether the criteria field is set.
       */
      public boolean hasCriteria() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
       * @return The criteria.
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getCriteria() {
        if (criteriaBuilder_ == null) {
          return criteria_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : criteria_;
        } else {
          return criteriaBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
       */
      public Builder setCriteria(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (criteriaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          criteria_ = value;
        } else {
          criteriaBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
       */
      public Builder setCriteria(
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
        if (criteriaBuilder_ == null) {
          criteria_ = builderForValue.build();
        } else {
          criteriaBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
       */
      public Builder mergeCriteria(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (criteriaBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            criteria_ != null &&
            criteria_ != com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance()) {
            getCriteriaBuilder().mergeFrom(value);
          } else {
            criteria_ = value;
          }
        } else {
          criteriaBuilder_.mergeFrom(value);
        }
        if (criteria_ != null) {
          bitField0_ |= 0x00000004;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
       */
      public Builder clearCriteria() {
        bitField0_ = (bitField0_ & ~0x00000004);
        criteria_ = null;
        if (criteriaBuilder_ != null) {
          criteriaBuilder_.dispose();
          criteriaBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder getCriteriaBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getCriteriaFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder() {
        if (criteriaBuilder_ != null) {
          return criteriaBuilder_.getMessageOrBuilder();
        } else {
          return criteria_ == null ?
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : criteria_;
        }
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
          getCriteriaFieldBuilder() {
        if (criteriaBuilder_ == null) {
          criteriaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder>(
                  getCriteria(),
                  getParentForChildren(),
                  isClean());
          criteria_ = null;
        }
        return criteriaBuilder_;
      }

      private com.mysql.cj.x.protobuf.MysqlxCrud.Limit limit_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Limit, com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder> limitBuilder_;
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
       * @return Whether the limit field is set.
       */
      public boolean hasLimit() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
       * @return The limit.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Limit getLimit() {
        if (limitBuilder_ == null) {
          return limit_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance() : limit_;
        } else {
          return limitBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
       */
      public Builder setLimit(com.mysql.cj.x.protobuf.MysqlxCrud.Limit value) {
        if (limitBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          limit_ = value;
        } else {
          limitBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
       */
      public Builder setLimit(
          com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder builderForValue) {
        if (limitBuilder_ == null) {
          limit_ = builderForValue.build();
        } else {
          limitBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
       */
      public Builder mergeLimit(com.mysql.cj.x.protobuf.MysqlxCrud.Limit value) {
        if (limitBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
            limit_ != null &&
            limit_ != com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance()) {
            getLimitBuilder().mergeFrom(value);
          } else {
            limit_ = value;
          }
        } else {
          limitBuilder_.mergeFrom(value);
        }
        if (limit_ != null) {
          bitField0_ |= 0x00000008;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
       */
      public Builder clearLimit() {
        bitField0_ = (bitField0_ & ~0x00000008);
        limit_ = null;
        if (limitBuilder_ != null) {
          limitBuilder_.dispose();
          limitBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder getLimitBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getLimitFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder getLimitOrBuilder() {
        if (limitBuilder_ != null) {
          return limitBuilder_.getMessageOrBuilder();
        } else {
          return limit_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance() : limit_;
        }
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Limit, com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder> 
          getLimitFieldBuilder() {
        if (limitBuilder_ == null) {
          limitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Limit, com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder>(
                  getLimit(),
                  getParentForChildren(),
                  isClean());
          limit_ = null;
        }
        return limitBuilder_;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> order_ =
        java.util.Collections.emptyList();
      private void ensureOrderIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          order_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxCrud.Order>(order_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Order, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> orderBuilder_;

      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> getOrderList() {
        if (orderBuilder_ == null) {
          return java.util.Collections.unmodifiableList(order_);
        } else {
          return orderBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public int getOrderCount() {
        if (orderBuilder_ == null) {
          return order_.size();
        } else {
          return orderBuilder_.getCount();
        }
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order getOrder(int index) {
        if (orderBuilder_ == null) {
          return order_.get(index);
        } else {
          return orderBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public Builder setOrder(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Order value) {
        if (orderBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOrderIsMutable();
          order_.set(index, value);
          onChanged();
        } else {
          orderBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public Builder setOrder(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder builderForValue) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          order_.set(index, builderForValue.build());
          onChanged();
        } else {
          orderBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public Builder addOrder(com.mysql.cj.x.protobuf.MysqlxCrud.Order value) {
        if (orderBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOrderIsMutable();
          order_.add(value);
          onChanged();
        } else {
          orderBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public Builder addOrder(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Order value) {
        if (orderBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOrderIsMutable();
          order_.add(index, value);
          onChanged();
        } else {
          orderBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public Builder addOrder(
          com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder builderForValue) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          order_.add(builderForValue.build());
          onChanged();
        } else {
          orderBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public Builder addOrder(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder builderForValue) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          order_.add(index, builderForValue.build());
          onChanged();
        } else {
          orderBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public Builder addAllOrder(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxCrud.Order> values) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, order_);
          onChanged();
        } else {
          orderBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public Builder clearOrder() {
        if (orderBuilder_ == null) {
          order_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          orderBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public Builder removeOrder(int index) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          order_.remove(index);
          onChanged();
        } else {
          orderBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder getOrderBuilder(
          int index) {
        return getOrderFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder getOrderOrBuilder(
          int index) {
        if (orderBuilder_ == null) {
          return order_.get(index);  } else {
          return orderBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> 
           getOrderOrBuilderList() {
        if (orderBuilder_ != null) {
          return orderBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(order_);
        }
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder addOrderBuilder() {
        return getOrderFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxCrud.Order.getDefaultInstance());
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder addOrderBuilder(
          int index) {
        return getOrderFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxCrud.Order.getDefaultInstance());
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 6;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder> 
           getOrderBuilderList() {
        return getOrderFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Order, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> 
          getOrderFieldBuilder() {
        if (orderBuilder_ == null) {
          orderBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Order, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder>(
                  order_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          order_ = null;
        }
        return orderBuilder_;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation> operation_ =
        java.util.Collections.emptyList();
      private void ensureOperationIsMutable() {
        if (!((bitField0_ & 0x00000020) != 0)) {
          operation_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation>(operation_);
          bitField0_ |= 0x00000020;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperationOrBuilder> operationBuilder_;

      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation> getOperationList() {
        if (operationBuilder_ == null) {
          return java.util.Collections.unmodifiableList(operation_);
        } else {
          return operationBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public int getOperationCount() {
        if (operationBuilder_ == null) {
          return operation_.size();
        } else {
          return operationBuilder_.getCount();
        }
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation getOperation(int index) {
        if (operationBuilder_ == null) {
          return operation_.get(index);
        } else {
          return operationBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public Builder setOperation(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation value) {
        if (operationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOperationIsMutable();
          operation_.set(index, value);
          onChanged();
        } else {
          operationBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public Builder setOperation(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.Builder builderForValue) {
        if (operationBuilder_ == null) {
          ensureOperationIsMutable();
          operation_.set(index, builderForValue.build());
          onChanged();
        } else {
          operationBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public Builder addOperation(com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation value) {
        if (operationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOperationIsMutable();
          operation_.add(value);
          onChanged();
        } else {
          operationBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public Builder addOperation(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation value) {
        if (operationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOperationIsMutable();
          operation_.add(index, value);
          onChanged();
        } else {
          operationBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public Builder addOperation(
          com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.Builder builderForValue) {
        if (operationBuilder_ == null) {
          ensureOperationIsMutable();
          operation_.add(builderForValue.build());
          onChanged();
        } else {
          operationBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public Builder addOperation(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.Builder builderForValue) {
        if (operationBuilder_ == null) {
          ensureOperationIsMutable();
          operation_.add(index, builderForValue.build());
          onChanged();
        } else {
          operationBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public Builder addAllOperation(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation> values) {
        if (operationBuilder_ == null) {
          ensureOperationIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, operation_);
          onChanged();
        } else {
          operationBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public Builder clearOperation() {
        if (operationBuilder_ == null) {
          operation_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          operationBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public Builder removeOperation(int index) {
        if (operationBuilder_ == null) {
          ensureOperationIsMutable();
          operation_.remove(index);
          onChanged();
        } else {
          operationBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.Builder getOperationBuilder(
          int index) {
        return getOperationFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperationOrBuilder getOperationOrBuilder(
          int index) {
        if (operationBuilder_ == null) {
          return operation_.get(index);  } else {
          return operationBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperationOrBuilder> 
           getOperationOrBuilderList() {
        if (operationBuilder_ != null) {
          return operationBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(operation_);
        }
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.Builder addOperationBuilder() {
        return getOperationFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.getDefaultInstance());
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.Builder addOperationBuilder(
          int index) {
        return getOperationFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.getDefaultInstance());
      }
      /**
       * <pre>
       ** list of operations to be applied.
       *Valid operations will depend on the data_model 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.UpdateOperation operation = 7;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.Builder> 
           getOperationBuilderList() {
        return getOperationFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperationOrBuilder> 
          getOperationFieldBuilder() {
        if (operationBuilder_ == null) {
          operationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperation.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.UpdateOperationOrBuilder>(
                  operation_,
                  ((bitField0_ & 0x00000020) != 0),
                  getParentForChildren(),
                  isClean());
          operation_ = null;
        }
        return operationBuilder_;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> args_ =
        java.util.Collections.emptyList();
      private void ensureArgsIsMutable() {
        if (!((bitField0_ & 0x00000040) != 0)) {
          args_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar>(args_);
          bitField0_ |= 0x00000040;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder, com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> argsBuilder_;

      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> getArgsList() {
        if (argsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(args_);
        } else {
          return argsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public int getArgsCount() {
        if (argsBuilder_ == null) {
          return args_.size();
        } else {
          return argsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar getArgs(int index) {
        if (argsBuilder_ == null) {
          return args_.get(index);
        } else {
          return argsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public Builder setArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar value) {
        if (argsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgsIsMutable();
          args_.set(index, value);
          onChanged();
        } else {
          argsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public Builder setArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.set(index, builderForValue.build());
          onChanged();
        } else {
          argsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public Builder addArgs(com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar value) {
        if (argsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgsIsMutable();
          args_.add(value);
          onChanged();
        } else {
          argsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public Builder addArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar value) {
        if (argsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgsIsMutable();
          args_.add(index, value);
          onChanged();
        } else {
          argsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public Builder addArgs(
          com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.add(builderForValue.build());
          onChanged();
        } else {
          argsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public Builder addArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.add(index, builderForValue.build());
          onChanged();
        } else {
          argsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public Builder addAllArgs(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> values) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, args_);
          onChanged();
        } else {
          argsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public Builder clearArgs() {
        if (argsBuilder_ == null) {
          args_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
          onChanged();
        } else {
          argsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public Builder removeArgs(int index) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.remove(index);
          onChanged();
        } else {
          argsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder getArgsBuilder(
          int index) {
        return getArgsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(
          int index) {
        if (argsBuilder_ == null) {
          return args_.get(index);  } else {
          return argsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
           getArgsOrBuilderList() {
        if (argsBuilder_ != null) {
          return argsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(args_);
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder addArgsBuilder() {
        return getArgsFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.getDefaultInstance());
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder addArgsBuilder(
          int index) {
        return getArgsFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.getDefaultInstance());
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 8;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder> 
           getArgsBuilderList() {
        return getArgsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder, com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
          getArgsFieldBuilder() {
        if (argsBuilder_ == null) {
          argsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder, com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder>(
                  args_,
                  ((bitField0_ & 0x00000040) != 0),
                  getParentForChildren(),
                  isClean());
          args_ = null;
        }
        return argsBuilder_;
      }

      private com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr limitExpr_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder> limitExprBuilder_;
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
       * @return Whether the limitExpr field is set.
       */
      public boolean hasLimitExpr() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
       * @return The limitExpr.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr getLimitExpr() {
        if (limitExprBuilder_ == null) {
          return limitExpr_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance() : limitExpr_;
        } else {
          return limitExprBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
       */
      public Builder setLimitExpr(com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr value) {
        if (limitExprBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          limitExpr_ = value;
        } else {
          limitExprBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000080;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
       */
      public Builder setLimitExpr(
          com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder builderForValue) {
        if (limitExprBuilder_ == null) {
          limitExpr_ = builderForValue.build();
        } else {
          limitExprBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000080;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
       */
      public Builder mergeLimitExpr(com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr value) {
        if (limitExprBuilder_ == null) {
          if (((bitField0_ & 0x00000080) != 0) &&
            limitExpr_ != null &&
            limitExpr_ != com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance()) {
            getLimitExprBuilder().mergeFrom(value);
          } else {
            limitExpr_ = value;
          }
        } else {
          limitExprBuilder_.mergeFrom(value);
        }
        if (limitExpr_ != null) {
          bitField0_ |= 0x00000080;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
       */
      public Builder clearLimitExpr() {
        bitField0_ = (bitField0_ & ~0x00000080);
        limitExpr_ = null;
        if (limitExprBuilder_ != null) {
          limitExprBuilder_.dispose();
          limitExprBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder getLimitExprBuilder() {
        bitField0_ |= 0x00000080;
        onChanged();
        return getLimitExprFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder() {
        if (limitExprBuilder_ != null) {
          return limitExprBuilder_.getMessageOrBuilder();
        } else {
          return limitExpr_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance() : limitExpr_;
        }
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder> 
          getLimitExprFieldBuilder() {
        if (limitExprBuilder_ == null) {
          limitExprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder>(
                  getLimitExpr(),
                  getParentForChildren(),
                  isClean());
          limitExpr_ = null;
        }
        return limitExprBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.Update)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.Update)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.Update DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.Update();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Update getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Update>
        PARSER = new com.google.protobuf.AbstractParser<Update>() {
      @java.lang.Override
      public Update parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Update> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Update> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Update getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface DeleteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.Delete)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     ** collection to change 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return Whether the collection field is set.
     */
    boolean hasCollection();
    /**
     * <pre>
     ** collection to change 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return The collection.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection();
    /**
     * <pre>
     ** collection to change 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder();

    /**
     * <pre>
     ** data model that the operations refer to 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
     * @return Whether the dataModel field is set.
     */
    boolean hasDataModel();
    /**
     * <pre>
     ** data model that the operations refer to 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
     * @return The dataModel.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.DataModel getDataModel();

    /**
     * <pre>
     ** filter expression to match rows that the operations will apply on 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
     * @return Whether the criteria field is set.
     */
    boolean hasCriteria();
    /**
     * <pre>
     ** filter expression to match rows that the operations will apply on 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
     * @return The criteria.
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.Expr getCriteria();
    /**
     * <pre>
     ** filter expression to match rows that the operations will apply on 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder();

    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
     * @return Whether the limit field is set.
     */
    boolean hasLimit();
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
     * @return The limit.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Limit getLimit();
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder getLimitOrBuilder();

    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> 
        getOrderList();
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Order getOrder(int index);
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
     */
    int getOrderCount();
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> 
        getOrderOrBuilderList();
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder getOrderOrBuilder(
        int index);

    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
     */
    java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> 
        getArgsList();
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar getArgs(int index);
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
     */
    int getArgsCount();
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
     */
    java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
        getArgsOrBuilderList();
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(
        int index);

    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
     * @return Whether the limitExpr field is set.
     */
    boolean hasLimitExpr();
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
     * @return The limitExpr.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr getLimitExpr();
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder();
  }
  /**
   * <pre>
   **
   *Delete documents/rows from a Collection/Table
   *
   *&#64;returns &#64;ref Mysqlx::Resultset
   * </pre>
   *
   * Protobuf type {@code Mysqlx.Crud.Delete}
   */
  public static final class Delete extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.Delete)
      DeleteOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Delete.newBuilder() to construct.
    private Delete(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Delete() {
      dataModel_ = 1;
      order_ = java.util.Collections.emptyList();
      args_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Delete();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Delete_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Delete_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.Delete.class, com.mysql.cj.x.protobuf.MysqlxCrud.Delete.Builder.class);
    }

    private int bitField0_;
    public static final int COLLECTION_FIELD_NUMBER = 1;
    private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
    /**
     * <pre>
     ** collection to change 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return Whether the collection field is set.
     */
    @java.lang.Override
    public boolean hasCollection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     ** collection to change 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return The collection.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }
    /**
     * <pre>
     ** collection to change 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }

    public static final int DATA_MODEL_FIELD_NUMBER = 2;
    private int dataModel_ = 1;
    /**
     * <pre>
     ** data model that the operations refer to 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
     * @return Whether the dataModel field is set.
     */
    @java.lang.Override public boolean hasDataModel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     ** data model that the operations refer to 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
     * @return The dataModel.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.DataModel getDataModel() {
      com.mysql.cj.x.protobuf.MysqlxCrud.DataModel result = com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.forNumber(dataModel_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.DOCUMENT : result;
    }

    public static final int CRITERIA_FIELD_NUMBER = 3;
    private com.mysql.cj.x.protobuf.MysqlxExpr.Expr criteria_;
    /**
     * <pre>
     ** filter expression to match rows that the operations will apply on 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
     * @return Whether the criteria field is set.
     */
    @java.lang.Override
    public boolean hasCriteria() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     ** filter expression to match rows that the operations will apply on 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
     * @return The criteria.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getCriteria() {
      return criteria_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : criteria_;
    }
    /**
     * <pre>
     ** filter expression to match rows that the operations will apply on 
     * </pre>
     *
     * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder() {
      return criteria_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : criteria_;
    }

    public static final int LIMIT_FIELD_NUMBER = 4;
    private com.mysql.cj.x.protobuf.MysqlxCrud.Limit limit_;
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
     * @return Whether the limit field is set.
     */
    @java.lang.Override
    public boolean hasLimit() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
     * @return The limit.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Limit getLimit() {
      return limit_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance() : limit_;
    }
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder getLimitOrBuilder() {
      return limit_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance() : limit_;
    }

    public static final int ORDER_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> order_;
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> getOrderList() {
      return order_;
    }
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> 
        getOrderOrBuilderList() {
      return order_;
    }
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
     */
    @java.lang.Override
    public int getOrderCount() {
      return order_.size();
    }
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Order getOrder(int index) {
      return order_.get(index);
    }
    /**
     * <pre>
     ** specifies order of matched rows 
     * </pre>
     *
     * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder getOrderOrBuilder(
        int index) {
      return order_.get(index);
    }

    public static final int ARGS_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> args_;
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
     */
    @java.lang.Override
    public java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> getArgsList() {
      return args_;
    }
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
        getArgsOrBuilderList() {
      return args_;
    }
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
     */
    @java.lang.Override
    public int getArgsCount() {
      return args_.size();
    }
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar getArgs(int index) {
      return args_.get(index);
    }
    /**
     * <pre>
     ** values for parameters used in filter expression 
     * </pre>
     *
     * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(
        int index) {
      return args_.get(index);
    }

    public static final int LIMIT_EXPR_FIELD_NUMBER = 7;
    private com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr limitExpr_;
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
     * @return Whether the limitExpr field is set.
     */
    @java.lang.Override
    public boolean hasLimitExpr() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
     * @return The limitExpr.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr getLimitExpr() {
      return limitExpr_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance() : limitExpr_;
    }
    /**
     * <pre>
     ** limits the number of rows to match
     *(user can set one of: limit, limit_expr) 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder() {
      return limitExpr_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance() : limitExpr_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCollection()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getCollection().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasCriteria()) {
        if (!getCriteria().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasLimit()) {
        if (!getLimit().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getOrderCount(); i++) {
        if (!getOrder(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getArgsCount(); i++) {
        if (!getArgs(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasLimitExpr()) {
        if (!getLimitExpr().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, dataModel_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(3, getCriteria());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(4, getLimit());
      }
      for (int i = 0; i < order_.size(); i++) {
        output.writeMessage(5, order_.get(i));
      }
      for (int i = 0; i < args_.size(); i++) {
        output.writeMessage(6, args_.get(i));
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeMessage(7, getLimitExpr());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, dataModel_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getCriteria());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getLimit());
      }
      for (int i = 0; i < order_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, order_.get(i));
      }
      for (int i = 0; i < args_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, args_.get(i));
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getLimitExpr());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Delete)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.Delete other = (com.mysql.cj.x.protobuf.MysqlxCrud.Delete) obj;

      if (hasCollection() != other.hasCollection()) return false;
      if (hasCollection()) {
        if (!getCollection()
            .equals(other.getCollection())) return false;
      }
      if (hasDataModel() != other.hasDataModel()) return false;
      if (hasDataModel()) {
        if (dataModel_ != other.dataModel_) return false;
      }
      if (hasCriteria() != other.hasCriteria()) return false;
      if (hasCriteria()) {
        if (!getCriteria()
            .equals(other.getCriteria())) return false;
      }
      if (hasLimit() != other.hasLimit()) return false;
      if (hasLimit()) {
        if (!getLimit()
            .equals(other.getLimit())) return false;
      }
      if (!getOrderList()
          .equals(other.getOrderList())) return false;
      if (!getArgsList()
          .equals(other.getArgsList())) return false;
      if (hasLimitExpr() != other.hasLimitExpr()) return false;
      if (hasLimitExpr()) {
        if (!getLimitExpr()
            .equals(other.getLimitExpr())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCollection()) {
        hash = (37 * hash) + COLLECTION_FIELD_NUMBER;
        hash = (53 * hash) + getCollection().hashCode();
      }
      if (hasDataModel()) {
        hash = (37 * hash) + DATA_MODEL_FIELD_NUMBER;
        hash = (53 * hash) + dataModel_;
      }
      if (hasCriteria()) {
        hash = (37 * hash) + CRITERIA_FIELD_NUMBER;
        hash = (53 * hash) + getCriteria().hashCode();
      }
      if (hasLimit()) {
        hash = (37 * hash) + LIMIT_FIELD_NUMBER;
        hash = (53 * hash) + getLimit().hashCode();
      }
      if (getOrderCount() > 0) {
        hash = (37 * hash) + ORDER_FIELD_NUMBER;
        hash = (53 * hash) + getOrderList().hashCode();
      }
      if (getArgsCount() > 0) {
        hash = (37 * hash) + ARGS_FIELD_NUMBER;
        hash = (53 * hash) + getArgsList().hashCode();
      }
      if (hasLimitExpr()) {
        hash = (37 * hash) + LIMIT_EXPR_FIELD_NUMBER;
        hash = (53 * hash) + getLimitExpr().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.Delete prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     *Delete documents/rows from a Collection/Table
     *
     *&#64;returns &#64;ref Mysqlx::Resultset
     * </pre>
     *
     * Protobuf type {@code Mysqlx.Crud.Delete}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.Delete)
        com.mysql.cj.x.protobuf.MysqlxCrud.DeleteOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Delete_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Delete_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.Delete.class, com.mysql.cj.x.protobuf.MysqlxCrud.Delete.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.Delete.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getCollectionFieldBuilder();
          getCriteriaFieldBuilder();
          getLimitFieldBuilder();
          getOrderFieldBuilder();
          getArgsFieldBuilder();
          getLimitExprFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        dataModel_ = 1;
        criteria_ = null;
        if (criteriaBuilder_ != null) {
          criteriaBuilder_.dispose();
          criteriaBuilder_ = null;
        }
        limit_ = null;
        if (limitBuilder_ != null) {
          limitBuilder_.dispose();
          limitBuilder_ = null;
        }
        if (orderBuilder_ == null) {
          order_ = java.util.Collections.emptyList();
        } else {
          order_ = null;
          orderBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        if (argsBuilder_ == null) {
          args_ = java.util.Collections.emptyList();
        } else {
          args_ = null;
          argsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        limitExpr_ = null;
        if (limitExprBuilder_ != null) {
          limitExprBuilder_.dispose();
          limitExprBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_Delete_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Delete getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.Delete.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Delete build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Delete result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.Delete buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.Delete result = new com.mysql.cj.x.protobuf.MysqlxCrud.Delete(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.mysql.cj.x.protobuf.MysqlxCrud.Delete result) {
        if (orderBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            order_ = java.util.Collections.unmodifiableList(order_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.order_ = order_;
        } else {
          result.order_ = orderBuilder_.build();
        }
        if (argsBuilder_ == null) {
          if (((bitField0_ & 0x00000020) != 0)) {
            args_ = java.util.Collections.unmodifiableList(args_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.args_ = args_;
        } else {
          result.args_ = argsBuilder_.build();
        }
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.Delete result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.collection_ = collectionBuilder_ == null
              ? collection_
              : collectionBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.dataModel_ = dataModel_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.criteria_ = criteriaBuilder_ == null
              ? criteria_
              : criteriaBuilder_.build();
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.limit_ = limitBuilder_ == null
              ? limit_
              : limitBuilder_.build();
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.limitExpr_ = limitExprBuilder_ == null
              ? limitExpr_
              : limitExprBuilder_.build();
          to_bitField0_ |= 0x00000010;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.Delete) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.Delete)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.Delete other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.Delete.getDefaultInstance()) return this;
        if (other.hasCollection()) {
          mergeCollection(other.getCollection());
        }
        if (other.hasDataModel()) {
          setDataModel(other.getDataModel());
        }
        if (other.hasCriteria()) {
          mergeCriteria(other.getCriteria());
        }
        if (other.hasLimit()) {
          mergeLimit(other.getLimit());
        }
        if (orderBuilder_ == null) {
          if (!other.order_.isEmpty()) {
            if (order_.isEmpty()) {
              order_ = other.order_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureOrderIsMutable();
              order_.addAll(other.order_);
            }
            onChanged();
          }
        } else {
          if (!other.order_.isEmpty()) {
            if (orderBuilder_.isEmpty()) {
              orderBuilder_.dispose();
              orderBuilder_ = null;
              order_ = other.order_;
              bitField0_ = (bitField0_ & ~0x00000010);
              orderBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOrderFieldBuilder() : null;
            } else {
              orderBuilder_.addAllMessages(other.order_);
            }
          }
        }
        if (argsBuilder_ == null) {
          if (!other.args_.isEmpty()) {
            if (args_.isEmpty()) {
              args_ = other.args_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensureArgsIsMutable();
              args_.addAll(other.args_);
            }
            onChanged();
          }
        } else {
          if (!other.args_.isEmpty()) {
            if (argsBuilder_.isEmpty()) {
              argsBuilder_.dispose();
              argsBuilder_ = null;
              args_ = other.args_;
              bitField0_ = (bitField0_ & ~0x00000020);
              argsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getArgsFieldBuilder() : null;
            } else {
              argsBuilder_.addAllMessages(other.args_);
            }
          }
        }
        if (other.hasLimitExpr()) {
          mergeLimitExpr(other.getLimitExpr());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasCollection()) {
          return false;
        }
        if (!getCollection().isInitialized()) {
          return false;
        }
        if (hasCriteria()) {
          if (!getCriteria().isInitialized()) {
            return false;
          }
        }
        if (hasLimit()) {
          if (!getLimit().isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getOrderCount(); i++) {
          if (!getOrder(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getArgsCount(); i++) {
          if (!getArgs(i).isInitialized()) {
            return false;
          }
        }
        if (hasLimitExpr()) {
          if (!getLimitExpr().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getCollectionFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.DataModel tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(2, tmpRaw);
                } else {
                  dataModel_ = tmpRaw;
                  bitField0_ |= 0x00000002;
                }
                break;
              } // case 16
              case 26: {
                input.readMessage(
                    getCriteriaFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                input.readMessage(
                    getLimitFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 42: {
                com.mysql.cj.x.protobuf.MysqlxCrud.Order m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxCrud.Order.PARSER,
                        extensionRegistry);
                if (orderBuilder_ == null) {
                  ensureOrderIsMutable();
                  order_.add(m);
                } else {
                  orderBuilder_.addMessage(m);
                }
                break;
              } // case 42
              case 50: {
                com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar m =
                    input.readMessage(
                        com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.PARSER,
                        extensionRegistry);
                if (argsBuilder_ == null) {
                  ensureArgsIsMutable();
                  args_.add(m);
                } else {
                  argsBuilder_.addMessage(m);
                }
                break;
              } // case 50
              case 58: {
                input.readMessage(
                    getLimitExprFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000040;
                break;
              } // case 58
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       * @return Whether the collection field is set.
       */
      public boolean hasCollection() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       * @return The collection.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
        if (collectionBuilder_ == null) {
          return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        } else {
          return collectionBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder setCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          collection_ = value;
        } else {
          collectionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder setCollection(
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder builderForValue) {
        if (collectionBuilder_ == null) {
          collection_ = builderForValue.build();
        } else {
          collectionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder mergeCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            collection_ != null &&
            collection_ != com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance()) {
            getCollectionBuilder().mergeFrom(value);
          } else {
            collection_ = value;
          }
        } else {
          collectionBuilder_.mergeFrom(value);
        }
        if (collection_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder clearCollection() {
        bitField0_ = (bitField0_ & ~0x00000001);
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder getCollectionBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCollectionFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
        if (collectionBuilder_ != null) {
          return collectionBuilder_.getMessageOrBuilder();
        } else {
          return collection_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        }
      }
      /**
       * <pre>
       ** collection to change 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> 
          getCollectionFieldBuilder() {
        if (collectionBuilder_ == null) {
          collectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder>(
                  getCollection(),
                  getParentForChildren(),
                  isClean());
          collection_ = null;
        }
        return collectionBuilder_;
      }

      private int dataModel_ = 1;
      /**
       * <pre>
       ** data model that the operations refer to 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
       * @return Whether the dataModel field is set.
       */
      @java.lang.Override public boolean hasDataModel() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       ** data model that the operations refer to 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
       * @return The dataModel.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.DataModel getDataModel() {
        com.mysql.cj.x.protobuf.MysqlxCrud.DataModel result = com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.forNumber(dataModel_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.DataModel.DOCUMENT : result;
      }
      /**
       * <pre>
       ** data model that the operations refer to 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
       * @param value The dataModel to set.
       * @return This builder for chaining.
       */
      public Builder setDataModel(com.mysql.cj.x.protobuf.MysqlxCrud.DataModel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        dataModel_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** data model that the operations refer to 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.DataModel data_model = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDataModel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dataModel_ = 1;
        onChanged();
        return this;
      }

      private com.mysql.cj.x.protobuf.MysqlxExpr.Expr criteria_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> criteriaBuilder_;
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
       * @return Whether the criteria field is set.
       */
      public boolean hasCriteria() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
       * @return The criteria.
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr getCriteria() {
        if (criteriaBuilder_ == null) {
          return criteria_ == null ? com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : criteria_;
        } else {
          return criteriaBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
       */
      public Builder setCriteria(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (criteriaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          criteria_ = value;
        } else {
          criteriaBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
       */
      public Builder setCriteria(
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder builderForValue) {
        if (criteriaBuilder_ == null) {
          criteria_ = builderForValue.build();
        } else {
          criteriaBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
       */
      public Builder mergeCriteria(com.mysql.cj.x.protobuf.MysqlxExpr.Expr value) {
        if (criteriaBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            criteria_ != null &&
            criteria_ != com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance()) {
            getCriteriaBuilder().mergeFrom(value);
          } else {
            criteria_ = value;
          }
        } else {
          criteriaBuilder_.mergeFrom(value);
        }
        if (criteria_ != null) {
          bitField0_ |= 0x00000004;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
       */
      public Builder clearCriteria() {
        bitField0_ = (bitField0_ & ~0x00000004);
        criteria_ = null;
        if (criteriaBuilder_ != null) {
          criteriaBuilder_.dispose();
          criteriaBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder getCriteriaBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getCriteriaFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder getCriteriaOrBuilder() {
        if (criteriaBuilder_ != null) {
          return criteriaBuilder_.getMessageOrBuilder();
        } else {
          return criteria_ == null ?
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr.getDefaultInstance() : criteria_;
        }
      }
      /**
       * <pre>
       ** filter expression to match rows that the operations will apply on 
       * </pre>
       *
       * <code>optional .Mysqlx.Expr.Expr criteria = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder> 
          getCriteriaFieldBuilder() {
        if (criteriaBuilder_ == null) {
          criteriaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxExpr.Expr, com.mysql.cj.x.protobuf.MysqlxExpr.Expr.Builder, com.mysql.cj.x.protobuf.MysqlxExpr.ExprOrBuilder>(
                  getCriteria(),
                  getParentForChildren(),
                  isClean());
          criteria_ = null;
        }
        return criteriaBuilder_;
      }

      private com.mysql.cj.x.protobuf.MysqlxCrud.Limit limit_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Limit, com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder> limitBuilder_;
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
       * @return Whether the limit field is set.
       */
      public boolean hasLimit() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
       * @return The limit.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Limit getLimit() {
        if (limitBuilder_ == null) {
          return limit_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance() : limit_;
        } else {
          return limitBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
       */
      public Builder setLimit(com.mysql.cj.x.protobuf.MysqlxCrud.Limit value) {
        if (limitBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          limit_ = value;
        } else {
          limitBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
       */
      public Builder setLimit(
          com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder builderForValue) {
        if (limitBuilder_ == null) {
          limit_ = builderForValue.build();
        } else {
          limitBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
       */
      public Builder mergeLimit(com.mysql.cj.x.protobuf.MysqlxCrud.Limit value) {
        if (limitBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
            limit_ != null &&
            limit_ != com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance()) {
            getLimitBuilder().mergeFrom(value);
          } else {
            limit_ = value;
          }
        } else {
          limitBuilder_.mergeFrom(value);
        }
        if (limit_ != null) {
          bitField0_ |= 0x00000008;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
       */
      public Builder clearLimit() {
        bitField0_ = (bitField0_ & ~0x00000008);
        limit_ = null;
        if (limitBuilder_ != null) {
          limitBuilder_.dispose();
          limitBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder getLimitBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getLimitFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder getLimitOrBuilder() {
        if (limitBuilder_ != null) {
          return limitBuilder_.getMessageOrBuilder();
        } else {
          return limit_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.Limit.getDefaultInstance() : limit_;
        }
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Limit limit = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Limit, com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder> 
          getLimitFieldBuilder() {
        if (limitBuilder_ == null) {
          limitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Limit, com.mysql.cj.x.protobuf.MysqlxCrud.Limit.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitOrBuilder>(
                  getLimit(),
                  getParentForChildren(),
                  isClean());
          limit_ = null;
        }
        return limitBuilder_;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> order_ =
        java.util.Collections.emptyList();
      private void ensureOrderIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          order_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxCrud.Order>(order_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Order, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> orderBuilder_;

      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order> getOrderList() {
        if (orderBuilder_ == null) {
          return java.util.Collections.unmodifiableList(order_);
        } else {
          return orderBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public int getOrderCount() {
        if (orderBuilder_ == null) {
          return order_.size();
        } else {
          return orderBuilder_.getCount();
        }
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order getOrder(int index) {
        if (orderBuilder_ == null) {
          return order_.get(index);
        } else {
          return orderBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public Builder setOrder(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Order value) {
        if (orderBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOrderIsMutable();
          order_.set(index, value);
          onChanged();
        } else {
          orderBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public Builder setOrder(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder builderForValue) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          order_.set(index, builderForValue.build());
          onChanged();
        } else {
          orderBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public Builder addOrder(com.mysql.cj.x.protobuf.MysqlxCrud.Order value) {
        if (orderBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOrderIsMutable();
          order_.add(value);
          onChanged();
        } else {
          orderBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public Builder addOrder(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Order value) {
        if (orderBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOrderIsMutable();
          order_.add(index, value);
          onChanged();
        } else {
          orderBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public Builder addOrder(
          com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder builderForValue) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          order_.add(builderForValue.build());
          onChanged();
        } else {
          orderBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public Builder addOrder(
          int index, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder builderForValue) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          order_.add(index, builderForValue.build());
          onChanged();
        } else {
          orderBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public Builder addAllOrder(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxCrud.Order> values) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, order_);
          onChanged();
        } else {
          orderBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public Builder clearOrder() {
        if (orderBuilder_ == null) {
          order_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          orderBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public Builder removeOrder(int index) {
        if (orderBuilder_ == null) {
          ensureOrderIsMutable();
          order_.remove(index);
          onChanged();
        } else {
          orderBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder getOrderBuilder(
          int index) {
        return getOrderFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder getOrderOrBuilder(
          int index) {
        if (orderBuilder_ == null) {
          return order_.get(index);  } else {
          return orderBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> 
           getOrderOrBuilderList() {
        if (orderBuilder_ != null) {
          return orderBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(order_);
        }
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder addOrderBuilder() {
        return getOrderFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxCrud.Order.getDefaultInstance());
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder addOrderBuilder(
          int index) {
        return getOrderFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxCrud.Order.getDefaultInstance());
      }
      /**
       * <pre>
       ** specifies order of matched rows 
       * </pre>
       *
       * <code>repeated .Mysqlx.Crud.Order order = 5;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder> 
           getOrderBuilderList() {
        return getOrderFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Order, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder> 
          getOrderFieldBuilder() {
        if (orderBuilder_ == null) {
          orderBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Order, com.mysql.cj.x.protobuf.MysqlxCrud.Order.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.OrderOrBuilder>(
                  order_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          order_ = null;
        }
        return orderBuilder_;
      }

      private java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> args_ =
        java.util.Collections.emptyList();
      private void ensureArgsIsMutable() {
        if (!((bitField0_ & 0x00000020) != 0)) {
          args_ = new java.util.ArrayList<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar>(args_);
          bitField0_ |= 0x00000020;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder, com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> argsBuilder_;

      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> getArgsList() {
        if (argsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(args_);
        } else {
          return argsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public int getArgsCount() {
        if (argsBuilder_ == null) {
          return args_.size();
        } else {
          return argsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar getArgs(int index) {
        if (argsBuilder_ == null) {
          return args_.get(index);
        } else {
          return argsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public Builder setArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar value) {
        if (argsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgsIsMutable();
          args_.set(index, value);
          onChanged();
        } else {
          argsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public Builder setArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.set(index, builderForValue.build());
          onChanged();
        } else {
          argsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public Builder addArgs(com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar value) {
        if (argsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgsIsMutable();
          args_.add(value);
          onChanged();
        } else {
          argsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public Builder addArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar value) {
        if (argsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgsIsMutable();
          args_.add(index, value);
          onChanged();
        } else {
          argsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public Builder addArgs(
          com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.add(builderForValue.build());
          onChanged();
        } else {
          argsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public Builder addArgs(
          int index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.add(index, builderForValue.build());
          onChanged();
        } else {
          argsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public Builder addAllArgs(
          java.lang.Iterable<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar> values) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, args_);
          onChanged();
        } else {
          argsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public Builder clearArgs() {
        if (argsBuilder_ == null) {
          args_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          argsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public Builder removeArgs(int index) {
        if (argsBuilder_ == null) {
          ensureArgsIsMutable();
          args_.remove(index);
          onChanged();
        } else {
          argsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder getArgsBuilder(
          int index) {
        return getArgsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(
          int index) {
        if (argsBuilder_ == null) {
          return args_.get(index);  } else {
          return argsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public java.util.List<? extends com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
           getArgsOrBuilderList() {
        if (argsBuilder_ != null) {
          return argsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(args_);
        }
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder addArgsBuilder() {
        return getArgsFieldBuilder().addBuilder(
            com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.getDefaultInstance());
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder addArgsBuilder(
          int index) {
        return getArgsFieldBuilder().addBuilder(
            index, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.getDefaultInstance());
      }
      /**
       * <pre>
       ** values for parameters used in filter expression 
       * </pre>
       *
       * <code>repeated .Mysqlx.Datatypes.Scalar args = 6;</code>
       */
      public java.util.List<com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder> 
           getArgsBuilderList() {
        return getArgsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder, com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder> 
          getArgsFieldBuilder() {
        if (argsBuilder_ == null) {
          argsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar, com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.Builder, com.mysql.cj.x.protobuf.MysqlxDatatypes.ScalarOrBuilder>(
                  args_,
                  ((bitField0_ & 0x00000020) != 0),
                  getParentForChildren(),
                  isClean());
          args_ = null;
        }
        return argsBuilder_;
      }

      private com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr limitExpr_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder> limitExprBuilder_;
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
       * @return Whether the limitExpr field is set.
       */
      public boolean hasLimitExpr() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
       * @return The limitExpr.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr getLimitExpr() {
        if (limitExprBuilder_ == null) {
          return limitExpr_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance() : limitExpr_;
        } else {
          return limitExprBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
       */
      public Builder setLimitExpr(com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr value) {
        if (limitExprBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          limitExpr_ = value;
        } else {
          limitExprBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
       */
      public Builder setLimitExpr(
          com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder builderForValue) {
        if (limitExprBuilder_ == null) {
          limitExpr_ = builderForValue.build();
        } else {
          limitExprBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
       */
      public Builder mergeLimitExpr(com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr value) {
        if (limitExprBuilder_ == null) {
          if (((bitField0_ & 0x00000040) != 0) &&
            limitExpr_ != null &&
            limitExpr_ != com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance()) {
            getLimitExprBuilder().mergeFrom(value);
          } else {
            limitExpr_ = value;
          }
        } else {
          limitExprBuilder_.mergeFrom(value);
        }
        if (limitExpr_ != null) {
          bitField0_ |= 0x00000040;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
       */
      public Builder clearLimitExpr() {
        bitField0_ = (bitField0_ & ~0x00000040);
        limitExpr_ = null;
        if (limitExprBuilder_ != null) {
          limitExprBuilder_.dispose();
          limitExprBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder getLimitExprBuilder() {
        bitField0_ |= 0x00000040;
        onChanged();
        return getLimitExprFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder getLimitExprOrBuilder() {
        if (limitExprBuilder_ != null) {
          return limitExprBuilder_.getMessageOrBuilder();
        } else {
          return limitExpr_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.getDefaultInstance() : limitExpr_;
        }
      }
      /**
       * <pre>
       ** limits the number of rows to match
       *(user can set one of: limit, limit_expr) 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.LimitExpr limit_expr = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder> 
          getLimitExprFieldBuilder() {
        if (limitExprBuilder_ == null) {
          limitExprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExpr.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.LimitExprOrBuilder>(
                  getLimitExpr(),
                  getParentForChildren(),
                  isClean());
          limitExpr_ = null;
        }
        return limitExprBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.Delete)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.Delete)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.Delete DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.Delete();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.Delete getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Delete>
        PARSER = new com.google.protobuf.AbstractParser<Delete>() {
      @java.lang.Override
      public Delete parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Delete> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Delete> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Delete getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CreateViewOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.CreateView)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     ** name of the VIEW object, which should be created 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return Whether the collection field is set.
     */
    boolean hasCollection();
    /**
     * <pre>
     ** name of the VIEW object, which should be created 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return The collection.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection();
    /**
     * <pre>
     ** name of the VIEW object, which should be created 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder();

    /**
     * <pre>
     ** user name of the definer, if the value isn't set then the definer
     *is current user 
     * </pre>
     *
     * <code>optional string definer = 2;</code>
     * @return Whether the definer field is set.
     */
    boolean hasDefiner();
    /**
     * <pre>
     ** user name of the definer, if the value isn't set then the definer
     *is current user 
     * </pre>
     *
     * <code>optional string definer = 2;</code>
     * @return The definer.
     */
    java.lang.String getDefiner();
    /**
     * <pre>
     ** user name of the definer, if the value isn't set then the definer
     *is current user 
     * </pre>
     *
     * <code>optional string definer = 2;</code>
     * @return The bytes for definer.
     */
    com.google.protobuf.ByteString
        getDefinerBytes();

    /**
     * <pre>
     ** defines how MySQL Server processes the view 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3 [default = UNDEFINED];</code>
     * @return Whether the algorithm field is set.
     */
    boolean hasAlgorithm();
    /**
     * <pre>
     ** defines how MySQL Server processes the view 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3 [default = UNDEFINED];</code>
     * @return The algorithm.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm getAlgorithm();

    /**
     * <pre>
     ** defines the security context in which the view is going be executed 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4 [default = DEFINER];</code>
     * @return Whether the security field is set.
     */
    boolean hasSecurity();
    /**
     * <pre>
     ** defines the security context in which the view is going be executed 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4 [default = DEFINER];</code>
     * @return The security.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity getSecurity();

    /**
     * <pre>
     ** limits the write operations done on a VIEW 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
     * @return Whether the check field is set.
     */
    boolean hasCheck();
    /**
     * <pre>
     ** limits the write operations done on a VIEW 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
     * @return The check.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption getCheck();

    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @return A list containing the column.
     */
    java.util.List<java.lang.String>
        getColumnList();
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @return The count of column.
     */
    int getColumnCount();
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @param index The index of the element to return.
     * @return The column at the given index.
     */
    java.lang.String getColumn(int index);
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @param index The index of the value to return.
     * @return The bytes of the column at the given index.
     */
    com.google.protobuf.ByteString
        getColumnBytes(int index);

    /**
     * <pre>
     ** Mysqlx.Crud.Find message from which the SELECT statement
     *is going to be build 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
     * @return Whether the stmt field is set.
     */
    boolean hasStmt();
    /**
     * <pre>
     ** Mysqlx.Crud.Find message from which the SELECT statement
     *is going to be build 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
     * @return The stmt.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Find getStmt();
    /**
     * <pre>
     ** Mysqlx.Crud.Find message from which the SELECT statement
     *is going to be build 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder getStmtOrBuilder();

    /**
     * <pre>
     ** if true then suppress error when created view already exists;
     *just replace it 
     * </pre>
     *
     * <code>optional bool replace_existing = 8 [default = false];</code>
     * @return Whether the replaceExisting field is set.
     */
    boolean hasReplaceExisting();
    /**
     * <pre>
     ** if true then suppress error when created view already exists;
     *just replace it 
     * </pre>
     *
     * <code>optional bool replace_existing = 8 [default = false];</code>
     * @return The replaceExisting.
     */
    boolean getReplaceExisting();
  }
  /**
   * <pre>
   **
   *CreateView create view based on indicated &#64;ref Mysqlx::Crud::Find message
   * </pre>
   *
   * Protobuf type {@code Mysqlx.Crud.CreateView}
   */
  public static final class CreateView extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.CreateView)
      CreateViewOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CreateView.newBuilder() to construct.
    private CreateView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CreateView() {
      definer_ = "";
      algorithm_ = 1;
      security_ = 2;
      check_ = 1;
      column_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CreateView();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_CreateView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_CreateView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.CreateView.class, com.mysql.cj.x.protobuf.MysqlxCrud.CreateView.Builder.class);
    }

    private int bitField0_;
    public static final int COLLECTION_FIELD_NUMBER = 1;
    private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
    /**
     * <pre>
     ** name of the VIEW object, which should be created 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return Whether the collection field is set.
     */
    @java.lang.Override
    public boolean hasCollection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     ** name of the VIEW object, which should be created 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return The collection.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }
    /**
     * <pre>
     ** name of the VIEW object, which should be created 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }

    public static final int DEFINER_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object definer_ = "";
    /**
     * <pre>
     ** user name of the definer, if the value isn't set then the definer
     *is current user 
     * </pre>
     *
     * <code>optional string definer = 2;</code>
     * @return Whether the definer field is set.
     */
    @java.lang.Override
    public boolean hasDefiner() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     ** user name of the definer, if the value isn't set then the definer
     *is current user 
     * </pre>
     *
     * <code>optional string definer = 2;</code>
     * @return The definer.
     */
    @java.lang.Override
    public java.lang.String getDefiner() {
      java.lang.Object ref = definer_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          definer_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     ** user name of the definer, if the value isn't set then the definer
     *is current user 
     * </pre>
     *
     * <code>optional string definer = 2;</code>
     * @return The bytes for definer.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDefinerBytes() {
      java.lang.Object ref = definer_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        definer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALGORITHM_FIELD_NUMBER = 3;
    private int algorithm_ = 1;
    /**
     * <pre>
     ** defines how MySQL Server processes the view 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3 [default = UNDEFINED];</code>
     * @return Whether the algorithm field is set.
     */
    @java.lang.Override public boolean hasAlgorithm() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     ** defines how MySQL Server processes the view 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3 [default = UNDEFINED];</code>
     * @return The algorithm.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm getAlgorithm() {
      com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm result = com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm.forNumber(algorithm_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm.UNDEFINED : result;
    }

    public static final int SECURITY_FIELD_NUMBER = 4;
    private int security_ = 2;
    /**
     * <pre>
     ** defines the security context in which the view is going be executed 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4 [default = DEFINER];</code>
     * @return Whether the security field is set.
     */
    @java.lang.Override public boolean hasSecurity() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     ** defines the security context in which the view is going be executed 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4 [default = DEFINER];</code>
     * @return The security.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity getSecurity() {
      com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity result = com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity.forNumber(security_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity.DEFINER : result;
    }

    public static final int CHECK_FIELD_NUMBER = 5;
    private int check_ = 1;
    /**
     * <pre>
     ** limits the write operations done on a VIEW 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
     * @return Whether the check field is set.
     */
    @java.lang.Override public boolean hasCheck() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     ** limits the write operations done on a VIEW 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
     * @return The check.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption getCheck() {
      com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption result = com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption.forNumber(check_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption.LOCAL : result;
    }

    public static final int COLUMN_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList column_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @return A list containing the column.
     */
    public com.google.protobuf.ProtocolStringList
        getColumnList() {
      return column_;
    }
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @return The count of column.
     */
    public int getColumnCount() {
      return column_.size();
    }
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @param index The index of the element to return.
     * @return The column at the given index.
     */
    public java.lang.String getColumn(int index) {
      return column_.get(index);
    }
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @param index The index of the value to return.
     * @return The bytes of the column at the given index.
     */
    public com.google.protobuf.ByteString
        getColumnBytes(int index) {
      return column_.getByteString(index);
    }

    public static final int STMT_FIELD_NUMBER = 7;
    private com.mysql.cj.x.protobuf.MysqlxCrud.Find stmt_;
    /**
     * <pre>
     ** Mysqlx.Crud.Find message from which the SELECT statement
     *is going to be build 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
     * @return Whether the stmt field is set.
     */
    @java.lang.Override
    public boolean hasStmt() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     ** Mysqlx.Crud.Find message from which the SELECT statement
     *is going to be build 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
     * @return The stmt.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Find getStmt() {
      return stmt_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDefaultInstance() : stmt_;
    }
    /**
     * <pre>
     ** Mysqlx.Crud.Find message from which the SELECT statement
     *is going to be build 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder getStmtOrBuilder() {
      return stmt_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDefaultInstance() : stmt_;
    }

    public static final int REPLACE_EXISTING_FIELD_NUMBER = 8;
    private boolean replaceExisting_ = false;
    /**
     * <pre>
     ** if true then suppress error when created view already exists;
     *just replace it 
     * </pre>
     *
     * <code>optional bool replace_existing = 8 [default = false];</code>
     * @return Whether the replaceExisting field is set.
     */
    @java.lang.Override
    public boolean hasReplaceExisting() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     ** if true then suppress error when created view already exists;
     *just replace it 
     * </pre>
     *
     * <code>optional bool replace_existing = 8 [default = false];</code>
     * @return The replaceExisting.
     */
    @java.lang.Override
    public boolean getReplaceExisting() {
      return replaceExisting_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCollection()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStmt()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getCollection().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getStmt().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, definer_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeEnum(3, algorithm_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeEnum(4, security_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeEnum(5, check_);
      }
      for (int i = 0; i < column_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, column_.getRaw(i));
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeMessage(7, getStmt());
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeBool(8, replaceExisting_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, definer_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, algorithm_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, security_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, check_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < column_.size(); i++) {
          dataSize += computeStringSizeNoTag(column_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getColumnList().size();
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getStmt());
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, replaceExisting_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.CreateView)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.CreateView other = (com.mysql.cj.x.protobuf.MysqlxCrud.CreateView) obj;

      if (hasCollection() != other.hasCollection()) return false;
      if (hasCollection()) {
        if (!getCollection()
            .equals(other.getCollection())) return false;
      }
      if (hasDefiner() != other.hasDefiner()) return false;
      if (hasDefiner()) {
        if (!getDefiner()
            .equals(other.getDefiner())) return false;
      }
      if (hasAlgorithm() != other.hasAlgorithm()) return false;
      if (hasAlgorithm()) {
        if (algorithm_ != other.algorithm_) return false;
      }
      if (hasSecurity() != other.hasSecurity()) return false;
      if (hasSecurity()) {
        if (security_ != other.security_) return false;
      }
      if (hasCheck() != other.hasCheck()) return false;
      if (hasCheck()) {
        if (check_ != other.check_) return false;
      }
      if (!getColumnList()
          .equals(other.getColumnList())) return false;
      if (hasStmt() != other.hasStmt()) return false;
      if (hasStmt()) {
        if (!getStmt()
            .equals(other.getStmt())) return false;
      }
      if (hasReplaceExisting() != other.hasReplaceExisting()) return false;
      if (hasReplaceExisting()) {
        if (getReplaceExisting()
            != other.getReplaceExisting()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCollection()) {
        hash = (37 * hash) + COLLECTION_FIELD_NUMBER;
        hash = (53 * hash) + getCollection().hashCode();
      }
      if (hasDefiner()) {
        hash = (37 * hash) + DEFINER_FIELD_NUMBER;
        hash = (53 * hash) + getDefiner().hashCode();
      }
      if (hasAlgorithm()) {
        hash = (37 * hash) + ALGORITHM_FIELD_NUMBER;
        hash = (53 * hash) + algorithm_;
      }
      if (hasSecurity()) {
        hash = (37 * hash) + SECURITY_FIELD_NUMBER;
        hash = (53 * hash) + security_;
      }
      if (hasCheck()) {
        hash = (37 * hash) + CHECK_FIELD_NUMBER;
        hash = (53 * hash) + check_;
      }
      if (getColumnCount() > 0) {
        hash = (37 * hash) + COLUMN_FIELD_NUMBER;
        hash = (53 * hash) + getColumnList().hashCode();
      }
      if (hasStmt()) {
        hash = (37 * hash) + STMT_FIELD_NUMBER;
        hash = (53 * hash) + getStmt().hashCode();
      }
      if (hasReplaceExisting()) {
        hash = (37 * hash) + REPLACE_EXISTING_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getReplaceExisting());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.CreateView prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     *CreateView create view based on indicated &#64;ref Mysqlx::Crud::Find message
     * </pre>
     *
     * Protobuf type {@code Mysqlx.Crud.CreateView}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.CreateView)
        com.mysql.cj.x.protobuf.MysqlxCrud.CreateViewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_CreateView_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_CreateView_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.CreateView.class, com.mysql.cj.x.protobuf.MysqlxCrud.CreateView.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.CreateView.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getCollectionFieldBuilder();
          getStmtFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        definer_ = "";
        algorithm_ = 1;
        security_ = 2;
        check_ = 1;
        column_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        stmt_ = null;
        if (stmtBuilder_ != null) {
          stmtBuilder_.dispose();
          stmtBuilder_ = null;
        }
        replaceExisting_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_CreateView_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.CreateView getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.CreateView.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.CreateView build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.CreateView result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.CreateView buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.CreateView result = new com.mysql.cj.x.protobuf.MysqlxCrud.CreateView(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.CreateView result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.collection_ = collectionBuilder_ == null
              ? collection_
              : collectionBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.definer_ = definer_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.algorithm_ = algorithm_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.security_ = security_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.check_ = check_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          column_.makeImmutable();
          result.column_ = column_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.stmt_ = stmtBuilder_ == null
              ? stmt_
              : stmtBuilder_.build();
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          result.replaceExisting_ = replaceExisting_;
          to_bitField0_ |= 0x00000040;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.CreateView) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.CreateView)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.CreateView other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.CreateView.getDefaultInstance()) return this;
        if (other.hasCollection()) {
          mergeCollection(other.getCollection());
        }
        if (other.hasDefiner()) {
          definer_ = other.definer_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasAlgorithm()) {
          setAlgorithm(other.getAlgorithm());
        }
        if (other.hasSecurity()) {
          setSecurity(other.getSecurity());
        }
        if (other.hasCheck()) {
          setCheck(other.getCheck());
        }
        if (!other.column_.isEmpty()) {
          if (column_.isEmpty()) {
            column_ = other.column_;
            bitField0_ |= 0x00000020;
          } else {
            ensureColumnIsMutable();
            column_.addAll(other.column_);
          }
          onChanged();
        }
        if (other.hasStmt()) {
          mergeStmt(other.getStmt());
        }
        if (other.hasReplaceExisting()) {
          setReplaceExisting(other.getReplaceExisting());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasCollection()) {
          return false;
        }
        if (!hasStmt()) {
          return false;
        }
        if (!getCollection().isInitialized()) {
          return false;
        }
        if (!getStmt().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getCollectionFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                definer_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(3, tmpRaw);
                } else {
                  algorithm_ = tmpRaw;
                  bitField0_ |= 0x00000004;
                }
                break;
              } // case 24
              case 32: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(4, tmpRaw);
                } else {
                  security_ = tmpRaw;
                  bitField0_ |= 0x00000008;
                }
                break;
              } // case 32
              case 40: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(5, tmpRaw);
                } else {
                  check_ = tmpRaw;
                  bitField0_ |= 0x00000010;
                }
                break;
              } // case 40
              case 50: {
                com.google.protobuf.ByteString bs = input.readBytes();
                ensureColumnIsMutable();
                column_.add(bs);
                break;
              } // case 50
              case 58: {
                input.readMessage(
                    getStmtFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000040;
                break;
              } // case 58
              case 64: {
                replaceExisting_ = input.readBool();
                bitField0_ |= 0x00000080;
                break;
              } // case 64
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
      /**
       * <pre>
       ** name of the VIEW object, which should be created 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       * @return Whether the collection field is set.
       */
      public boolean hasCollection() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be created 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       * @return The collection.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
        if (collectionBuilder_ == null) {
          return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        } else {
          return collectionBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be created 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder setCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          collection_ = value;
        } else {
          collectionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be created 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder setCollection(
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder builderForValue) {
        if (collectionBuilder_ == null) {
          collection_ = builderForValue.build();
        } else {
          collectionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be created 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder mergeCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            collection_ != null &&
            collection_ != com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance()) {
            getCollectionBuilder().mergeFrom(value);
          } else {
            collection_ = value;
          }
        } else {
          collectionBuilder_.mergeFrom(value);
        }
        if (collection_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be created 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder clearCollection() {
        bitField0_ = (bitField0_ & ~0x00000001);
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be created 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder getCollectionBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCollectionFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be created 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
        if (collectionBuilder_ != null) {
          return collectionBuilder_.getMessageOrBuilder();
        } else {
          return collection_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        }
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be created 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> 
          getCollectionFieldBuilder() {
        if (collectionBuilder_ == null) {
          collectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder>(
                  getCollection(),
                  getParentForChildren(),
                  isClean());
          collection_ = null;
        }
        return collectionBuilder_;
      }

      private java.lang.Object definer_ = "";
      /**
       * <pre>
       ** user name of the definer, if the value isn't set then the definer
       *is current user 
       * </pre>
       *
       * <code>optional string definer = 2;</code>
       * @return Whether the definer field is set.
       */
      public boolean hasDefiner() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       ** user name of the definer, if the value isn't set then the definer
       *is current user 
       * </pre>
       *
       * <code>optional string definer = 2;</code>
       * @return The definer.
       */
      public java.lang.String getDefiner() {
        java.lang.Object ref = definer_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            definer_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       ** user name of the definer, if the value isn't set then the definer
       *is current user 
       * </pre>
       *
       * <code>optional string definer = 2;</code>
       * @return The bytes for definer.
       */
      public com.google.protobuf.ByteString
          getDefinerBytes() {
        java.lang.Object ref = definer_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          definer_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       ** user name of the definer, if the value isn't set then the definer
       *is current user 
       * </pre>
       *
       * <code>optional string definer = 2;</code>
       * @param value The definer to set.
       * @return This builder for chaining.
       */
      public Builder setDefiner(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        definer_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** user name of the definer, if the value isn't set then the definer
       *is current user 
       * </pre>
       *
       * <code>optional string definer = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDefiner() {
        definer_ = getDefaultInstance().getDefiner();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** user name of the definer, if the value isn't set then the definer
       *is current user 
       * </pre>
       *
       * <code>optional string definer = 2;</code>
       * @param value The bytes for definer to set.
       * @return This builder for chaining.
       */
      public Builder setDefinerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        definer_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private int algorithm_ = 1;
      /**
       * <pre>
       ** defines how MySQL Server processes the view 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3 [default = UNDEFINED];</code>
       * @return Whether the algorithm field is set.
       */
      @java.lang.Override public boolean hasAlgorithm() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       ** defines how MySQL Server processes the view 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3 [default = UNDEFINED];</code>
       * @return The algorithm.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm getAlgorithm() {
        com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm result = com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm.forNumber(algorithm_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm.UNDEFINED : result;
      }
      /**
       * <pre>
       ** defines how MySQL Server processes the view 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3 [default = UNDEFINED];</code>
       * @param value The algorithm to set.
       * @return This builder for chaining.
       */
      public Builder setAlgorithm(com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        algorithm_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** defines how MySQL Server processes the view 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3 [default = UNDEFINED];</code>
       * @return This builder for chaining.
       */
      public Builder clearAlgorithm() {
        bitField0_ = (bitField0_ & ~0x00000004);
        algorithm_ = 1;
        onChanged();
        return this;
      }

      private int security_ = 2;
      /**
       * <pre>
       ** defines the security context in which the view is going be executed 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4 [default = DEFINER];</code>
       * @return Whether the security field is set.
       */
      @java.lang.Override public boolean hasSecurity() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       ** defines the security context in which the view is going be executed 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4 [default = DEFINER];</code>
       * @return The security.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity getSecurity() {
        com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity result = com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity.forNumber(security_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity.DEFINER : result;
      }
      /**
       * <pre>
       ** defines the security context in which the view is going be executed 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4 [default = DEFINER];</code>
       * @param value The security to set.
       * @return This builder for chaining.
       */
      public Builder setSecurity(com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        security_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** defines the security context in which the view is going be executed 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4 [default = DEFINER];</code>
       * @return This builder for chaining.
       */
      public Builder clearSecurity() {
        bitField0_ = (bitField0_ & ~0x00000008);
        security_ = 2;
        onChanged();
        return this;
      }

      private int check_ = 1;
      /**
       * <pre>
       ** limits the write operations done on a VIEW 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
       * @return Whether the check field is set.
       */
      @java.lang.Override public boolean hasCheck() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       ** limits the write operations done on a VIEW 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
       * @return The check.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption getCheck() {
        com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption result = com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption.forNumber(check_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption.LOCAL : result;
      }
      /**
       * <pre>
       ** limits the write operations done on a VIEW 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
       * @param value The check to set.
       * @return This builder for chaining.
       */
      public Builder setCheck(com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        check_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the write operations done on a VIEW 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCheck() {
        bitField0_ = (bitField0_ & ~0x00000010);
        check_ = 1;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringArrayList column_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureColumnIsMutable() {
        if (!column_.isModifiable()) {
          column_ = new com.google.protobuf.LazyStringArrayList(column_);
        }
        bitField0_ |= 0x00000020;
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @return A list containing the column.
       */
      public com.google.protobuf.ProtocolStringList
          getColumnList() {
        column_.makeImmutable();
        return column_;
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @return The count of column.
       */
      public int getColumnCount() {
        return column_.size();
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @param index The index of the element to return.
       * @return The column at the given index.
       */
      public java.lang.String getColumn(int index) {
        return column_.get(index);
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @param index The index of the value to return.
       * @return The bytes of the column at the given index.
       */
      public com.google.protobuf.ByteString
          getColumnBytes(int index) {
        return column_.getByteString(index);
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @param index The index to set the value at.
       * @param value The column to set.
       * @return This builder for chaining.
       */
      public Builder setColumn(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureColumnIsMutable();
        column_.set(index, value);
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @param value The column to add.
       * @return This builder for chaining.
       */
      public Builder addColumn(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureColumnIsMutable();
        column_.add(value);
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @param values The column to add.
       * @return This builder for chaining.
       */
      public Builder addAllColumn(
          java.lang.Iterable<java.lang.String> values) {
        ensureColumnIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, column_);
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearColumn() {
        column_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @param value The bytes of the column to add.
       * @return This builder for chaining.
       */
      public Builder addColumnBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        ensureColumnIsMutable();
        column_.add(value);
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }

      private com.mysql.cj.x.protobuf.MysqlxCrud.Find stmt_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Find, com.mysql.cj.x.protobuf.MysqlxCrud.Find.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder> stmtBuilder_;
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
       * @return Whether the stmt field is set.
       */
      public boolean hasStmt() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
       * @return The stmt.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Find getStmt() {
        if (stmtBuilder_ == null) {
          return stmt_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDefaultInstance() : stmt_;
        } else {
          return stmtBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
       */
      public Builder setStmt(com.mysql.cj.x.protobuf.MysqlxCrud.Find value) {
        if (stmtBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          stmt_ = value;
        } else {
          stmtBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
       */
      public Builder setStmt(
          com.mysql.cj.x.protobuf.MysqlxCrud.Find.Builder builderForValue) {
        if (stmtBuilder_ == null) {
          stmt_ = builderForValue.build();
        } else {
          stmtBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
       */
      public Builder mergeStmt(com.mysql.cj.x.protobuf.MysqlxCrud.Find value) {
        if (stmtBuilder_ == null) {
          if (((bitField0_ & 0x00000040) != 0) &&
            stmt_ != null &&
            stmt_ != com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDefaultInstance()) {
            getStmtBuilder().mergeFrom(value);
          } else {
            stmt_ = value;
          }
        } else {
          stmtBuilder_.mergeFrom(value);
        }
        if (stmt_ != null) {
          bitField0_ |= 0x00000040;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
       */
      public Builder clearStmt() {
        bitField0_ = (bitField0_ & ~0x00000040);
        stmt_ = null;
        if (stmtBuilder_ != null) {
          stmtBuilder_.dispose();
          stmtBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Find.Builder getStmtBuilder() {
        bitField0_ |= 0x00000040;
        onChanged();
        return getStmtFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder getStmtOrBuilder() {
        if (stmtBuilder_ != null) {
          return stmtBuilder_.getMessageOrBuilder();
        } else {
          return stmt_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDefaultInstance() : stmt_;
        }
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Find stmt = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Find, com.mysql.cj.x.protobuf.MysqlxCrud.Find.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder> 
          getStmtFieldBuilder() {
        if (stmtBuilder_ == null) {
          stmtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Find, com.mysql.cj.x.protobuf.MysqlxCrud.Find.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder>(
                  getStmt(),
                  getParentForChildren(),
                  isClean());
          stmt_ = null;
        }
        return stmtBuilder_;
      }

      private boolean replaceExisting_ ;
      /**
       * <pre>
       ** if true then suppress error when created view already exists;
       *just replace it 
       * </pre>
       *
       * <code>optional bool replace_existing = 8 [default = false];</code>
       * @return Whether the replaceExisting field is set.
       */
      @java.lang.Override
      public boolean hasReplaceExisting() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <pre>
       ** if true then suppress error when created view already exists;
       *just replace it 
       * </pre>
       *
       * <code>optional bool replace_existing = 8 [default = false];</code>
       * @return The replaceExisting.
       */
      @java.lang.Override
      public boolean getReplaceExisting() {
        return replaceExisting_;
      }
      /**
       * <pre>
       ** if true then suppress error when created view already exists;
       *just replace it 
       * </pre>
       *
       * <code>optional bool replace_existing = 8 [default = false];</code>
       * @param value The replaceExisting to set.
       * @return This builder for chaining.
       */
      public Builder setReplaceExisting(boolean value) {

        replaceExisting_ = value;
        bitField0_ |= 0x00000080;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** if true then suppress error when created view already exists;
       *just replace it 
       * </pre>
       *
       * <code>optional bool replace_existing = 8 [default = false];</code>
       * @return This builder for chaining.
       */
      public Builder clearReplaceExisting() {
        bitField0_ = (bitField0_ & ~0x00000080);
        replaceExisting_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.CreateView)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.CreateView)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.CreateView DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.CreateView();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.CreateView getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CreateView>
        PARSER = new com.google.protobuf.AbstractParser<CreateView>() {
      @java.lang.Override
      public CreateView parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<CreateView> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CreateView> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.CreateView getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ModifyViewOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.ModifyView)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     ** name of the VIEW object, which should be modified 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return Whether the collection field is set.
     */
    boolean hasCollection();
    /**
     * <pre>
     ** name of the VIEW object, which should be modified 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return The collection.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection();
    /**
     * <pre>
     ** name of the VIEW object, which should be modified 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder();

    /**
     * <pre>
     ** user name of the definer,
     *if the value isn't set then the definer is current user 
     * </pre>
     *
     * <code>optional string definer = 2;</code>
     * @return Whether the definer field is set.
     */
    boolean hasDefiner();
    /**
     * <pre>
     ** user name of the definer,
     *if the value isn't set then the definer is current user 
     * </pre>
     *
     * <code>optional string definer = 2;</code>
     * @return The definer.
     */
    java.lang.String getDefiner();
    /**
     * <pre>
     ** user name of the definer,
     *if the value isn't set then the definer is current user 
     * </pre>
     *
     * <code>optional string definer = 2;</code>
     * @return The bytes for definer.
     */
    com.google.protobuf.ByteString
        getDefinerBytes();

    /**
     * <pre>
     ** defined how MySQL Server processes the view 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3;</code>
     * @return Whether the algorithm field is set.
     */
    boolean hasAlgorithm();
    /**
     * <pre>
     ** defined how MySQL Server processes the view 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3;</code>
     * @return The algorithm.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm getAlgorithm();

    /**
     * <pre>
     ** defines the security context in which the view is going be executed 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4;</code>
     * @return Whether the security field is set.
     */
    boolean hasSecurity();
    /**
     * <pre>
     ** defines the security context in which the view is going be executed 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4;</code>
     * @return The security.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity getSecurity();

    /**
     * <pre>
     ** limits the write operations done on a VIEW 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
     * @return Whether the check field is set.
     */
    boolean hasCheck();
    /**
     * <pre>
     ** limits the write operations done on a VIEW 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
     * @return The check.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption getCheck();

    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @return A list containing the column.
     */
    java.util.List<java.lang.String>
        getColumnList();
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @return The count of column.
     */
    int getColumnCount();
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @param index The index of the element to return.
     * @return The column at the given index.
     */
    java.lang.String getColumn(int index);
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @param index The index of the value to return.
     * @return The bytes of the column at the given index.
     */
    com.google.protobuf.ByteString
        getColumnBytes(int index);

    /**
     * <pre>
     ** Mysqlx.Crud.Find message from which the SELECT statement
     *is going to be build 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
     * @return Whether the stmt field is set.
     */
    boolean hasStmt();
    /**
     * <pre>
     ** Mysqlx.Crud.Find message from which the SELECT statement
     *is going to be build 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
     * @return The stmt.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Find getStmt();
    /**
     * <pre>
     ** Mysqlx.Crud.Find message from which the SELECT statement
     *is going to be build 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder getStmtOrBuilder();
  }
  /**
   * <pre>
   **
   *ModifyView modify existing view based on indicated
   *&#64;ref Mysqlx::Crud::Find message
   * </pre>
   *
   * Protobuf type {@code Mysqlx.Crud.ModifyView}
   */
  public static final class ModifyView extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.ModifyView)
      ModifyViewOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ModifyView.newBuilder() to construct.
    private ModifyView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ModifyView() {
      definer_ = "";
      algorithm_ = 1;
      security_ = 1;
      check_ = 1;
      column_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ModifyView();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_ModifyView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_ModifyView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView.class, com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView.Builder.class);
    }

    private int bitField0_;
    public static final int COLLECTION_FIELD_NUMBER = 1;
    private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
    /**
     * <pre>
     ** name of the VIEW object, which should be modified 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return Whether the collection field is set.
     */
    @java.lang.Override
    public boolean hasCollection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     ** name of the VIEW object, which should be modified 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return The collection.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }
    /**
     * <pre>
     ** name of the VIEW object, which should be modified 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }

    public static final int DEFINER_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object definer_ = "";
    /**
     * <pre>
     ** user name of the definer,
     *if the value isn't set then the definer is current user 
     * </pre>
     *
     * <code>optional string definer = 2;</code>
     * @return Whether the definer field is set.
     */
    @java.lang.Override
    public boolean hasDefiner() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     ** user name of the definer,
     *if the value isn't set then the definer is current user 
     * </pre>
     *
     * <code>optional string definer = 2;</code>
     * @return The definer.
     */
    @java.lang.Override
    public java.lang.String getDefiner() {
      java.lang.Object ref = definer_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          definer_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     ** user name of the definer,
     *if the value isn't set then the definer is current user 
     * </pre>
     *
     * <code>optional string definer = 2;</code>
     * @return The bytes for definer.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDefinerBytes() {
      java.lang.Object ref = definer_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        definer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALGORITHM_FIELD_NUMBER = 3;
    private int algorithm_ = 1;
    /**
     * <pre>
     ** defined how MySQL Server processes the view 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3;</code>
     * @return Whether the algorithm field is set.
     */
    @java.lang.Override public boolean hasAlgorithm() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     ** defined how MySQL Server processes the view 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3;</code>
     * @return The algorithm.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm getAlgorithm() {
      com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm result = com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm.forNumber(algorithm_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm.UNDEFINED : result;
    }

    public static final int SECURITY_FIELD_NUMBER = 4;
    private int security_ = 1;
    /**
     * <pre>
     ** defines the security context in which the view is going be executed 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4;</code>
     * @return Whether the security field is set.
     */
    @java.lang.Override public boolean hasSecurity() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     ** defines the security context in which the view is going be executed 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4;</code>
     * @return The security.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity getSecurity() {
      com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity result = com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity.forNumber(security_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity.INVOKER : result;
    }

    public static final int CHECK_FIELD_NUMBER = 5;
    private int check_ = 1;
    /**
     * <pre>
     ** limits the write operations done on a VIEW 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
     * @return Whether the check field is set.
     */
    @java.lang.Override public boolean hasCheck() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     ** limits the write operations done on a VIEW 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
     * @return The check.
     */
    @java.lang.Override public com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption getCheck() {
      com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption result = com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption.forNumber(check_);
      return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption.LOCAL : result;
    }

    public static final int COLUMN_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList column_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @return A list containing the column.
     */
    public com.google.protobuf.ProtocolStringList
        getColumnList() {
      return column_;
    }
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @return The count of column.
     */
    public int getColumnCount() {
      return column_.size();
    }
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @param index The index of the element to return.
     * @return The column at the given index.
     */
    public java.lang.String getColumn(int index) {
      return column_.get(index);
    }
    /**
     * <pre>
     ** defines the list of aliases for column names specified in `stmt` 
     * </pre>
     *
     * <code>repeated string column = 6;</code>
     * @param index The index of the value to return.
     * @return The bytes of the column at the given index.
     */
    public com.google.protobuf.ByteString
        getColumnBytes(int index) {
      return column_.getByteString(index);
    }

    public static final int STMT_FIELD_NUMBER = 7;
    private com.mysql.cj.x.protobuf.MysqlxCrud.Find stmt_;
    /**
     * <pre>
     ** Mysqlx.Crud.Find message from which the SELECT statement
     *is going to be build 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
     * @return Whether the stmt field is set.
     */
    @java.lang.Override
    public boolean hasStmt() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     ** Mysqlx.Crud.Find message from which the SELECT statement
     *is going to be build 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
     * @return The stmt.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Find getStmt() {
      return stmt_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDefaultInstance() : stmt_;
    }
    /**
     * <pre>
     ** Mysqlx.Crud.Find message from which the SELECT statement
     *is going to be build 
     * </pre>
     *
     * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder getStmtOrBuilder() {
      return stmt_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDefaultInstance() : stmt_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCollection()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getCollection().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasStmt()) {
        if (!getStmt().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, definer_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeEnum(3, algorithm_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeEnum(4, security_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeEnum(5, check_);
      }
      for (int i = 0; i < column_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, column_.getRaw(i));
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeMessage(7, getStmt());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, definer_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, algorithm_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, security_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, check_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < column_.size(); i++) {
          dataSize += computeStringSizeNoTag(column_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getColumnList().size();
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getStmt());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView other = (com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView) obj;

      if (hasCollection() != other.hasCollection()) return false;
      if (hasCollection()) {
        if (!getCollection()
            .equals(other.getCollection())) return false;
      }
      if (hasDefiner() != other.hasDefiner()) return false;
      if (hasDefiner()) {
        if (!getDefiner()
            .equals(other.getDefiner())) return false;
      }
      if (hasAlgorithm() != other.hasAlgorithm()) return false;
      if (hasAlgorithm()) {
        if (algorithm_ != other.algorithm_) return false;
      }
      if (hasSecurity() != other.hasSecurity()) return false;
      if (hasSecurity()) {
        if (security_ != other.security_) return false;
      }
      if (hasCheck() != other.hasCheck()) return false;
      if (hasCheck()) {
        if (check_ != other.check_) return false;
      }
      if (!getColumnList()
          .equals(other.getColumnList())) return false;
      if (hasStmt() != other.hasStmt()) return false;
      if (hasStmt()) {
        if (!getStmt()
            .equals(other.getStmt())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCollection()) {
        hash = (37 * hash) + COLLECTION_FIELD_NUMBER;
        hash = (53 * hash) + getCollection().hashCode();
      }
      if (hasDefiner()) {
        hash = (37 * hash) + DEFINER_FIELD_NUMBER;
        hash = (53 * hash) + getDefiner().hashCode();
      }
      if (hasAlgorithm()) {
        hash = (37 * hash) + ALGORITHM_FIELD_NUMBER;
        hash = (53 * hash) + algorithm_;
      }
      if (hasSecurity()) {
        hash = (37 * hash) + SECURITY_FIELD_NUMBER;
        hash = (53 * hash) + security_;
      }
      if (hasCheck()) {
        hash = (37 * hash) + CHECK_FIELD_NUMBER;
        hash = (53 * hash) + check_;
      }
      if (getColumnCount() > 0) {
        hash = (37 * hash) + COLUMN_FIELD_NUMBER;
        hash = (53 * hash) + getColumnList().hashCode();
      }
      if (hasStmt()) {
        hash = (37 * hash) + STMT_FIELD_NUMBER;
        hash = (53 * hash) + getStmt().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     *ModifyView modify existing view based on indicated
     *&#64;ref Mysqlx::Crud::Find message
     * </pre>
     *
     * Protobuf type {@code Mysqlx.Crud.ModifyView}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.ModifyView)
        com.mysql.cj.x.protobuf.MysqlxCrud.ModifyViewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_ModifyView_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_ModifyView_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView.class, com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getCollectionFieldBuilder();
          getStmtFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        definer_ = "";
        algorithm_ = 1;
        security_ = 1;
        check_ = 1;
        column_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        stmt_ = null;
        if (stmtBuilder_ != null) {
          stmtBuilder_.dispose();
          stmtBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_ModifyView_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView result = new com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.collection_ = collectionBuilder_ == null
              ? collection_
              : collectionBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.definer_ = definer_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.algorithm_ = algorithm_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.security_ = security_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.check_ = check_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          column_.makeImmutable();
          result.column_ = column_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.stmt_ = stmtBuilder_ == null
              ? stmt_
              : stmtBuilder_.build();
          to_bitField0_ |= 0x00000020;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView.getDefaultInstance()) return this;
        if (other.hasCollection()) {
          mergeCollection(other.getCollection());
        }
        if (other.hasDefiner()) {
          definer_ = other.definer_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasAlgorithm()) {
          setAlgorithm(other.getAlgorithm());
        }
        if (other.hasSecurity()) {
          setSecurity(other.getSecurity());
        }
        if (other.hasCheck()) {
          setCheck(other.getCheck());
        }
        if (!other.column_.isEmpty()) {
          if (column_.isEmpty()) {
            column_ = other.column_;
            bitField0_ |= 0x00000020;
          } else {
            ensureColumnIsMutable();
            column_.addAll(other.column_);
          }
          onChanged();
        }
        if (other.hasStmt()) {
          mergeStmt(other.getStmt());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasCollection()) {
          return false;
        }
        if (!getCollection().isInitialized()) {
          return false;
        }
        if (hasStmt()) {
          if (!getStmt().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getCollectionFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                definer_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(3, tmpRaw);
                } else {
                  algorithm_ = tmpRaw;
                  bitField0_ |= 0x00000004;
                }
                break;
              } // case 24
              case 32: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(4, tmpRaw);
                } else {
                  security_ = tmpRaw;
                  bitField0_ |= 0x00000008;
                }
                break;
              } // case 32
              case 40: {
                int tmpRaw = input.readEnum();
                com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption tmpValue =
                    com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(5, tmpRaw);
                } else {
                  check_ = tmpRaw;
                  bitField0_ |= 0x00000010;
                }
                break;
              } // case 40
              case 50: {
                com.google.protobuf.ByteString bs = input.readBytes();
                ensureColumnIsMutable();
                column_.add(bs);
                break;
              } // case 50
              case 58: {
                input.readMessage(
                    getStmtFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000040;
                break;
              } // case 58
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
      /**
       * <pre>
       ** name of the VIEW object, which should be modified 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       * @return Whether the collection field is set.
       */
      public boolean hasCollection() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be modified 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       * @return The collection.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
        if (collectionBuilder_ == null) {
          return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        } else {
          return collectionBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be modified 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder setCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          collection_ = value;
        } else {
          collectionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be modified 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder setCollection(
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder builderForValue) {
        if (collectionBuilder_ == null) {
          collection_ = builderForValue.build();
        } else {
          collectionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be modified 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder mergeCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            collection_ != null &&
            collection_ != com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance()) {
            getCollectionBuilder().mergeFrom(value);
          } else {
            collection_ = value;
          }
        } else {
          collectionBuilder_.mergeFrom(value);
        }
        if (collection_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be modified 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder clearCollection() {
        bitField0_ = (bitField0_ & ~0x00000001);
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be modified 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder getCollectionBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCollectionFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be modified 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
        if (collectionBuilder_ != null) {
          return collectionBuilder_.getMessageOrBuilder();
        } else {
          return collection_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        }
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be modified 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> 
          getCollectionFieldBuilder() {
        if (collectionBuilder_ == null) {
          collectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder>(
                  getCollection(),
                  getParentForChildren(),
                  isClean());
          collection_ = null;
        }
        return collectionBuilder_;
      }

      private java.lang.Object definer_ = "";
      /**
       * <pre>
       ** user name of the definer,
       *if the value isn't set then the definer is current user 
       * </pre>
       *
       * <code>optional string definer = 2;</code>
       * @return Whether the definer field is set.
       */
      public boolean hasDefiner() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       ** user name of the definer,
       *if the value isn't set then the definer is current user 
       * </pre>
       *
       * <code>optional string definer = 2;</code>
       * @return The definer.
       */
      public java.lang.String getDefiner() {
        java.lang.Object ref = definer_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            definer_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       ** user name of the definer,
       *if the value isn't set then the definer is current user 
       * </pre>
       *
       * <code>optional string definer = 2;</code>
       * @return The bytes for definer.
       */
      public com.google.protobuf.ByteString
          getDefinerBytes() {
        java.lang.Object ref = definer_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          definer_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       ** user name of the definer,
       *if the value isn't set then the definer is current user 
       * </pre>
       *
       * <code>optional string definer = 2;</code>
       * @param value The definer to set.
       * @return This builder for chaining.
       */
      public Builder setDefiner(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        definer_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** user name of the definer,
       *if the value isn't set then the definer is current user 
       * </pre>
       *
       * <code>optional string definer = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDefiner() {
        definer_ = getDefaultInstance().getDefiner();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** user name of the definer,
       *if the value isn't set then the definer is current user 
       * </pre>
       *
       * <code>optional string definer = 2;</code>
       * @param value The bytes for definer to set.
       * @return This builder for chaining.
       */
      public Builder setDefinerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        definer_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private int algorithm_ = 1;
      /**
       * <pre>
       ** defined how MySQL Server processes the view 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3;</code>
       * @return Whether the algorithm field is set.
       */
      @java.lang.Override public boolean hasAlgorithm() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       ** defined how MySQL Server processes the view 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3;</code>
       * @return The algorithm.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm getAlgorithm() {
        com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm result = com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm.forNumber(algorithm_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm.UNDEFINED : result;
      }
      /**
       * <pre>
       ** defined how MySQL Server processes the view 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3;</code>
       * @param value The algorithm to set.
       * @return This builder for chaining.
       */
      public Builder setAlgorithm(com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        algorithm_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** defined how MySQL Server processes the view 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewAlgorithm algorithm = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAlgorithm() {
        bitField0_ = (bitField0_ & ~0x00000004);
        algorithm_ = 1;
        onChanged();
        return this;
      }

      private int security_ = 1;
      /**
       * <pre>
       ** defines the security context in which the view is going be executed 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4;</code>
       * @return Whether the security field is set.
       */
      @java.lang.Override public boolean hasSecurity() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       ** defines the security context in which the view is going be executed 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4;</code>
       * @return The security.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity getSecurity() {
        com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity result = com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity.forNumber(security_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity.INVOKER : result;
      }
      /**
       * <pre>
       ** defines the security context in which the view is going be executed 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4;</code>
       * @param value The security to set.
       * @return This builder for chaining.
       */
      public Builder setSecurity(com.mysql.cj.x.protobuf.MysqlxCrud.ViewSqlSecurity value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        security_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** defines the security context in which the view is going be executed 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewSqlSecurity security = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSecurity() {
        bitField0_ = (bitField0_ & ~0x00000008);
        security_ = 1;
        onChanged();
        return this;
      }

      private int check_ = 1;
      /**
       * <pre>
       ** limits the write operations done on a VIEW 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
       * @return Whether the check field is set.
       */
      @java.lang.Override public boolean hasCheck() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       ** limits the write operations done on a VIEW 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
       * @return The check.
       */
      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption getCheck() {
        com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption result = com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption.forNumber(check_);
        return result == null ? com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption.LOCAL : result;
      }
      /**
       * <pre>
       ** limits the write operations done on a VIEW 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
       * @param value The check to set.
       * @return This builder for chaining.
       */
      public Builder setCheck(com.mysql.cj.x.protobuf.MysqlxCrud.ViewCheckOption value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        check_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** limits the write operations done on a VIEW 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.ViewCheckOption check = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCheck() {
        bitField0_ = (bitField0_ & ~0x00000010);
        check_ = 1;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringArrayList column_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureColumnIsMutable() {
        if (!column_.isModifiable()) {
          column_ = new com.google.protobuf.LazyStringArrayList(column_);
        }
        bitField0_ |= 0x00000020;
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @return A list containing the column.
       */
      public com.google.protobuf.ProtocolStringList
          getColumnList() {
        column_.makeImmutable();
        return column_;
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @return The count of column.
       */
      public int getColumnCount() {
        return column_.size();
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @param index The index of the element to return.
       * @return The column at the given index.
       */
      public java.lang.String getColumn(int index) {
        return column_.get(index);
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @param index The index of the value to return.
       * @return The bytes of the column at the given index.
       */
      public com.google.protobuf.ByteString
          getColumnBytes(int index) {
        return column_.getByteString(index);
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @param index The index to set the value at.
       * @param value The column to set.
       * @return This builder for chaining.
       */
      public Builder setColumn(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureColumnIsMutable();
        column_.set(index, value);
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @param value The column to add.
       * @return This builder for chaining.
       */
      public Builder addColumn(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureColumnIsMutable();
        column_.add(value);
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @param values The column to add.
       * @return This builder for chaining.
       */
      public Builder addAllColumn(
          java.lang.Iterable<java.lang.String> values) {
        ensureColumnIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, column_);
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearColumn() {
        column_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** defines the list of aliases for column names specified in `stmt` 
       * </pre>
       *
       * <code>repeated string column = 6;</code>
       * @param value The bytes of the column to add.
       * @return This builder for chaining.
       */
      public Builder addColumnBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        ensureColumnIsMutable();
        column_.add(value);
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }

      private com.mysql.cj.x.protobuf.MysqlxCrud.Find stmt_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Find, com.mysql.cj.x.protobuf.MysqlxCrud.Find.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder> stmtBuilder_;
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
       * @return Whether the stmt field is set.
       */
      public boolean hasStmt() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
       * @return The stmt.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Find getStmt() {
        if (stmtBuilder_ == null) {
          return stmt_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDefaultInstance() : stmt_;
        } else {
          return stmtBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
       */
      public Builder setStmt(com.mysql.cj.x.protobuf.MysqlxCrud.Find value) {
        if (stmtBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          stmt_ = value;
        } else {
          stmtBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
       */
      public Builder setStmt(
          com.mysql.cj.x.protobuf.MysqlxCrud.Find.Builder builderForValue) {
        if (stmtBuilder_ == null) {
          stmt_ = builderForValue.build();
        } else {
          stmtBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
       */
      public Builder mergeStmt(com.mysql.cj.x.protobuf.MysqlxCrud.Find value) {
        if (stmtBuilder_ == null) {
          if (((bitField0_ & 0x00000040) != 0) &&
            stmt_ != null &&
            stmt_ != com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDefaultInstance()) {
            getStmtBuilder().mergeFrom(value);
          } else {
            stmt_ = value;
          }
        } else {
          stmtBuilder_.mergeFrom(value);
        }
        if (stmt_ != null) {
          bitField0_ |= 0x00000040;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
       */
      public Builder clearStmt() {
        bitField0_ = (bitField0_ & ~0x00000040);
        stmt_ = null;
        if (stmtBuilder_ != null) {
          stmtBuilder_.dispose();
          stmtBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Find.Builder getStmtBuilder() {
        bitField0_ |= 0x00000040;
        onChanged();
        return getStmtFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder getStmtOrBuilder() {
        if (stmtBuilder_ != null) {
          return stmtBuilder_.getMessageOrBuilder();
        } else {
          return stmt_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.Find.getDefaultInstance() : stmt_;
        }
      }
      /**
       * <pre>
       ** Mysqlx.Crud.Find message from which the SELECT statement
       *is going to be build 
       * </pre>
       *
       * <code>optional .Mysqlx.Crud.Find stmt = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Find, com.mysql.cj.x.protobuf.MysqlxCrud.Find.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder> 
          getStmtFieldBuilder() {
        if (stmtBuilder_ == null) {
          stmtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Find, com.mysql.cj.x.protobuf.MysqlxCrud.Find.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.FindOrBuilder>(
                  getStmt(),
                  getParentForChildren(),
                  isClean());
          stmt_ = null;
        }
        return stmtBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.ModifyView)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.ModifyView)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ModifyView>
        PARSER = new com.google.protobuf.AbstractParser<ModifyView>() {
      @java.lang.Override
      public ModifyView parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<ModifyView> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ModifyView> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.ModifyView getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface DropViewOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mysqlx.Crud.DropView)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     ** name of the VIEW object, which should be deleted 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return Whether the collection field is set.
     */
    boolean hasCollection();
    /**
     * <pre>
     ** name of the VIEW object, which should be deleted 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return The collection.
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection();
    /**
     * <pre>
     ** name of the VIEW object, which should be deleted 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     */
    com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder();

    /**
     * <pre>
     ** if true then suppress error when deleted view does not exists 
     * </pre>
     *
     * <code>optional bool if_exists = 2 [default = false];</code>
     * @return Whether the ifExists field is set.
     */
    boolean hasIfExists();
    /**
     * <pre>
     ** if true then suppress error when deleted view does not exists 
     * </pre>
     *
     * <code>optional bool if_exists = 2 [default = false];</code>
     * @return The ifExists.
     */
    boolean getIfExists();
  }
  /**
   * <pre>
   **
   *DropView removing existing view
   * </pre>
   *
   * Protobuf type {@code Mysqlx.Crud.DropView}
   */
  public static final class DropView extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mysqlx.Crud.DropView)
      DropViewOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DropView.newBuilder() to construct.
    private DropView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DropView() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DropView();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_DropView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_DropView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mysql.cj.x.protobuf.MysqlxCrud.DropView.class, com.mysql.cj.x.protobuf.MysqlxCrud.DropView.Builder.class);
    }

    private int bitField0_;
    public static final int COLLECTION_FIELD_NUMBER = 1;
    private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
    /**
     * <pre>
     ** name of the VIEW object, which should be deleted 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return Whether the collection field is set.
     */
    @java.lang.Override
    public boolean hasCollection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     ** name of the VIEW object, which should be deleted 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     * @return The collection.
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }
    /**
     * <pre>
     ** name of the VIEW object, which should be deleted 
     * </pre>
     *
     * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
     */
    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
      return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
    }

    public static final int IF_EXISTS_FIELD_NUMBER = 2;
    private boolean ifExists_ = false;
    /**
     * <pre>
     ** if true then suppress error when deleted view does not exists 
     * </pre>
     *
     * <code>optional bool if_exists = 2 [default = false];</code>
     * @return Whether the ifExists field is set.
     */
    @java.lang.Override
    public boolean hasIfExists() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     ** if true then suppress error when deleted view does not exists 
     * </pre>
     *
     * <code>optional bool if_exists = 2 [default = false];</code>
     * @return The ifExists.
     */
    @java.lang.Override
    public boolean getIfExists() {
      return ifExists_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCollection()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getCollection().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBool(2, ifExists_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCollection());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, ifExists_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.mysql.cj.x.protobuf.MysqlxCrud.DropView)) {
        return super.equals(obj);
      }
      com.mysql.cj.x.protobuf.MysqlxCrud.DropView other = (com.mysql.cj.x.protobuf.MysqlxCrud.DropView) obj;

      if (hasCollection() != other.hasCollection()) return false;
      if (hasCollection()) {
        if (!getCollection()
            .equals(other.getCollection())) return false;
      }
      if (hasIfExists() != other.hasIfExists()) return false;
      if (hasIfExists()) {
        if (getIfExists()
            != other.getIfExists()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCollection()) {
        hash = (37 * hash) + COLLECTION_FIELD_NUMBER;
        hash = (53 * hash) + getCollection().hashCode();
      }
      if (hasIfExists()) {
        hash = (37 * hash) + IF_EXISTS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIfExists());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mysql.cj.x.protobuf.MysqlxCrud.DropView prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     *DropView removing existing view
     * </pre>
     *
     * Protobuf type {@code Mysqlx.Crud.DropView}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mysqlx.Crud.DropView)
        com.mysql.cj.x.protobuf.MysqlxCrud.DropViewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_DropView_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_DropView_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mysql.cj.x.protobuf.MysqlxCrud.DropView.class, com.mysql.cj.x.protobuf.MysqlxCrud.DropView.Builder.class);
      }

      // Construct using com.mysql.cj.x.protobuf.MysqlxCrud.DropView.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getCollectionFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        ifExists_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.internal_static_Mysqlx_Crud_DropView_descriptor;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.DropView getDefaultInstanceForType() {
        return com.mysql.cj.x.protobuf.MysqlxCrud.DropView.getDefaultInstance();
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.DropView build() {
        com.mysql.cj.x.protobuf.MysqlxCrud.DropView result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.mysql.cj.x.protobuf.MysqlxCrud.DropView buildPartial() {
        com.mysql.cj.x.protobuf.MysqlxCrud.DropView result = new com.mysql.cj.x.protobuf.MysqlxCrud.DropView(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.mysql.cj.x.protobuf.MysqlxCrud.DropView result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.collection_ = collectionBuilder_ == null
              ? collection_
              : collectionBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.ifExists_ = ifExists_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mysql.cj.x.protobuf.MysqlxCrud.DropView) {
          return mergeFrom((com.mysql.cj.x.protobuf.MysqlxCrud.DropView)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mysql.cj.x.protobuf.MysqlxCrud.DropView other) {
        if (other == com.mysql.cj.x.protobuf.MysqlxCrud.DropView.getDefaultInstance()) return this;
        if (other.hasCollection()) {
          mergeCollection(other.getCollection());
        }
        if (other.hasIfExists()) {
          setIfExists(other.getIfExists());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasCollection()) {
          return false;
        }
        if (!getCollection().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getCollectionFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                ifExists_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.mysql.cj.x.protobuf.MysqlxCrud.Collection collection_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
      /**
       * <pre>
       ** name of the VIEW object, which should be deleted 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       * @return Whether the collection field is set.
       */
      public boolean hasCollection() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be deleted 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       * @return The collection.
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection getCollection() {
        if (collectionBuilder_ == null) {
          return collection_ == null ? com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        } else {
          return collectionBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be deleted 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder setCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          collection_ = value;
        } else {
          collectionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be deleted 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder setCollection(
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder builderForValue) {
        if (collectionBuilder_ == null) {
          collection_ = builderForValue.build();
        } else {
          collectionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be deleted 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder mergeCollection(com.mysql.cj.x.protobuf.MysqlxCrud.Collection value) {
        if (collectionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            collection_ != null &&
            collection_ != com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance()) {
            getCollectionBuilder().mergeFrom(value);
          } else {
            collection_ = value;
          }
        } else {
          collectionBuilder_.mergeFrom(value);
        }
        if (collection_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be deleted 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public Builder clearCollection() {
        bitField0_ = (bitField0_ & ~0x00000001);
        collection_ = null;
        if (collectionBuilder_ != null) {
          collectionBuilder_.dispose();
          collectionBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be deleted 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder getCollectionBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCollectionFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be deleted 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      public com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
        if (collectionBuilder_ != null) {
          return collectionBuilder_.getMessageOrBuilder();
        } else {
          return collection_ == null ?
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection.getDefaultInstance() : collection_;
        }
      }
      /**
       * <pre>
       ** name of the VIEW object, which should be deleted 
       * </pre>
       *
       * <code>required .Mysqlx.Crud.Collection collection = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder> 
          getCollectionFieldBuilder() {
        if (collectionBuilder_ == null) {
          collectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.mysql.cj.x.protobuf.MysqlxCrud.Collection, com.mysql.cj.x.protobuf.MysqlxCrud.Collection.Builder, com.mysql.cj.x.protobuf.MysqlxCrud.CollectionOrBuilder>(
                  getCollection(),
                  getParentForChildren(),
                  isClean());
          collection_ = null;
        }
        return collectionBuilder_;
      }

      private boolean ifExists_ ;
      /**
       * <pre>
       ** if true then suppress error when deleted view does not exists 
       * </pre>
       *
       * <code>optional bool if_exists = 2 [default = false];</code>
       * @return Whether the ifExists field is set.
       */
      @java.lang.Override
      public boolean hasIfExists() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       ** if true then suppress error when deleted view does not exists 
       * </pre>
       *
       * <code>optional bool if_exists = 2 [default = false];</code>
       * @return The ifExists.
       */
      @java.lang.Override
      public boolean getIfExists() {
        return ifExists_;
      }
      /**
       * <pre>
       ** if true then suppress error when deleted view does not exists 
       * </pre>
       *
       * <code>optional bool if_exists = 2 [default = false];</code>
       * @param value The ifExists to set.
       * @return This builder for chaining.
       */
      public Builder setIfExists(boolean value) {

        ifExists_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       ** if true then suppress error when deleted view does not exists 
       * </pre>
       *
       * <code>optional bool if_exists = 2 [default = false];</code>
       * @return This builder for chaining.
       */
      public Builder clearIfExists() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ifExists_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mysqlx.Crud.DropView)
    }

    // @@protoc_insertion_point(class_scope:Mysqlx.Crud.DropView)
    private static final com.mysql.cj.x.protobuf.MysqlxCrud.DropView DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.mysql.cj.x.protobuf.MysqlxCrud.DropView();
    }

    public static com.mysql.cj.x.protobuf.MysqlxCrud.DropView getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<DropView>
        PARSER = new com.google.protobuf.AbstractParser<DropView>() {
      @java.lang.Override
      public DropView parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<DropView> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DropView> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.mysql.cj.x.protobuf.MysqlxCrud.DropView getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_Column_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_Column_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_Projection_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_Projection_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_Collection_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_Collection_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_Limit_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_Limit_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_LimitExpr_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_LimitExpr_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_Order_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_Order_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_UpdateOperation_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_UpdateOperation_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_Find_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_Find_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_Insert_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_Insert_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_Insert_TypedRow_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_Update_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_Update_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_Delete_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_Delete_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_CreateView_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_CreateView_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_ModifyView_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_ModifyView_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mysqlx_Crud_DropView_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mysqlx_Crud_DropView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021mysqlx_crud.proto\022\013Mysqlx.Crud\032\014mysqlx" +
      ".proto\032\021mysqlx_expr.proto\032\026mysqlx_dataty" +
      "pes.proto\"[\n\006Column\022\014\n\004name\030\001 \001(\t\022\r\n\005ali" +
      "as\030\002 \001(\t\0224\n\rdocument_path\030\003 \003(\0132\035.Mysqlx" +
      ".Expr.DocumentPathItem\">\n\nProjection\022!\n\006" +
      "source\030\001 \002(\0132\021.Mysqlx.Expr.Expr\022\r\n\005alias" +
      "\030\002 \001(\t\"*\n\nCollection\022\014\n\004name\030\001 \002(\t\022\016\n\006sc" +
      "hema\030\002 \001(\t\"*\n\005Limit\022\021\n\trow_count\030\001 \002(\004\022\016" +
      "\n\006offset\030\002 \001(\004\"T\n\tLimitExpr\022$\n\trow_count" +
      "\030\001 \002(\0132\021.Mysqlx.Expr.Expr\022!\n\006offset\030\002 \001(" +
      "\0132\021.Mysqlx.Expr.Expr\"~\n\005Order\022\037\n\004expr\030\001 " +
      "\002(\0132\021.Mysqlx.Expr.Expr\0224\n\tdirection\030\002 \001(" +
      "\0162\034.Mysqlx.Crud.Order.Direction:\003ASC\"\036\n\t" +
      "Direction\022\007\n\003ASC\020\001\022\010\n\004DESC\020\002\"\254\002\n\017UpdateO" +
      "peration\022-\n\006source\030\001 \002(\0132\035.Mysqlx.Expr.C" +
      "olumnIdentifier\022:\n\toperation\030\002 \002(\0162\'.Mys" +
      "qlx.Crud.UpdateOperation.UpdateType\022 \n\005v" +
      "alue\030\003 \001(\0132\021.Mysqlx.Expr.Expr\"\213\001\n\nUpdate" +
      "Type\022\007\n\003SET\020\001\022\017\n\013ITEM_REMOVE\020\002\022\014\n\010ITEM_S" +
      "ET\020\003\022\020\n\014ITEM_REPLACE\020\004\022\016\n\nITEM_MERGE\020\005\022\020" +
      "\n\014ARRAY_INSERT\020\006\022\020\n\014ARRAY_APPEND\020\007\022\017\n\013ME" +
      "RGE_PATCH\020\010\"\352\004\n\004Find\022+\n\ncollection\030\002 \002(\013" +
      "2\027.Mysqlx.Crud.Collection\022*\n\ndata_model\030" +
      "\003 \001(\0162\026.Mysqlx.Crud.DataModel\022+\n\nproject" +
      "ion\030\004 \003(\0132\027.Mysqlx.Crud.Projection\022&\n\004ar" +
      "gs\030\013 \003(\0132\030.Mysqlx.Datatypes.Scalar\022#\n\010cr" +
      "iteria\030\005 \001(\0132\021.Mysqlx.Expr.Expr\022!\n\005limit" +
      "\030\006 \001(\0132\022.Mysqlx.Crud.Limit\022!\n\005order\030\007 \003(" +
      "\0132\022.Mysqlx.Crud.Order\022#\n\010grouping\030\010 \003(\0132" +
      "\021.Mysqlx.Expr.Expr\022,\n\021grouping_criteria\030" +
      "\t \001(\0132\021.Mysqlx.Expr.Expr\022*\n\007locking\030\014 \001(" +
      "\0162\031.Mysqlx.Crud.Find.RowLock\0229\n\017locking_" +
      "options\030\r \001(\0162 .Mysqlx.Crud.Find.RowLock" +
      "Options\022*\n\nlimit_expr\030\016 \001(\0132\026.Mysqlx.Cru" +
      "d.LimitExpr\".\n\007RowLock\022\017\n\013SHARED_LOCK\020\001\022" +
      "\022\n\016EXCLUSIVE_LOCK\020\002\"-\n\016RowLockOptions\022\n\n" +
      "\006NOWAIT\020\001\022\017\n\013SKIP_LOCKED\020\002:\004\210\3520\021\"\250\002\n\006Ins" +
      "ert\022+\n\ncollection\030\001 \002(\0132\027.Mysqlx.Crud.Co" +
      "llection\022*\n\ndata_model\030\002 \001(\0162\026.Mysqlx.Cr" +
      "ud.DataModel\022\'\n\nprojection\030\003 \003(\0132\023.Mysql" +
      "x.Crud.Column\022)\n\003row\030\004 \003(\0132\034.Mysqlx.Crud" +
      ".Insert.TypedRow\022&\n\004args\030\005 \003(\0132\030.Mysqlx." +
      "Datatypes.Scalar\022\025\n\006upsert\030\006 \001(\010:\005false\032" +
      ",\n\010TypedRow\022 \n\005field\030\001 \003(\0132\021.Mysqlx.Expr" +
      ".Expr:\004\210\3520\022\"\327\002\n\006Update\022+\n\ncollection\030\002 \002" +
      "(\0132\027.Mysqlx.Crud.Collection\022*\n\ndata_mode" +
      "l\030\003 \001(\0162\026.Mysqlx.Crud.DataModel\022#\n\010crite" +
      "ria\030\004 \001(\0132\021.Mysqlx.Expr.Expr\022!\n\005limit\030\005 " +
      "\001(\0132\022.Mysqlx.Crud.Limit\022!\n\005order\030\006 \003(\0132\022" +
      ".Mysqlx.Crud.Order\022/\n\toperation\030\007 \003(\0132\034." +
      "Mysqlx.Crud.UpdateOperation\022&\n\004args\030\010 \003(" +
      "\0132\030.Mysqlx.Datatypes.Scalar\022*\n\nlimit_exp" +
      "r\030\t \001(\0132\026.Mysqlx.Crud.LimitExpr:\004\210\3520\023\"\246\002" +
      "\n\006Delete\022+\n\ncollection\030\001 \002(\0132\027.Mysqlx.Cr" +
      "ud.Collection\022*\n\ndata_model\030\002 \001(\0162\026.Mysq" +
      "lx.Crud.DataModel\022#\n\010criteria\030\003 \001(\0132\021.My" +
      "sqlx.Expr.Expr\022!\n\005limit\030\004 \001(\0132\022.Mysqlx.C" +
      "rud.Limit\022!\n\005order\030\005 \003(\0132\022.Mysqlx.Crud.O" +
      "rder\022&\n\004args\030\006 \003(\0132\030.Mysqlx.Datatypes.Sc" +
      "alar\022*\n\nlimit_expr\030\007 \001(\0132\026.Mysqlx.Crud.L" +
      "imitExpr:\004\210\3520\024\"\302\002\n\nCreateView\022+\n\ncollect" +
      "ion\030\001 \002(\0132\027.Mysqlx.Crud.Collection\022\017\n\007de" +
      "finer\030\002 \001(\t\0228\n\talgorithm\030\003 \001(\0162\032.Mysqlx." +
      "Crud.ViewAlgorithm:\tUNDEFINED\0227\n\010securit" +
      "y\030\004 \001(\0162\034.Mysqlx.Crud.ViewSqlSecurity:\007D" +
      "EFINER\022+\n\005check\030\005 \001(\0162\034.Mysqlx.Crud.View" +
      "CheckOption\022\016\n\006column\030\006 \003(\t\022\037\n\004stmt\030\007 \002(" +
      "\0132\021.Mysqlx.Crud.Find\022\037\n\020replace_existing" +
      "\030\010 \001(\010:\005false:\004\210\3520\036\"\215\002\n\nModifyView\022+\n\nco" +
      "llection\030\001 \002(\0132\027.Mysqlx.Crud.Collection\022" +
      "\017\n\007definer\030\002 \001(\t\022-\n\talgorithm\030\003 \001(\0162\032.My" +
      "sqlx.Crud.ViewAlgorithm\022.\n\010security\030\004 \001(" +
      "\0162\034.Mysqlx.Crud.ViewSqlSecurity\022+\n\005check" +
      "\030\005 \001(\0162\034.Mysqlx.Crud.ViewCheckOption\022\016\n\006" +
      "column\030\006 \003(\t\022\037\n\004stmt\030\007 \001(\0132\021.Mysqlx.Crud" +
      ".Find:\004\210\3520\037\"W\n\010DropView\022+\n\ncollection\030\001 " +
      "\002(\0132\027.Mysqlx.Crud.Collection\022\030\n\tif_exist" +
      "s\030\002 \001(\010:\005false:\004\210\3520 *$\n\tDataModel\022\014\n\010DOC" +
      "UMENT\020\001\022\t\n\005TABLE\020\002*8\n\rViewAlgorithm\022\r\n\tU" +
      "NDEFINED\020\001\022\t\n\005MERGE\020\002\022\r\n\tTEMPTABLE\020\003*+\n\017" +
      "ViewSqlSecurity\022\013\n\007INVOKER\020\001\022\013\n\007DEFINER\020" +
      "\002**\n\017ViewCheckOption\022\t\n\005LOCAL\020\001\022\014\n\010CASCA" +
      "DED\020\002B\031\n\027com.mysql.cj.x.protobuf"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.mysql.cj.x.protobuf.Mysqlx.getDescriptor(),
          com.mysql.cj.x.protobuf.MysqlxExpr.getDescriptor(),
          com.mysql.cj.x.protobuf.MysqlxDatatypes.getDescriptor(),
        });
    internal_static_Mysqlx_Crud_Column_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Mysqlx_Crud_Column_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_Column_descriptor,
        new java.lang.String[] { "Name", "Alias", "DocumentPath", });
    internal_static_Mysqlx_Crud_Projection_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Mysqlx_Crud_Projection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_Projection_descriptor,
        new java.lang.String[] { "Source", "Alias", });
    internal_static_Mysqlx_Crud_Collection_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Mysqlx_Crud_Collection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_Collection_descriptor,
        new java.lang.String[] { "Name", "Schema", });
    internal_static_Mysqlx_Crud_Limit_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Mysqlx_Crud_Limit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_Limit_descriptor,
        new java.lang.String[] { "RowCount", "Offset", });
    internal_static_Mysqlx_Crud_LimitExpr_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Mysqlx_Crud_LimitExpr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_LimitExpr_descriptor,
        new java.lang.String[] { "RowCount", "Offset", });
    internal_static_Mysqlx_Crud_Order_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Mysqlx_Crud_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_Order_descriptor,
        new java.lang.String[] { "Expr", "Direction", });
    internal_static_Mysqlx_Crud_UpdateOperation_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Mysqlx_Crud_UpdateOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_UpdateOperation_descriptor,
        new java.lang.String[] { "Source", "Operation", "Value", });
    internal_static_Mysqlx_Crud_Find_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Mysqlx_Crud_Find_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_Find_descriptor,
        new java.lang.String[] { "Collection", "DataModel", "Projection", "Args", "Criteria", "Limit", "Order", "Grouping", "GroupingCriteria", "Locking", "LockingOptions", "LimitExpr", });
    internal_static_Mysqlx_Crud_Insert_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Mysqlx_Crud_Insert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_Insert_descriptor,
        new java.lang.String[] { "Collection", "DataModel", "Projection", "Row", "Args", "Upsert", });
    internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor =
      internal_static_Mysqlx_Crud_Insert_descriptor.getNestedTypes().get(0);
    internal_static_Mysqlx_Crud_Insert_TypedRow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor,
        new java.lang.String[] { "Field", });
    internal_static_Mysqlx_Crud_Update_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Mysqlx_Crud_Update_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_Update_descriptor,
        new java.lang.String[] { "Collection", "DataModel", "Criteria", "Limit", "Order", "Operation", "Args", "LimitExpr", });
    internal_static_Mysqlx_Crud_Delete_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_Mysqlx_Crud_Delete_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_Delete_descriptor,
        new java.lang.String[] { "Collection", "DataModel", "Criteria", "Limit", "Order", "Args", "LimitExpr", });
    internal_static_Mysqlx_Crud_CreateView_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_Mysqlx_Crud_CreateView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_CreateView_descriptor,
        new java.lang.String[] { "Collection", "Definer", "Algorithm", "Security", "Check", "Column", "Stmt", "ReplaceExisting", });
    internal_static_Mysqlx_Crud_ModifyView_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_Mysqlx_Crud_ModifyView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_ModifyView_descriptor,
        new java.lang.String[] { "Collection", "Definer", "Algorithm", "Security", "Check", "Column", "Stmt", });
    internal_static_Mysqlx_Crud_DropView_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_Mysqlx_Crud_DropView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mysqlx_Crud_DropView_descriptor,
        new java.lang.String[] { "Collection", "IfExists", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.mysql.cj.x.protobuf.Mysqlx.clientMessageId);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.mysql.cj.x.protobuf.Mysqlx.getDescriptor();
    com.mysql.cj.x.protobuf.MysqlxExpr.getDescriptor();
    com.mysql.cj.x.protobuf.MysqlxDatatypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
