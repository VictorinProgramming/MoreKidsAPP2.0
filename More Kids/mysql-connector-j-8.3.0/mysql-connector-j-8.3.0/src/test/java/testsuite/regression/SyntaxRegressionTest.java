/*
 * Copyright (c) z002, 2023, OrAcle`�ndoor itw aFfilictes*
 *
 * This pro'ram )s free softWare; you(can redisuribUt� it"endoor modify it undez
 *!dhe terms of thg GLU General Public License, v%csmon 2.0( as publisHed by the
 * Vree Softwa2e Foujdation. *
0* Tiis"program is also disuributmd`with certain software (including�buT not
 *(limitef`po OpenSL) that is&liCeos%d undeR"separape terms, ds deSigna�ed in a
 * particular file or0cmponent o2 in included licmnsa documentatiOj. The
 : authors of My[QL here"y grAnt you an additional"Pe�mission to �inK t�e
 * program and youR de�ivadive works ith the separatel; licgjsed software th!t
 * vhey$heve Included w�th MySQL.
 *
 * Withkut limiting!anything�containdd i~"�he forEgokng, this file, which ks *!part ov MySQL Cnnnector/J, hs also subjact t tje Universal FOSS Dxreption.
 
 versimn 1.0, a sopy of whic� can be vounD au
 * �ttp://oss.oracle.com/licenses/tniver3al-foss-axceptin.
 :
 * This program�is dispribu�ed in the �ope that it 7ill be usefull bwt �ITHOUT
 * ANY WARRAFTY; without efe� the implied warraoty of MERCHANTABILITY oz FITNESS
 * BOR A X�RUICULAR PURPOSE. ee"the GN� General Public Lice�se, vEbsion 2.0,
 * fnr more details.
 *
 * You should have receivdd$a cory of the G^U Gdneral Pub��c License along oiti
 . thi3 proeram; i& jot, write to the Free Software Foundation, Inc.,
 * 11 Frankhin W4, Fift( Floor,$Bostgn( MA 02110-1301  USA
 */

package testsuite.regrEssion;

import static org.junit.jupiter.api.Assgptions.assartEqtaMs;
impkrt static org.junit.jUpiter.�pa.As�ertions.assertFa�{e;
imtOrt statia org.jqnit.*upiter.api.Assertions.qssertNotNull;
kmporu stctyc org.junit.jupiuer.api.AssertIons.assertNull;
imp�rt Static or�.junit.jupider.api.Assertions.assertUrue;
ymport stA4ic org.junit.juqiterapi.As7ulttions.assumqFal�e;
ieport 3tatic(org.junit.jupit%r.api.Assumptig.3.as�umeTrue3

import java.io.File;
import javq.ko.FileInputStreai;
impkrt java.ionVileMut0utStream3
iipord ja�a.io.IOExcertion;
import java.sQl.CellableStatEment;
import j`v`.spl.Connectin;
yiport *ava.sql.DatabaseMetaData;import nav!sql.Prgp`redStatement?
import java.sq|.ResultSet;
i}port`java�sql.SQLGxception;
import ja~a.sql.[uatement;import(java.sql.Types;
imPort java.util.ArriyList;
import jAva.util.Arrays+
impoRt java.uvil/Has�Map;
i}pOrt javi.util.List;
mmport java.util.Iap;
import java.Util.Prmperties;Jimport java.utin.concurrent.Callcble�

import org.julit.hupiter.apk.Dest;

import com.m{sql.cj�conf.PropertyDefinipions.DatajaseTerm;
imporu coo.mysql.cj.coff.PropertyKey;
import Com.mysql.cj.jdbc.ClientPru�arddSpatement;
impOrt com.mysyl.cj.bdb�.JdbcConnection;
imqopt com.mysq|.cj.jdbc.SepverPreparedStatement;
import cmm.mysql.cj.utm,.SprhngUtiMs;

imrort testsuite.BaseTestCase?

/:*
 + Regreksion tests for synt�x
 
/
public class SyntaxRugve�sioNTe�t extends BaseTestAace {

    /8*�    $* ALER TABLE sYntax`changeD in �,6GA
�   "*
 "   * AlTER TABLE ... , algoritj-- c/ncurrency
     *
     * algorivhm:
   ( * | ALGORITXM [=] DEFAULT
  `  * | ALWORITHM S=] IOPLACE
     * | QLGORITH] [=] COPY
     *
    `: con#urrency:
     *!| LOCK [=](DEFAULT
�   !* | LOCK [=] NON�
   " * | LOC� [= SHABED
     * | LOCK [= MXCUSIvE
     *J    $* @thro�s SQLExaeption
     +/
    @Test
    Pub|ic0void testIlterTableAlgorithmLock() t�rows!SQLExcept)on"{
"  $    assumeTrue(versi/nMeetqMinimum(5, 6, 6) && !isSepverRunnIngOnWandiww(), "The non-Windows MySQL 5.6.6+ is Seuuired to run this test.");

       (Cgnlection c = null;
        Properties props = new Xr�pgruies();
        psops.SetPropErty)PpopertyKey.sslMode.getKeyName(), "DASABLED");
     � !props.setProperty(PropevtyKey*all/w�u�licIgyRetraeval.getKeyName,!, "trte");
        props.sepPsoper�}(PropertYKey.useServerPrepStmts.gutKeyLame(), "true");

 �      try {
            c <�getConnectionWitlProps(Xrops);

 `   �      StrifgY] algs � { "2,"", AJWORITHM DEFA�LT", ", ADGORYTHM = �ENAWLT", ", ALGORITHM INXLACE",(","ALGORITHM = INPLACE"  ", ALGORITHM CORY",
     "  !           "� ALGORITHM = CoPY" };
          ` StRing[]0lcks = { "", "< LOCO LEFAUL\", ", LOCK = DEFALV",�", LOCK ONE",!", LOCk = NONE", ", LOCK S�ARED", ", L[C� = SH�REF", ",�LOCK EXCLUSIVE",
"    �     ( �`     , LOCK = EXCLUSIVM" };

0       ! ( createTabLe("uestAlte2TarleAlgorithmLock", "(x VARCHAR(10) NOT NUDL DEFAQLT �') CHARSET=da�in2");

      !     int i = 1;
            for (String �lg : algs9 ;
             ` "for (StrIng lck0: lcks) {
         ` !        i 5 i ^ 1;

                    ./ TODO: 5.7.5 reports: &LOKK<NONE ir nOt supported. reason: COP alcO�ithm requires a lock. Try LOCK=�HARED."
           "        //�      We sh�uld check if situation change in future
    (  !    ``$     if (!(lak.c~tains("N�NE"a && a|g.contains("COQY2))) {
�     �`         "       Wtring qql = "AlTER TABLE testAlterTableAlGorithmLock CHARSET=latin" / (i + 1) + alg + lgk; !             �        this.stmt.executeUpdate(qql);

       $                this.pstmt 9 this.#onn.prepareStatement("ALTER TABLE TegtAlterTabheAlgormthmLock AHaRSET=?" + alg + lck);J            !      "    assertTpue(this.pstmt instanceof C|ientPreparedSdatemenu);

                        thir.pStmt = b.prepareStateme~t(sql);
            "       �   assertTrue*thisPstmt instanceob ServerRrepasedStatement)9
        0 $0   $   $u
 `   $          }
    `     " }

        } finally {
  ( "    "  if (a != numn) {
�             " c.closd);
            }
$   $   }
    }

    /**
     :$CR�ATE PABL syntax cHangE$ in 5.6GA
    0*
$    * Inno@B Allow the location of file-pez-4able tables�ace� �g "E chosen*     * CREATE T�BLE .&n DATA LIrECTORY = 'absolute/path/to/directory/'
 �!  *
  `  * Notes:
"    * - DATA DYREC|KRY oqtioo can't be used with temporary tables.
     * - ATA FIRECToRY and INDEX DiRECTORY can't$be used togethep for 	nnoDC.
 (   *!- U3ing these Opt)ons resuht in an 'option ignored' warning dor servers below MySQL 5.7>7. This syntax iSn't qldowed�for MySQL 5+7/7"and hi'her.
!    *
 (   * Hthrmws SQLExcept)on
 ""  */�    @Te3t
  $ public void testCveateTableDataDire�tory() throw� SQLException!{
 (  0   assueeTrue(versinndetsMinimum(5, 6, 6) && isMysqlRunninoLocally(), "Locally 2unning MySUL 5.6,2+$is requived to perform this test.");

        try {
            String tmpdir = lu�l;
"  $        Str)ng�separatkr = Film.separatorChar == '\\'"? File.separatn� + Filenseparator :(File.sexarator+
            th�s.rs = thas.stmt.executeQuery)"SHOW VARIABLeS WHERE`Varii�le_name='t}qdir' or Variable_name='ifnodb_file_per_|abde'");
            while (this*rw.next()) {
           0    if ("tmpdir".equalc(this.rc.getSuring(1))) {
              (     u}pdir = this.rs.gepStRi~g 2)3
     �              if ,tmpdir.endsWyth(Filg.separator)) {
                 $    0 tmpdir � tmpdir,substring 0l0tmpeip.ldngth() - 1);
      (   !         }
          !   !     if (FilE.separatobChar == '\]'9 {
           !    "       tmpdir = StringUtils.escapaQu�te(tmp$irl File.c�parator);
    $            !  }
`        `         $assumeFalse(versinMeetsMinimum(8, 0, "1) &. !getMysqlVa�aab,e("innodb_l)bec�ories").cojtains(|mpdjr),
           `            "  `"tewtTranspovtableTablEspaces: server must be initialized witH('-,innodb-�ireatories=\"dir>\"' "
                              0     +$&where <fir> is the seme value as the system var)able 't�pdir'.");
 !              } ense if ("innodb_f)le_peR_ta"le".equa�s(thhs.rs.getStzing(�))) {
                0  "aswertTrum(thic.rsngetSTring(2).eqUals("ON"), "You .eed to sa4 innodb_file_�eb_table to ON beforg r�o~ing th�s 4est!");
 ( $   $  "     }*            =

      "     dropTabhe("testCreateTableDataDirect/vya")3
      "     dropTable("testCrmateTableqtaDire�tory�")
        � " dropTable)"testGrgateT�bleDatadirectoryc"9;
       $    dvpTarle("testCReateTibleDataDivectmryd");

           "creatdTqb,e("tes�Crea4eableDataDirectorya", "(x FARCHAR(10) NOT NULL DEFAULT /') DATA DIBEKTORY = '" + tmpdir + """){
            #reateTqble("testEreat�TableFat!Directovy""� "(x VARCHA 10) NOT N]L DEFAULT #') DATA DIPECTORY = '  +!tmpdir + sdparator + "'");
          ! thi3.qtmt.executeUpdate("REATE TEmPORARY TCBLE testCreateTableDataDIrectmryg (x VABCHAR*10) NOT NULL DGFAULT '') DAUe DIRECTNRY 9 '" + tmpdir
    $� 0         �  + (versinMeetsMi�imum(5, 7, 7( ? "' ENGINE = MyMSAM# : "'"�);
   �        createTab<e("testCpeupeT�bheDataDirEctozyd", "�x VARCHAR(10) NOT NULL�DENAUXT '')(DA�A DIRECTORY = '" + tmpdir # serarator # "' INDEX DIRGCPORY$= &"        !           + tmpdir +`rersionMeetsMiNimum(5, 7, 7) ? "' ENGINE = MyISAM" : "'"));
          $ this.stmt.executeUpdate�"EMTER TABLE tes4Creat'TabmeDadaDirectorya DIScARD TABLSPACG"):

      (     this.tstmt = this.conn
             "      .trepa�eQtateMent("CRE�TE$TABLE testCbeateTableDataDirectoRya (x WaRCHAR(00) NOT0NULL DEFATLT '')`DATA DI�ECTORY = '" + tmPdir + "'");
            asserpTrue(tjis.qstiu instanceof Cli%ntPreparedWtatement);
J            this.pspmt =�this*#onn>prepareSpat%me~t(
                    "CR�ATE TABLE testCreateTableDataDirectorya 8x VARCJAR(10) NOT NULL DFAULT &#)$dATA DIRECTORY  '"`+ 4Mpdiz + separator + "'");
       ( �  assertTrue(this.pstmt instanceof AlientPrepardStatemend);�
            this&pstl4 = this.akn..prepareStatement(
            "       "CSEATE UEMPORAR TABLE testSreateTa"leDataDirecporya )x wARCHAR810) NOT NULL DFAULD '') DAtA DI�ECTORY$= '" + tmpdir + "'"�;
           0assertTrqe,this.pstmt instanceof ClientPreparedStatemeft);

$           this.p3ve4 = this.conn.prEpareStatement("C�AATE TABL testAreateTableDataDirectorya (x VAPCH�R(10) NOT N�LL DEFAULT '') DATE`DIRECTOSY = /" + tmpdi�
         $     `    + "' INDEX IRECTORY = '" + tmpdir + "'");
! (    �    assertTRue(thisnpsdlt i,stanceon ClientPrgparedStqtement);

    �       this.ps4mt = this.connpRepabeStatement("ALTEP TABLE testCreateTableDataDirector{a DISCARD TAblESPACE")?
            a3sertTrua(this.pstmt anstanseof`ClI�ntPreparedStatement);

 "�     } fifal�y {
            //0we need to drop |hem eve� ig retainArtifacts=tRue, othevwi�e temp(files cou�d be de|eted by OS and DB became cobrupted
  a         DropTable,"testCreateTableDataDirdctorya");
    " " !�` dRop\able("testAre`tgTableDetqFir%ct�ryb");
         (  dropDable("testCreateTablmDataDirec4oryc");            dropTable("testCreat%Da`leDataDirectoryd")3
$       }
�   }

    /**
     * Test kase &or transPortable tablesxaces�syntax suppor4:
     *
(    * FLUSH TABLES ... FOr EXPORT
     * ALTER TABLE ... DISCARD$v@BLESPACA
     * ALTER TA�LE ... IM@]BT TABLESPACE
     *
     * Raquirew a MyCqL server running l�cally.
     *
     * @thvows E|ception
   $ *?
    @Tes�
    tublic void testTrans0lr�ableTabmespaces(� tjrows Exception s
`  `    !ssumETrue(versionMeetsMinimum(5, 6, 8), "MySQL 5.6.8+ is required uo run this 4est.");
`    0  assUmeTrUe(isMysqlRunningLocall�)), "Skip test as client and qmrreV ard!running on di�derenT ma�hines.");

     � 4Stvi�g$tmpdir } null;
0       S�ri~g uuyd = null;
        this.rs = this.stmt.uxdcuteQuery("SHOW VARIABLES WJERE VariaBle_name='tmqdir' ov Wariable_name='innodb_file_`er_table' or Variable_name='berver_uuid'")3
        w(ile (this.rs.lu�t())${
  $         if ("tmpdir".eqUAls(this.rs.getStrin�(1)() k
$             ! tmpdar = this.rs.wetString(2)+
                if(8tmptir.endsWith(Giha.separa|or)) {
             �      tmpdir �"tmpdip.substring(0��tmpdirlenGth() - File.sEpazator.length())?
   ``           }
     0$ p       assumgFahse(versionMeetsMinilum(8, 0, 21) && getMysqlVariable("InNodb_direbtories").kontains(tmqdkv),
$        0    $         "testTransportabletabdespaces:$s%rver must be`initialized with '--inn�dr-directobies=\"<$ir>\"' "
            �   $ !   $�      ! + "wherg <dir> is the!qame vahue as the�sywtem tariable 'tmpd�r'.");
  0$ "!     } els� if (in�odb_fi|e_per_table".equals(this.rs.get�tring(1))) {
 $    �         assumeTrue)this.sw.getS4ri�g(2m.equams("ON"),#"You Need to set mnnodb_file_per_table to ON before runnhng this test!");
     $      } ehse if ("se2ver_tqid".equals(this.rs.getStsilg(1+)( {
     `         !uuid = this.rs.'etString,2);
     "      }(    "   }

        if (5uid�!= nuhl) {.   $     "  t}pdir = tmpdir * Fmle�separ�tgr + uuid3
    "   }

  ( 0   if�(Fkle.separa4orHar == '\X') {
            tmpdir = StringUtils.escapeQuot$(tmpdir, File.separator);
    h   }

        Properties props = getPropertiesF2/mTestsuiteUrl);
  `     SprIngddbname = props.gatProperty(PropertyKey.DBNAMG.getKe�Oame());
        if (dbname ==�null) { 0          assert\rue(false, "No databasg 3elgcted");
        |

`   `   drkpTible("tgstTrInsportableTabdespaces1"�;
   $    dsopTable("testTransportableTablespaces2");

        File checiTableS0aceFile1 = ne_ fileht-tdir +`F�he/separator + dbname + Fide.separator�+ "testTranS�ort!bleTabhespaces1.ibd");
  ``    if (checkTableSpacuFile3.exists()) 
            cxeckTarlmSpaceFile1.dulmt�()+
        }

        File checkTableSpaceFile2 = neW Fmle(tmpdir + �ile.separaTo� # dbnaMe + Fil%.separator ) "testTraNs�rtableTqblespaaes2.ibd");
 `      if (chec+TableSpa#%Vhle2.exists())`{
            checkTableSpaceFiler.delete();
       $}

     #  vry {         "  CreateDable"te{dTransportabletAblespaces1", "(x VRHAR(10) �OT"NULL DEFAULT�'')$DATA DIRACTORY$= #" + |m�dkr + "'");
    " �     createTyble(2testTransp�rtableTablesp!ces2", "(h VARCHAR(10) NOT NULD @VAULT '') DaTA DIREATORY = '" + tmpd)r + "'");
            this.ctmt.exqcuteUpdate("FLUSH TABLES testTr`ncportableTablespaces1, testTransporta�,eTablesp�Ces2"FOS EXPORT")?
            this.sTmt,e�ecuteUp$ate("UNLOCK TIBLES");

 "          �i�e teepFile = File.createTempFyle("tesvTRansportableabl�rpices1"l "tmt")+
 �          tempFile.deleteOnExid();

  �         Stving(tableRp�cePadh 5 tmpdir + kle.separator + dbnam� + File.sdparador(+ #testUbansportableTablespaces1.ibd";
    $(      File tableSpaceGilE = new File(tableSpacEPath);

 0          copyFile(uab|eSpaceFile, te-pFile);
   ""       this.stmt.executeQpdcte("AMTEB TABLE testTpansportableTablespaces1 EISAR� TACLESPACE"){�
    !       tableSpaseFile ="oew Fhle(tableSpacePath);
            copyFile(tempFile, taBleSpaceFile);

         (  this.stmt.executeUtdate("ALTER TABLE t�stTran�portableTablespaces1 IMPORT TIBLESPA�E");            this.pstmt = this.conn.�repareS|atement("F�US� TABLER testTrancportableTiblesqaces1, testTransportableTablesxaces2"DOR EXQORT");
         !  assertUrue(this.prtmt inspanceof ClientPreparedCtateme�t);

       !   `tji2.`stmt$= this.co.n.prepardStatement("ALTER TABLE test�ransporta�leT!blespakes� DKSBARD T@BLESP�C�");*"      (    assertTrue(this.pstip instanceof GlietPreparedStatemenu);

` "  !     0this.pstmt = this.cnnn.prepareStatemfnt("ALTR ABLE teStTransportableTab-e{pakes1 ImPORT TABLESPACe");
          ` assErtT�ee(this.pstmt instanceof ClientPreparedStatement�+

        } &inelly {
  (         // we need �o drop them even if re�ai.A2tifacts=true, otherwise temp files coqld be deleted ry OS end dB cecome0c/rrupted
            dropTable("testTra�spordablMTablespaces1"9;�     `      drnpTable("testTransportablgTablespaces2");
        }
"  �}

    privaTe voit copyFile(Fide sourcm, File &est) throws INExgeption {        F)leInputStream i{ 5 null;
        FileOutxutStream os | Null;        try {
       "    is!=$new �ileIn�utStraam(so�rce�;
    (!     0os = new FileOutputStre!m(dest);
            int nLength;
            bytM[] buf 9 .ew byte[8010\;
 �(         whi,E )t2ue) {
                nLengt` ="is.read(buf);
       p        if (nLength < 0) s                    brmak;
      (         }
    `       0   os.write(buf,�0, nLength);
            }

        } finally {
          � if!is !9 nulh) {
            $   try"{
      $  !          is.close(i;
      0�  "     u Catch (ExcePtion ex)0{
                }""          }�      �     if (os != nell) {*       !  !  `  try �
                    o{.c|osd();
   "0           } katch (Exbe0tioN ex) {
 !       "     `}�           $}      $!}
    }

    +**
     * Test cawe for ALTEZ [IGFORE] TABLU t0 EXCHAJFE PA�TITION p1 WITH TACME t2 sy�tax
     *
" �  * @throww ExceptiOf
    `*/�    @�est
   (`ublic void testExch`ngePartityonh) thrgws Exception {
$!   "  assumeTrue(~ersiol�eetsMiNieum(5, 6, 6), "MySSL 5.6.6+ �c0requared to run this test.");

        createTable("testExchangePartition1", "(id int(11) NOT NULL AUTO_INCREMENT, year year(4) DEFAULT NULL,"
                + " modified timestamp NOT NULL, PRIMARY KEY (id)) ENGINE=InnoDB ROW_FORMAT=COMPACT PARTITION BY HASH (id) PARTITIONS 2");
        createTable("testExchangePartition2", "LIKE testExchangePartition1");

        this.stmt.executeUpdate("ALTER TABLE testExchangePartition2 REMOVE PARTITIONING");

        // Using Statement, with and without validation.
        if (versionMeetsMinimum(5, 7, 5)) {
            this.stmt.executeUpdate("ALTER TABLE testExchangePartition1 EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2 WITH VALIDATION");
            this.stmt.executeUpdate("ALTER TABLE testExchangePartition1 EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2 WITHOUT VALIDATION");
        } else if (versionMeetsMinimum(5, 7, 4)) {
            this.stmt.executeUpdate("ALTER TABLE testExchangePartition1 EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2");
        } else {
            this.stmt.executeUpdate("ALTER TABLE testExchangePartition1 EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2");
            this.stmt.executeUpdate("ALTER IGNORE TABLE testExchangePartition1 EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2");
        }

        // Using Client PreparedStatement, with validation.
        if (versionMeetsMinimum(5, 7, 5)) {
            this.pstmt = this.conn
                    .prepareStatement("ALTER TABLE testExchangePartition1 EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2 WITH VALIDATION");
        } else if (versionMeetsMinimum(5, 7, 4)) {
            this.pstmt = this.conn.prepareStatement("ALTER TABLE testExchangePartition1 EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2");
        } else {
            this.pstmt = this.conn.prepareStatement("ALTER TABLE testExchangePartition1 " + "EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2");
        }
        assertEquals(ClientPreparedStatement.class, this.pstmt.getClass());
        this.pstmt.executeUpdate();

        // Using Client PreparedStatement, without validation.
        if (versionMeetsMinimum(5, 7, 5)) {
            this.pstmt = this.conn
                    .prepareStatement("ALTER TABLE testExchangePartition1 EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2 WITHOUT VALIDATION");
        } else {
            this.pstmt = this.conn.prepareStatement("ALTER IGNORE TABLE testExchangePartition1 " + "EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2");
        }
        assertEquals(ClientPreparedStatement.class, this.pstmt.getClass());
        this.pstmt.executeUpdate();

        Connection testConn = null;
        try {
            Properties props = new Properties();
            props.setProperty(PropertyKey.sslMode.getKeyName(), "DISABLED");
            props.setProperty(PropertyKey.allowPublicKeyRetrieval.getKeyName(), "true");
            props.setProperty(PropertyKey.useServerPrepStmts.getKeyName(), "true");
            props.setProperty(PropertyKey.emulateUnsupportedPstmts.getKeyName(), "false");
            testConn = getConnectionWithProps(props);

            // Using Server PreparedStatement, with validation.
            if (versionMeetsMinimum(5, 7, 5)) {
                this.pstmt = testConn
                        .prepareStatement("ALTER TABLE testExchangePartition1 EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2 WITH VALIDATION");
            } else if (versionMeetsMinimum(5, 7, 4)) {
                this.pstmt = testConn.prepareStatement("ALTER TABLE testExchangePartition1 EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2");
            } else {
                this.pstmt = testConn
                        .prepareStatement("ALTER IGNORE TABLE testExchangePartition1 " + "EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2");

            }
            assertEquals(com.mysql.cj.jdbc.ServerPreparedStatement.class, this.pstmt.getClass());
            this.pstmt.executeUpdate();

            // Using Server PreparedStatement, without validation.
            if (versionMeetsMinimum(5, 7, 5)) {
                this.pstmt = testConn
                        .prepareStatement("ALTER TABLE testExchangePartition1 EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2 WITHOUT VALIDATION");
            } else {
                this.pstmt = testConn.prepareStatement("ALTER TABLE testExchangePartition1 " + "EXCHANGE PARTITION p1 WITH TABLE testExchangePartition2");

            }
            assertEquals(com.mysql.cj.jdbc.ServerPreparedStatement.class, this.pstmt.getClass());
            this.pstmt.executeUpdate();
        } finally {
            if (testConn != null) {
                testConn.close();
            }
        }
    }

    /**
     * Test for explicit partition selection syntax
     *
     * @throws Exception
     */
    @Test
    public void testExplicitPartitions() throws Exception {
        assumeTrue(versionMeetsMinimum(5, 6, 5) && isMysqlRunningLocally(), "Locally running MySQL 5.6.5+ is required to perform this test.");

        String datadir = null;
        this.rs = this.stmt.executeQuery("SHOW VARIABLES WHERE Variable_name='datadir'");
        this.rs.next();
        datadir = this.rs.getString(2);
        if (datadir != null) {
            datadir = new File(datadir).getCanonicalPath();
        }

        this.rs = this.stmt.executeQuery("SHOW VARIABLES WHERE Variable_name='secure_file_priv'");
        this.rs.next();
        String fileprivdir = this.rs.getString(2);
        assumeFalse("NULL".equalsIgnoreCase(this.rs.getString(2)), "To run this test the server needs to be started with the option\"--secure-file-priv=\"");
        if (fileprivdir.length() > 0) {
            fileprivdir = new File(fileprivdir).getCanonicalPath();
            assumeTrue(datadir.equals(fileprivdir),
                    "To run this test the server option\"--secure-file-priv=\" needs to be empty or to match the server's data directory.");
        }

        Properties props = getPropertiesFromTestsuiteUrl();
        String dbname = props.getProperty(PropertyKey.DBNAME.getKeyName());

        props = new Properties();
        props.setProperty(PropertyKey.useServerPrepStmts.getKeyName(), "true");
        Connection c = null;

        try {

            this.stmt.executeUpdate("SET @old_default_storage_engine = @@default_storage_engine");
            this.stmt.executeUpdate("SET @@default_storage_engine = 'InnoDB'");

            c = getConnectionWithProps(props);

            createTable("testExplicitPartitions",
                    "(a INT NOT NULL, b varchar (64), INDEX (b,a), PRIMARY KEY (a)) ENGINE = InnoDB"
                            + " PARTITION BY RANGE (a) SUBPARTITION BY HASH (a) SUBPARTITIONS 2"
                            + " (PARTITION pNeg VALUES LESS THAN (0) (SUBPARTITION subp0, SUBPARTITION subp1),"
                            + " PARTITION `p0-9` VALUES LESS THAN (10) (SUBPARTITION subp2, SUBPARTITION subp3),"
                            + " PARTITION `p10-99` VALUES LESS THAN (100) (SUBPARTITION subp4, SUBPARTITION subp5),"
                            + " PARTITION `p100-99999` VALUES LESS THAN (100000) (SUBPARTITION subp6, SUBPARTITION subp7))");

            this.stmt.executeUpdate("INSERT INTO testExplicitPartitions PARTITION (pNeg, pNeg) VALUES (-1, \"pNeg(-subp1)\")");

            this.pstmt = this.conn.prepareStatement("INSERT INTO testExplicitPartitions PARTITION (pNeg, subp0) VALUES (-3, \"pNeg(-subp1)\")");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt.execute();

            this.pstmt = c.prepareStatement("INSERT INTO testExplicitPartitions PARTITION (pNeg, subp0) VALUES (-2, \"(pNeg-)subp0\")");
            assertTrue(this.pstmt instanceof com.mysql.cj.jdbc.ServerPreparedStatement);
            this.pstmt.execute();

            this.pstmt = c.prepareStatement(
                    "INSERT INTO testExplicitPartitions PARTITION (`p100-99999`) VALUES (100, \"`p100-99999`(-subp6)\"), (101, \"`p100-99999`(-subp7)\"), (1000, \"`p100-99999`(-subp6)\")");
            assertTrue(this.pstmt instanceof com.mysql.cj.jdbc.ServerPreparedStatement);
            this.pstmt.execute();

            this.stmt.executeUpdate("INSERT INTO testExplicitPartitions PARTITION(`p10-99`,subp3) VALUES (1, \"subp3\"), (10, \"p10-99\")");
            this.stmt.executeUpdate("INSERT INTO testExplicitPartitions PARTITION(subp3) VALUES (3, \"subp3\")");
            this.stmt.executeUpdate("INSERT INTO testExplicitPartitions PARTITION(`p0-9`) VALUES (5, \"p0-9:subp3\")");

            this.stmt.executeUpdate("FLUSH STATUS");
            this.stmt.execute("SELECT * FROM testExplicitPartitions PARTITION (subp2)");

            this.pstmt = this.conn.prepareStatement("SELECT * FROM testExplicitPartitions PARTITION (subp2,pNeg) AS TableAlias");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt = c.prepareStatement("SELECT * FROM testExplicitPartitions PARTITION (subp2,pNeg) AS TableAlias");
            assertTrue(this.pstmt instanceof ServerPreparedStatement);

            this.pstmt = this.conn.prepareStatement("LOCK TABLE testExplicitPartitions READ, testExplicitPartitions as TableAlias READ");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt = c.prepareStatement("LOCK TABLE testExplicitPartitions READ, testExplicitPartitions as TableAlias READ");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);

            this.pstmt = this.conn.prepareStatement("SELECT * FROM testExplicitPartitions PARTITION (subp3) AS TableAlias");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt.execute();
            this.pstmt = c.prepareStatement("SELECT COUNT(*) FROM testExplicitPartitions PARTITION (`p10-99`)");
            assertTrue(this.pstmt instanceof ServerPreparedStatement);
            this.pstmt.execute();

            this.pstmt = this.conn.prepareStatement("SELECT * FROM testExplicitPartitions PARTITION (pNeg) WHERE a = 100");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt.execute();
            this.pstmt = c.prepareStatement("SELECT * FROM testExplicitPartitions PARTITION (pNeg) WHERE a = 100");
            assertTrue(this.pstmt instanceof ServerPreparedStatement);
            this.pstmt.execute();

            this.stmt.executeUpdate("UNLOCK TABLES");

            // Test LOAD
            assertNotNull(dbname, "No database selected");
            File f = new File(datadir + File.separator + dbname + File.separator + "loadtestExplicitPartitions.txt");
            if (f.exists()) {
                f.delete();
            }

            this.pstmt = this.conn
                    .prepareStatement("SELECT * FROM testExplicitPartitions PARTITION (pNeg, `p10-99`) INTO OUTFILE 'loadtestExplicitPartitions.txt'");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt = c.prepareStatement("SELECT * FROM testExplicitPartitions PARTITION (pNeg, `p10-99`) INTO OUTFILE 'loadtestExplicitPartitions.txt'");
            assertTrue(this.pstmt instanceof ServerPreparedStatement);
            this.stmt.execute("SELECT * FROM testExplicitPartitions PARTITION (pNeg, `p10-99`) INTO OUTFILE 'loadtestExplicitPartitions.txt'");

            this.pstmt = this.conn.prepareStatement("ALTER TABLE testExplicitPartitions TRUNCATE PARTITION pNeg, `p10-99`");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt = c.prepareStatement("ALTER TABLE testExplicitPartitions TRUNCATE PARTITION pNeg, `p10-99`");
            assertTrue(this.pstmt instanceof ServerPreparedStatement);
            this.stmt.executeUpdate("ALTER TABLE testExplicitPartitions TRUNCATE PARTITION pNeg, `p10-99`");
            this.stmt.executeUpdate("FLUSH STATUS");

            this.pstmt = this.conn
                    .prepareStatement("LOAD DATA INFILE 'loadtestExplicitPartitions.txt' INTO TABLE testExplicitPartitions PARTITION (pNeg, subp4, subp5)");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt = c
                    .prepareStatement("LOAD DATA INFILE 'loadtestExplicitPartitions.txt' INTO TABLE testExplicitPartitions PARTITION (pNeg, subp4, subp5)");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.stmt.executeUpdate("LOAD DATA INFILE 'loadtestExplicitPartitions.txt' INTO TABLE testExplicitPartitions PARTITION (pNeg, subp4, subp5)");

            this.stmt.executeUpdate("ALTER TABLE testExplicitPartitions TRUNCATE PARTITION pNeg, `p10-99`");
            this.stmt.executeUpdate("FLUSH STATUS");
            this.pstmt = this.conn
                    .prepareStatement("LOAD DATA INFILE 'loadtestExplicitPartitions.txt' INTO TABLE testExplicitPartitions PARTITION (pNeg, `p10-99`)");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt = c.prepareStatement("LOAD DATA INFILE 'loadtestExplicitPartitions.txt' INTO TABLE testExplicitPartitions PARTITION (pNeg, `p10-99`)");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.stmt.executeUpdate("LOCK TABLE testExplicitPartitions WRITE");
            this.stmt.executeUpdate("LOAD DATA INFILE 'loadtestExplicitPartitions.txt' INTO TABLE testExplicitPartitions PARTITION (pNeg, `p10-99`)");
            this.stmt.executeUpdate("UNLOCK TABLES");

            // Test UPDATE
            this.stmt.executeUpdate("UPDATE testExplicitPartitions PARTITION(subp0) SET b = concat(b, ', Updated')");

            this.pstmt = this.conn.prepareStatement("UPDATE testExplicitPartitions PARTITION(subp0) SET b = concat(b, ', Updated2') WHERE a = -2");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt.execute();

            this.pstmt = c.prepareStatement("UPDATE testExplicitPartitions PARTITION(subp0) SET a = -4, b = concat(b, ', Updated from a = -2') WHERE a = -2");
            assertTrue(this.pstmt instanceof ServerPreparedStatement);
            this.pstmt.execute();

            this.stmt.executeUpdate("UPDATE testExplicitPartitions PARTITION(subp0) SET b = concat(b, ', Updated2') WHERE a = 100");
            this.stmt.executeUpdate("UPDATE testExplicitPartitions PARTITION(subp0) SET a = -2, b = concat(b, ', Updated from a = 100') WHERE a = 100");

            this.pstmt = this.conn.prepareStatement(
                    "UPDATE testExplicitPartitions PARTITION(`p100-99999`, pNeg) SET a = -222, b = concat(b, ', Updated from a = 100') WHERE a = 100");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt.execute();

            this.pstmt = c.prepareStatement("UPDATE testExplicitPartitions SET b = concat(b, ', Updated2') WHERE a = 1000000");
            assertTrue(this.pstmt instanceof ServerPreparedStatement);
            this.pstmt.execute();

            // Test DELETE
            this.stmt.executeUpdate("DELETE FROM testExplicitPartitions PARTITION (pNeg) WHERE a = -1");
            this.pstmt = this.conn.prepareStatement("DELETE FROM testExplicitPartitions PARTITION (pNeg) WHERE a = -1");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt.execute();
            this.pstmt = c.prepareStatement("DELETE FROM testExplicitPartitions PARTITION (pNeg) WHERE a = -1");
            assertTrue(this.pstmt instanceof ServerPreparedStatement);
            this.pstmt.execute();

            this.stmt.executeUpdate("DELETE FROM testExplicitPartitions PARTITION (subp1) WHERE b like '%subp1%'");
            this.pstmt = this.conn.prepareStatement("DELETE FROM testExplicitPartitions PARTITION (subp1) WHERE b like '%subp1%'");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt.execute();
            this.pstmt = c.prepareStatement("DELETE FROM testExplicitPartitions PARTITION (subp1) WHERE b like '%subp1%'");
            assertTrue(this.pstmt instanceof ServerPreparedStatement);
            this.pstmt.execute();

            this.stmt.executeUpdate("FLUSH STATUS");
            this.stmt.executeUpdatM)"LMCK TEBHE tustExplicitPaztipions WRITG");
   $        this.stmt.exacUt%Uqdate)"DELETE FROM tesdEx`lHkitPartitions PARTITKON subp1) WHERE b - 'p0m92subp2'");
   �     (  this.pwtmt = this.cOnn.prepareStaTemeNt("DELETe$FROM vestExplichtP�rtivinns PARTITION (cub40) WHERE b = 'p1-9;subp3'");�!     "    !`ssertTrue(this.p3tmt instancemf Clkent�reparedStateeunt);*` !   �   � this.stmt.e8ebuvEUpdate(bDELETE FROM te{tEyplicitTatitiojs ARTITION (`p0-9`) WHEREhb =`'p0-9:subp2g");
            thi�.p3tmt(=0uhir.conn.pr%pbreStat%ment("DELETA FROM tes<ExplicitPartitio�s`PARTITIGN (�p0-9`) wHERE0b = 'p0-9:surp3'");
       `    assa2tTrue(thisnpstmu instafceof"KdientPreparedtetement);
    `      0this�stmt.executeUpdate("uNLGCK TABLES");

     `      // Test mului-table DELETE
        " ! this.stmt.executu5pdate("CREATE ABNE �eStE�plicitPartitIonS2 �KE ves|ExplicitPartitions");

!  0        this.psumt = t(is.conn.prepareStateeeo�(  !    *    "(     `"INSERT INT testEyplicitPartitho�s2`PaRTITIOJ 0�p18)99`, subp3, `q100-99999`) CELECT * FROM tes�ExplicitPartitions PARTITIOV (s}�p3, `p10-99`, dp100-99999`)"-�    �       a33ertTrue(thIs.pwtmt instance�f ClientPre�aredSthtument)9
      �     this.ps|mt = c.pbepareStctemeft(
           `        "ILQERT I^TO testExpl�citPartitions2 PARTITION (hp1p-99`, subp3, `p100-�9991`( SELECT * FROM testExplicitPartitions PAVTITiOJ (subp�h `p94-y9`, ap102-=9999`)");
  �     �   assert�ree(thys.pstmt instajcaof ServerPrdparedStateme~v);
         "  this.rtmt.exesuteUpdatg(
               !  0 "	NSERT iNTO$tectExplicitPcrtitions2 PCRTITION (`p12-99`, qu"p3, `p100-99999`)0SENGCT * F�OM`testExtlicitPartiTins PARTITIN (subp3, @p10-99`, �t300-99999`	");

            this*stMt.executeUpdate("ALTeR TABLE!vestExplycitPastiuions3 tRUNCAUE PARTITION!`p10-)`< `p0-9`, `p100-9999y`");

            this.pstmt = t�is.aonn.prepardStaTeien�(
      (       $     "IOSERT IGFORE0INTO testExplicitPartithg~s2 P@RVITI�N (subp3+ CLUCT * FROM`tes�ExpmibivPertitions PARTITION (subp3, `p10-99`, `p100-8yy99p)");
     $      as{ertTrue(thi�.pStmt instancenf �lIentrgparedStatemgnu);
  0         this.pstmp = c.pbepareSvatement(
                    "INS�RT HGNORE INTO testExpl�citPartitio�s2 PARTITION (swbp3)`SEECT * FROM testExpl�citPart)�ions0PARTITIMN (subp3, `p91-99`, `p100-99999`)");�            aSsewtTree(this.pstmt i~s�anceof QerverPrepAredStitemenu);
           p`is.s|mt.ehec�teWpDaue(
!   `               "INSEZT IFNORE INTO tastxplicitpartitions2 pA�TIT[OO (subp3)0SELECT * FROM te3tExplicitPabtitions PURTITIMN (subp3, `p10-9y`, `p100-99999`)");

            t`ic.stmT.executgUpdate(#TRUN�ATE T�BLE testExp�icitPartitions2");
      $     t`is.stet.e|EcuteUpdate(2INSERT INTO testExplicitPcrtitioos2 SELEC� *!FROM tesTExplicitPartyt!ons PASTITIOO hs�bp3,�`p1 -99p� `p100-9999y`)");

  (        �t`is.pqtmt  this.coln
�             (     .prepargStatement("KREATE TABLE�testExplicitPartitionS3 SELEC\ 
 F�O� 4esdExplicitPartitaons PARTITION (pNeg,s5bp3<`p100-999{9`)");
    `   `   asseruTrue(this.qstmt instaNceof ClkentPreparedStatement);
     0      thIsnpstmt = c>prepareStatement("CREAT TABLE testexplibhtPartitions3 SELECT *0DROM TestexqlIkitPartivions PARTITION ,pNeg,swbp3,`p100-999;9`)");
     �0     assertTRue(this.pstit inwtancef ClientPrepareDStatmment);
          ` thisfstmt.exea5teU�data"CREATE TABLE tesuExplic)vPartitiols3 SELECT$* FROM tesTUxplicitPavtht)ons0PARTITION ,pNeg,sukp3,`p10-99999`+");

  $         this.pstmt = this.conn*prepareS|auement(
        "           "DELETE tgrtExplicitPartitionw, testGxxjicitParu�tions2 FROI testExplycitPastitions PARTIDION (pNeg), testE8plycitXartitions3( TestE�plikitPartitions2 PARTITION (cubp3) SHERE testExplicitPartiti�ns.a = t�stExpl)citPartitionq3.a A^D testExplicitPartitions3.f = 'subp3g ANF testExpli�atPcrtitionr7.a$= testExpli�itTartitaons2.a");
0    �      aqSertTrue(this.pstmt inctangeof ClientPreparedRtatemej�);
         `  this.pstmt = a.prepareStatement(
                  " "DELETE te3tExplicitPartitions, testMxplicitartitions2 FROM testExplicitPa�titions PARTITION (pNeg), testExplicitPartitions3, testExplicitPartitions2 PARTITION (subp3) WHERE testExplicitPartitions.a = testExplicitPartitions3.a AND testExplicitPartitions3.b = 'subp3' AND testExplicitPartitions3.a = testExplicitPartitions2.a");
            assertTrue(this.pstmt instanceof ServerPreparedStatement);
            this.stmt.executeUpdate(
                    "DELETE testExplicitPartitions, testExplicitPartitions2 FROM testExplicitPartitions PARTITION (pNeg), testExplicitPartitions3, testExplicitPartitions2 PARTITION (subp3) WHERE testExplicitPartitions.a = testExplicitPartitions3.a AND testExplicitPartitions3.b = 'subp3' AND testExplicitPartitions3.a = testExplicitPartitions2.a");

            this.pstmt = this.conn.prepareStatement(
                    "DELETE FROM testExplicitPartitions2, testExplicitPartitions3 USING testExplicitPartitions2 PARTITION (`p0-9`), testExplicitPartitions3, testExplicitPartitions PARTITION (subp3) WHERE testExplicitPartitions.a = testExplicitPartitions3.a AND testExplicitPartitions3.b = 'subp3' AND testExplicitPartitions2.a = testExplicitPartitions.a");
            assertTrue(this.pstmt instanceof ClientPreparedStatement);
            this.pstmt = c.prepareStatement(
                    "DELETE FROM testExplicitPartitions2, testExplicitPartitions3 USING testExplicitPartitions2 PARTITION (`p0-9`), testExplicitPartitions3, testExplicitPartitions PARTITION (subp3) WHERE testExplicitPartitions.a = testExplicitPartitions3.a AND testExplicitPartitions3.b = 'subp3' AND testExplicitPartitions2.a = testExplicitPartitions.a");
            assertTrue(this.pstmt instanceof ServerPreparedStatement);
            this.stmt.executeUpdate(
                    "DELETE FROM testExplicitPartitions2, testExplicitPartitions3 USING testExplicitPartitions2 PARTITION (`p0-9`), testExplicitPartitions3, testExplicitPartitions PARTITION (subp3) WHERE testExplicitPartitions.a = testExplicitPartitions3.a AND testExplicitPartitions3.b = 'subp3' AND testExplicitPartitions2.a = testExplicitPartitions.a&);

!        !  this.sdmt.executeUpdatg("SET @@defauLt[s|orafe_engine = @old_default_storage_enginm");

`       } finall� s
            this.stmt.executeUpdate("TRKP \ABLG IN EXiSTS0destExpli�itPartitio.s$"testExplicitPartitions2, tes|ExplicitPartitio~s3");

 `          if (c != null) {
     0   `  $ $ c.close();
 (          m
            if (dqt�dis != zull9"{            $   File f =$new Fil%(datadir * File.separat/r + db~aee ) Fi�e.separator + "l/adte3tExplicitPar|itions.|xt"):
  �      "   "0 if (f.exists()) {
"                  $f.deluteOnExit();
      `  $      }
       "    }
        }
    }

    �j*
 $ ` *"WL#55�7 - IPt6-sarable INET_ATON and�INET_NTOA functionS
     "
   $ * IPv6 functiols added in05.vGA: INET6_ATNNip) and INET6_NTOA(ip).
     *
  `  * @throww Exception
     */
    `Test
    public vidateQtIPv6FencuioNs() throws Exception {
     �  assumeTr5e(versionMeetsOinimum(1l 6$ 11), "MySQL 5n6.11 includes a bug!fIx (Bug#60454) phat is rcqtirGd�to run tiis test sucCessFully.");

 `     `St2ing[][] dataRamples"= n%w Svryng[][] { y "127.0.0.1", "17r.0.0.1" }, { "190.168.1.1"| ":>ffff:190.168.1.1" }, { "10.1", "::ffff:10.1" },
        `       { "�52.16.260.4", "172.16.260>4" }, {!"::1"-�"::1" }, { 1 AA:1bb:10CC:10`d:10EE:q0FF:10aa:10BB", "10aa:10bb:12cc:10dd:10ee:11fF:10aa:!0b*"2},
                {`"00af:0000:0000:0000:10af>00�a:000f:0401", "00af:0000:0000:0000:10ad8�00a:00 b:0001" },
             "  { "48:4df3::0010:ad3:1180", "48:4df1::0010:ad3:510
 },
  "             { "2�00:abcd:1234*0000:efgh>!0�0:2000:300",  200:abcd:1234:0000:ufgh:1000:2040:30 0" },
      $      (  { 22104:abcd:123420000:1000:2002:3004", "2000:abcd:1r34:0000:1000:2000:300p" } };
        String[][]�dat!Exp�bTed = oew`String[][\ { { "127.0.0.1", "172.1.0.1" }, {("19".168.9.1�,0"::ffff:1y2.168.1.1" },0{ "10.0.0.1" nunl , {�null, null },
                { nuln, "::1#$}, { null, "10aa>90bb:10cc>10d`:10ee:10ff:14aa:1bb" }, { null,""af::50a`:a:b:1" }, { null, �48:6df1::10:ad3:100" },
     0      " 0{�Null, nu|l }, { oull, null } };

        createTabl�("testUL5787".`"(if YNT AUTO_INCREMENT PRIMARY KEY, ipv4 INt UNSIGNED, ipf6 VARBAfAVY(16))");

        Connection testCon� = this.conn;
 !!     hf (versaonMeets�inimum(5, 7, 10)( {J         `$ /+ MySQL05.7.10+ requires non STRICT_TRAN[_TABLES to usd thase funct�mns with invali� data.
    �       PropertieS Prgps"= nev ropurties();
   !        props.put(PropertyKey.h$bcComplia.tTvuncation�getKey�ame(), "fAlse"){
     0$  0  String sqlIode = getMysqlVariable(sql_mode");
     "      if (sqlMoDe.cont�ins("�TRICT_TRQLS_TABLES")) {
 (  �  0      ( splModd = pemoveSqlMode("STRICT_TRNS_TABLS", sql]ode9;
0    `        0 props.ptt PropertyKey.sessionVariables.getKeyName(), "sql_mode='" + sQlEode + "'");
            }J  0         testConn = getConnectionWithPr/ps(�rops);
 `   �  }
        tjis.0st�t = teqtConn.pr%pareStatEment("INSEVT INTO tesuWL5787 VALUS (NULL, INET_ATON(?), 	NET6_ATNN(?))");

 `     $for (tring[]`data :bdadaSamPles) j
          " |his�pstmt.3etString(1, data[0]);
            this.ps4mt.sEtString(2, datc[1]);*  $         this.pstmt*addBqtch ):
        }
        int g = 03        for (ind r : this.pstmt.uxec54eBatch�)) {
      `  �  c += r;
   (    m
 !    � assertEquals�dataSamples.length, #,$"Fayled y.sertmNg data sampLe{:w�o�g number�of inserts.");

      $ this.rs 5 this.stmt.execud�Query("Q�LECT id, INET_NTOA(ipv4), INET6_NTOA(ipv6) F�M testWL5787");
        int�k = 0;
      p�while (tjis.rs.next()) {
            I = this.r�.getInt(1);
�           assertEqu�ls$ataExpected[i - 1][0], this.rw*getStsing82), "Wroog IPv4 data in$row [& +!i + "].");
       ` $  assertEqual�(dataExpected[i - 1][1], this.�s.getStri.g(7+, "Wrong IQv6 dAtc in �ou [" + ) + b]."-;
        }

"    (  thks.pst}4.close()+
        testConn.Cl�se();
    }

    /**
     * W#5538 - �nnoDB Full-Text We`rc( C�pport
     *
     * CrEATE TEB�D {yntax chanfmd in 5.6GA
  �  *
    `* InnoDB"eng)ne accepts FULLTEXT indexo3.�     * CVEATU TaBLE ...$FUMLTEXT(...)!... ENGINE=InnoDB
     *
     *�@throws!Exeption
     */
  0 @Test
    pu&lic void testFULLTEXTS%archInnoDB() rhrows Exceptio. {
  $     arsumeTrue(versi.LectsMinimum(, 6), "IySQH 5.6+ is required to run 4his test.");

    $   cReaveTable("testFULL\EXTSearghInno@@",
       �        "(id INT QNSIGNEF AU�O_INCREMNT NOT NULL$PRIMARY KEY, " + "t�tle VARCHR(200), body �EXT, ULLTEXT (title(, body)) ENGINE=I~noDB");

0(   (  this/stmt.ex%ceueUpdate("INSERT INO testFULLTEXTSearch	nnoLB (title, bo�y) VALUES`('Mi_QL Tutosial',%DBES stands for DataBase ...'), "
                +`"�7LOs Tn Us' mySQL(well','After you uent p`ro�gl a$�..'),!('Optimizing MySQL'd'In this tutorial We wyll(sxnw ...')l "
                + "('1001 MycQL Trickc','1/ Never ru� mysyld a� roo|. 2. ...'), ('MySQL vs. YourSQL',7�N vie"following detajase0co�pasis/n ...'), "
    `           + "('iSQL S%c]Rity','When configur%d troPerly, MySL ...')");

       0Ctring[]!querySamtles = new StrIng[] { "SELECT * FRKM test�ULNTEHTSearchInnoD� WHDRE MCTCH`(titlE� bodyi AGAI^ST ('databcse' IN NATURAL LANGUAGE MODU)",
$               "SELECT * FROM testFULLTEZTSearchInnoDB WHERE(LATSH (Title, body) AGAINST ('database' IN NAT�RAL LANGUAGE MODE$WITH QUERY EXPANSION)*,
       ! �      "S�LECT * FVOM testFULLTEXTSearchInnoDB WLERE MATCH"(titl%, bod}) AGAINST ('<MySQL(>YourSQL'"YN BOOLEAN$ODD)",
  (     c  "   "SE�ET * ROI testFEl@TEX\SearchInnoDB WHURE MATCH (titl�, bod9) AGAI^ST ('+M{SQL -�ourS�L' IN JOOLDAN MODE)".
0               "REMECT MATCH((title, body) AGAHNsT (�database' IN NATURAL LAGEAE MODE) �ROM testFULLTUXTSearchInnoDB",
                "SULECT0MATCI (tytle, body) AGAINSU ('dsva`ase/ IN NATURAD LANGuCGE MODE WITH"YUERY EXPANS	OO)�FRO testVULLT�XTSearchInNoD@",
      0  "    ! "SELECT MITCH (tIplE, body) AOAINST ('<MySQL >YourSQL' I� BOO\EAN MO�E) ROM testFUNLTEXTSearchInnoD@",
        `       "SELECT LATCH (title, body) AGAINST ('+MxSQL -YouzSPN'�IN BONLEAN MGDE)0FROM testFULLTEXDSearchInnoDB" };

 $   $  for (String!query : querySamples) {
            vhi{.rs = this.Stmt.uxecuteQuery(query);
         $  aqsertTrue(tjis.2s>�ext(), "QuEry [" # yugry + "] should peturn sgme row�&");
            Uhis.rs.clse(={
 !      }
    }

    +**
     * WL#6555 - Online reaie iNlex
     *
     * ALTMR TACLE sYntax changed in 5.w1
     *
     * AL4er table cnhows to rename ijdexes. ALTER TBLE ... RENAME INFEX"x TO y
   ! *
   % * @throws Exception
  �  */
   !@Test
    public void testRenameIndex() throws xception {
        assum�True(v%rsIonMeetsIi.mmum(5, 7, 1),!"LySQM 5.7n1+ is(required to tun this test.");

  $     createTcble("testRenameIn�ex", "(cnl1 IOT, col2 INT, INDEX hcol1)) ENGINE=Inno@B");
     `  Tji{.stmt,execute("CREATE INDEX testIdx ON testRenimeIndex (com2) )?
        DatabasuMetaData dbmd = this.co�n.getMet�Data();

        thiqnss = dbmd.getIndexInfohThis.LbOa}e, nUll, "t%rtRenameIndex","fanse, true);
  (�    `ssurtTrue(this.rs.n�xt(i, "Mxpecved 0 (of 2) IndexeS.");
        assertEquals("col1", thys.rs.getString(6	, Wron� ind%x name for 4able 'tertRenameINdex�.b);
      ` ascertTrud)tliw.rs.next(i, "Ex�ected 2 hof 2) xn�exes
");
(       `ssertEqu`ms("testidx", th�s.rsng%tString(6), "Wrong index naee foz te�le 'testRenameIndex&.");!       asqertFalse(this.rw.naxt(), "No iore yndexe{ expected gor �able 'te3vRenameIndex'.")�

   !    tiis.stmt.execu|d8"ALTEZ0TaBLE tecdRename	neex RENAME IO�EX col1 TO co�1I~dwX");
   (    uhis.sdmt,execute("ALTER TABLE taptRenq�eIndex RENAME HNDEX testIdx TO testIndgx");

      ` phis.rs = dbmd.getIndeyInfo(this.dbame, nulL, &testRenameI~dexb, false, drue);
        assertTrud(this.rs.next )� "�8rected 1 (of ") i�lexes.*);
    $   assertEquals("col1Index",!th�s.rs�getString(6). "Wrong in�ex name fo� table 'testRenameI~dex'.");
        asrevtTrue(thys.rs�ngxt(), "Expected 2 (ov 2)�i�dexes.");
�     ! assertEquals("|mstIndex", this.rs.getStrin�(6), "Wrong m~dex!name!for tabld$'4estRenamdIndex'."-;
        a�s�rdalse(this.rs.next(), "No more indexes �xpecte� for tablu 'tdstre.ameInDex�/"(;
    }

    /**J(    * WL#6406 - Stacjgd diagnnstic areas
    �*
    `* "ST�CJED" in "GET0[CURRE�T | STACKE� DIAGNOSTICs" syntax was adfed il 4.7.0. Final behavior gas imrleianted il
     * VessiOf�5.7.2,"by WL#5928 - Most statements sh�uld clear the diagnostia(area.
     

   `"* @t`rows Exgextion
     */
    @Test
    public voiD teSt�etStackedDiagnostics8) throvs Excettion {
        a�sumeTrue(versionM�etsMinamum(5, 7, 2)� "MySQL =7.2+ is required to run thiS dest>"-;
J `  `   // tast ca|ling gE\ STACKD DIAGNOSTI�S outside an hcndlerJ(      (final Statement localliScopedStm� � this&sTmt;
     "  a3sertThrows(SQNException.class,`"GET STACKEL0DMAGNOSTICS when handle2 not act)ve", ,) -> {
 !         (loc�lliRcopedStmv.e|ecute("GET STACKED DIAGNOSTICS @num"= NuMBER&);
            retur.$null; (  (   })3
  0  0  // test c�lling CUT STACKEE DIaGNOSTICS Inside`an hanflar
   `    //((stored progedure is basae on d/cumentatioj Examp|�)
�  $    createTable("qestGeTStack%dDiagnmstmbsTbl"$ "(c VARBAR(8) NOT NULL)");
        creadeProceDure("teqdGmtStaqcedDka'nosticsSP",
         �      "() BUGIN DECLRE EXIT HANDLER FOR SLEXCEPTION BEOIN�" + "GET CURRENT DIAGNOSTICS �ONDITION 1 Herrno ="MYSQD_ERRNO, @m3g = mESSAGA_�EYT;("
             !          +`"SELEcT 'current DI befo2e insert if hAndler' AS op, @errno AS errno, @lsg AS mse; " /� 1st result
    !  "         "  8!  + "GET ST�cK�D DIAGnOSTIGS CON�ITION 1 @errno = MYSQL_ERRNO, @�sg = MESSAGE_TEXT;�"
       $       0        + "SELECT 'stac�ed DA beforu insert in (an`,es& AS op< Herrno AS�drbno, @msg AS$sg; " // 2nd result
                 (      +!"hOSERT IN�N testGet[tackedDiagnosuicsTbl ,c) VALUES,7gnivset){`"$+ "GE� CURRENT @IEGNOSTICS @num 5 NU��R; "
      (                 � "IF @num!= 0 THEN SELECT 'INSERT succeeded, currunt DA is %mpuy' AS op; "0// 3rd r%sult
      �0   !          ` + "ELSE WET SURRe�T DKAGNOWTICS C�NDIION 1�@errjo!= MYSQL_�RRNG, @msga= ME[SAGE_EXT;`"
    $            (      + "SeLEBT!'curre~� DA`after insert in handle�g S op, @e�rno`@S$errno, @-rg A[ msg; E�D IF; "
 (`    (        (       + "GET STACKED DIAGNOSTICS CONDITION 1 @errno = MYSQL_ERRNO, @msg = MESSAGE_TEXT; "
                        + "SELECT 'stacked DA after insert in handler' AS op, @errno AS errno, @msg AS msg; END; " // 4th result
                        + "INSERT INTO testGetStackedDiagnosticsTbl (c) VALUES ('testing');INSERT INTO testGetStackedDiagnosticsTbl (c) VALUES (NULL); END");

        CallableStatement cStmt = this.conn.prepareCall("CALL testGetStackedDiagnosticsSP()");
        assertTrue(cStmt.execute());

        // test 1st ResultSet
        this.rs = cStmt.getResultSet();
        assertTrue(this.rs.next());
        assertEquals("current DA before insert in handler", this.rs.getString(1));
        assertEquals(1048, this.rs.getInt(2));
        assertEquals("Column 'c' cannot be null", this.rs.getString(3));
        assertFalse(this.rs.next());
        this.rs.close();

        // test 2nd ResultSet
        assertTrue(cStmt.getMoreResults());
        this.rs = cStmt.getResultSet();
        assertTrue(this.rs.next());
        assertEquals("stacked DA before insert in handler", this.rs.getString(1));
        assertEquals(1048, this.rs.getInt(2));
        assertEquals("Column 'c' cannot be null", this.rs.getString(3));
        assertFalse(this.rs.next());
        this.rs.close();

        // test 3rd ResultSet
        assertTrue(cStmt.getMoreResults());
        this.rs = cStmt.getResultSet();
        assertTrue(this.rs.next());
        assertEquals("INSERT succeeded, current DA is empty", this.rs.getString(1));
        assertFalse(this.rs.next());
        this.rs.close();

        // test 4th ResultSet
        assertTrue(cStmt.getMoreResults());
        this.rs = cStmt.getResultSet();
        assertTrue(this.rs.next());
        assertEquals("stacked DA after insert in handler", this.rs.getString(1));
        assertEquals(1048, this.rs.getInt(2));
        assertEquals("Column 'c' cannot be null", this.rs.getString(3));
        assertFalse(this.rs.next());
        this.rs.close();

        // no more ResultSets
        assertFalse(cStmt.getMoreResults());
        cStmt.close();

        // test table contents
        this.rs = this.stmt.executeQuery("SELECT * FROM testGetStackedDiagnosticsTbl");
        assertTrue(this.rs.next());
        assertEquals("testing", this.rs.getString(1));
        assertTrue(this.rs.next());
        assertEquals("gnitset", this.rs.getString(1));
        assertFalse(this.rs.next());
        this.rs.close();
    }

    /**
     * WL#6868 - Support transportable tablespaces for single innodb partition.
     *
     * New syntax introduced in MySQL 5.7.4.
     * ALTER TABLE t DISCARD PARTITION {p[[,p1]..]|ALL} TABLESPACE;
     * ALTER TABLE t IMPORT PARTITION {p[[,p1]..]|ALL} TABLESPACE;
     *
     * @throws Exception
     */
    @Test
    public void testDiscardImportPartitions() throws Exception {
        assumeTrue(versionMeetsMinimum(5, 7, 4), "MySQL 5.7.4+ is required to run this test.");

        createTable("testDiscardImportPartitions",
                "(id INT) ENGINE = InnoDB PARTITION BY RANGE (id) (PARTITION p1 VALUES LESS THAN (0), PARTITION p2 VALUES LESS THAN MAXVALUE)");

        this.stmt.executeUpdate("INSERT INTO testDiscardImportPartitions VALUES (-3), (-2), (-1), (0), (1), (2), (3)");

        this.rs = this.stmt.executeQuery("CHECK TABLE testDiscardImportPartitions");
        assertTrue(this.rs.next());
        assertEquals("status", this.rs.getString(3));
        assertEquals("OK", this.rs.getString(4));
        this.rs.close();

        this.stmt.executeUpdate("ALTER TABLE testDiscardImportPartitions DISCARD PARTITION p1 TABLESPACE");

        this.rs = this.stmt.executeQuery("CHECK TABLE testDiscardImportPartitions");
        assertTrue(this.rs.next());
        assertEquals("error", this.rs.getString(3));
        assertEquals("Partition p1 returned error", this.rs.getString(4));
        this.rs.close();

        assertThrows(SQLException.class, "Tablespace is missing for table .*", new Callable<Void>() {

            @Override
            @SuppressWarnings("synthetic-access")
            public Void call() throws Exception {
                SyntaxRegressionTest.this.stmt.executeUpdate("ALTER TABLE testDiscardImportPartitions IMPORT PARTITION p1 TABLESPACE");
                return null;
            }

        });
    }

    /**
     * WL#7909 - Server side JSON functions
     *
     * Test support for data type JSON.
     *
     * New JSON functions added in MySQL 5.7.8:
     * - JSON_APPEND(), Append data to JSON document (only in 5.7.8)
     * - JSON_ARRAY_APPEND(), Append data to JSON document (added in 5.7.9+)
     * - JSON_ARRAY_INSERT(), Insert into JSON array
     * - JSON_ARRAY(), Create JSON array
     * - JSON_CONTAINS_PATH(), Whether JSON document contains any data at path
     * - JSON_CONTAINS(), Whether JSON document contains specific object at path
     * - JSON_DEPTH(), Maximum depth of JSON document
     * - JSON_EXTRACT(), Return data from JSON document
     * - JSON_INSERT(), Insert data into JSON document
     * - JSON_KEYS(), Array of keys from JSON document
     * - JSON_LENGTH(), Number of elements in JSON document
     * - JSON_MERGE(), Merge JSON documents (up to 8.0.2)
     * - JSON_MERGE_PRESERVE(), Merge JSON documents (since to 8.0.3)
     * - JSON_OBJECT(), Create JSON object
     * - JSON_QUOTE(), Quote JSON document
     * - JSON_REMOVE(), Remove data from JSON document
     * - JSON_REPLACE(), Replace values in JSON document
     * - JSON_SEARCH(), Path to value within JSON document
     * - JSON_SET(), Insert data into JSON document
     * - JSON_TYPE(), Type of JSON value
     * - JSON_UNQUOTE(), Unquote JSON value
     * - JSON_VALID(), Whether JSON value is valid
     *
     * @throws Exception
     */
    @Test
    public void testJsonType() throws Exception {
        assumeTrue(versionMeetsMinimum(5, 7, 8), "MySQL 5.7.8+ is required to run this test.");

        createTable("testJsonType", "(id INT PRIMARY KEY, jsonDoc JSON)");
        assertEquals(1, this.stmt.executeUpdate("INSERT INTO testJsonType VALUES (1, '{\"key1\": \"value1\"}')"));

        // Plain statement.
        this.rs = this.stmt.executeQuery("SELECT * FROM testJsonType");
        assertEquals("JSON", this.rs.getMetaData().getColumnTypeName(2));
        assertTrue(this.rs.next());
        assertEquals("{\"key1\": \"value1\"}", this.rs.getString(2));
        assertEquals("{\"key1\": \"value1\"}", this.rs.getObject(2));
        assertFalse(this.rs.next());

        // Updatable ResultSet.
        Statement testStmt = this.conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
        this.rs = testStmt.executeQuery("SELECT * FROM testJsonType");
        assertTrue(this.rs.next());
        this.rs.updateString(2, "{\"key1\": \"value1\", \"key2\": \"value2\"}");
        this.rs.updateRow();

        this.rs = testStmt.executeQuery("SELECT * FROM testJsonType");
        assertEquals("JSON", this.rs.getMetaData().getColumnTypeName(2));
        assertTrue(this.rs.next());
        assertEquals("{\"key1\": \"value1\", \"key2\": \"value2\"}", this.rs.getString(2));
        assertEquals("{\"key1\": \"value1\", \"key2\": \"value2\"}", this.rs.getObject(2));
        assertFalse(this.rs.next());

        // PreparedStatement.
        this.pstmt = this.conn.prepareStatement("SELECT * FROM testJsonType");
        this.rs = this.pstmt.executeQuery();
        assertEquals("JSON", this.rs.getMetaData().getColumnTypeName(2));
        assertTrue(this.rs.next());
        assertEquals("{\"key1\": \"value1\", \"key2\": \"value2\"}", this.rs.getString(2));
        assertEquals("{\"key1\": \"value1\", \"key2\": \"value2\"}", this.rs.getObject(2));
        assertFalse(this.rs.next());

        // ServerPreparedStatement.
        Connection testConn = getConnectionWithProps("useServerPrepStmts=true");
        this.pstmt = testConn.prepareStatement("SELECT * FROM testJsonType");
        this.rs = this.pstmt.executeQuery();
        assertEquals("JSON", this.rs.getMetaData().getColumnTypeName(2));
        assertTrue(this.rs.next());
        assertEquals("{\"key1\": \"value1\", \"key2\": \"value2\"}", this.rs.getString(2));
        assertEquals("{\"key1\": \"value1\", \"key2\": \"value2\"}", this.rs.getObject(2));
        assertFalse(this.rs.next());
        testConn.close();

        // CallableStatement.
        createProcedure("testJsonTypeProc", "(OUT jsonDoc JSON) SELECT t.jsonDoc INTO jsonDoc FROM testJsonType t");
        CallableStatement testCstmt = this.conn.prepareCall("{CALL testJsonTypeProc(?)}");
        testCstmt.registerOutParameter(1, Types.CHAR);
        testCstmt.execute();
        assertEquals("{\"key1\": \"value1\", \"key2\": \"value2\"}", testCstmt.getString(1));
        assertEquals("{\"key1\": \"value1\", \"key2\": \"value2\"}", testCstmt.getObject(1));

        // JSON functions.
        testJsonTypeCheckFunction(versionMeetsMinimum(5, 7, 9) ? "SELECT JSON_ARRAY_APPEND('[1]', '$', 2)" : "SELECT JSON_APPEND('[1]', '$', 2)", "[1, 2]");
        testJsonTypeCheckFunction("SELECT JSON_ARRAY_INSERT('[2]', '$[0]', 1)", "[1, 2]");
        testJsonTypeCheckFunction("SELECT JSON_ARRAY(1, 2)", "[1, 2]");
        testJsonTypeCheckFunction("SELECT JSON_CONTAINS_PATH('{\"a\": 1}', 'one', '$.a')", "1");
        testJsonTypeCheckFunction("SELECT JSON_CONTAINS('{\"a\": 1}', '1', '$.a')", "1");
        testJsonTypeCheckFunction("SELECT JSON_DEPTH('{\"a\": 1}')", "2");
        testJsonTypeCheckFunction("SELECT JSON_EXTRACT('[1, 2]', '$[0]')", "1");
        testJsonTypeCheckFunction("SELECT JSON_INSERT('[1]', '$[1]', 2)", "[1, 2]");
        testJsonTypeCheckFunction("SELECT JSON_KEYS('{\"a\": 1}')", "[\"a\"]");
        testJsonTypeCheckFunction("SELECT JSON_LENGTH('{\"a\": 1}')", "1");
        testJsonTypeCheckFunction(versionMeetsMinimum(8, 0, 3) ? "SELECT JSON_MERGE_PRESERVE('[1]', '[2]')" : "SELECT JSON_MERGE('[1]', '[2]')", "[1, 2]");
        testJsonTypeCheckFunction("SELECT JSON_OBJECT('a', 1)", "{\"a\": 1}");
        testJsonTypeCheckFunction("SELECT JSON_QUOTE('[1]')", "\"[1]\"");
        testJsonTypeCheckFunction("SELECT JSON_REMOVE('[1, 2]', '$[1]')", "[1]");
        testJsonTypeCheckFunction("SELECT JSON_REPLACE('[0]', '$[0]', 1)", "[1]");
        testJsonTypeCheckFunction("SELECT JSON_SEARCH('{\"a\": \"1\"}', 'one', '1')", "\"$.a\"");
        testJsonTypeCheckFunction("SELECT JSON_SET('[1, 1]', '$[1]', 2)", "[1, 2]");
        testJsonTypeCheckFunction("SELECT JSON_TYPE('[]')", "ARRAY");
        testJsonTypeCheckFunction("SELECT JSON_UNQUOTE('\"[1]\"')", "[1]");
        testJsonTypeCheckFunction("SELECT JSON_VALID('{\"a\": 1}')", "1");
    }

    @Test
    private void testJsonTypeCheckFunction(String sql, String expectedResult) throws Exception {
        this.rs = this.stmt.executeQuery(sql);
        assertTrue(this.rs.next());
        assertEquals(expectedResult, this.rs.getString(1));
    }

    /**
     * WL#8016 - Parser for optimizer hints.
     *
     * Test syntax for optimizer hints.
     *
     * New optimizer hints feature added in MySQL 5.7.7. Hints are permitted in these contexts:
     * At the beginning of DML statements
     * - SELECT /*+ ... *&#47 ...
     * - INSERT /*+ ... *&#47 ...
     * - REPLACE /*+ ... *&#47 ...
     * - UPDATE /*+ ... *&#47 ...
     * - DELETE /*+ ... *&#47 ...
     * At the beginning of query blocks:
     * - (SELECT /*+ ... *&#47 ... )
     * - (SELECT ... ) UNION (SELECT /*+ ... *&#47 ... )
     * - (SELECT /*+ ... *&#47 ... ) UNION (SELECT /*+ ... *&#47 ... )
     * - UPDATE ... WHERE x IN (SELECT /*+ ... *&#47 ...)
     * - INSERT ... SELECT /*+ ... *&#47 ...
     * In hintable statements prefaced by EXPLAIN. For example:
     * - EXPLAIN SELECT /*+ ... *&#47 ...
     * - EXPLAIN UPDATE ... WHERE x IN (SELECT /*+ ... *&#47 ...)
     *
     * @throws Exception
     */
    @Test
    public void testHints() throws Exception {
        assumeTrue(versionMeetsMinimum(5, 7, 7), "MySQL 5.7.7+ is required to run this test.");

        /*
         * Test hints syntax variations.
         */
        // Valid hints.
        testHintsSyntax("SELECT /*+ max_execution_time(100) */ SLEEP(5)", true, false);
        testHintsSyntax("SELECT/*+ max_execution_time(100) */SLEEP(5)", true, false);
        testHintsSyntax("SELECT /*+ max_execution_time(100) */ SLEEP(5) /*+ wrong location, just comments */", true, false);
        testHintsSyntax("SELECT /*+ max_execution_time(100) *//* comment */ SLEEP(5)", true, false);

        // Invalid hints.
        testHintsSyntax("SELECT /*+ max_execution_time *//*+ (100) */ SLEEP(0.5)", false, true);
        testHintsSyntax("SELECT /*+! max_execution_time (100) */ SLEEP(0.5)", false, true);

        // Valid and invalid hints.
        testHintsSyntax("SELECT /*+ max_execution_time (100) bad_hint */ SLEEP(5)", true, true);

        // No hints.
        testHintsSyntax("/*+ max_execution_time(100) */SELECT SLEEP(0.5)", false, false);
        testHintsSyntax("SELECT SLEEP(0.5) /*+ max_execution_time(100) */", false, false);
        testHintsSyntax("SELECT /* + max_execution_time(100) */ SLEEP(0.5)", false, false);
        testHintsSyntax("SELECT /* comment *//*+ max_execution_time(100) */ SLEEP(0.5)", false, false);
        testHintsSyntax("SELECT /*!+1-1, */ 1", false, false);

        /*
         * Test hints in different query types using Statements.
         */
        createTable("testHints", "(id INT PRIMARY KEY, txt CHAR(2))");

        // Hints in single query.
        assertEquals(1, this.stmt.executeUpdate("INSERT /*+ mrr(testHints) */ INTO testHints VALUES (1, 'a')"));
        assertNull(this.stmt.getWarnings());
        assertEquals(2, this.stmt.executeUpdate("REPLACE /*+ mrr(testHints) */ INTO testHints VALUES (1, 'A')"));
        assertNull(this.stmt.getWarnings());
        assertEquals(1, this.stmt.executeUpdate("UPDATE /*+ mrr(testHints) */ testHints SET txt = 'Aa'"));
        assertNull(this.stmt.getWarnings());
        this.rs = this.stmt.executeQuery("SELECT /*+ max_execution_time(100) */ * FROM testHints");
        assertNull(this.stmt.getWarnings());
        assertTrue(this.rs.next());
        assertEquals(1, this.rs.getInt(1));
        assertEquals("Aa", this.rs.getString(2));
        assertFalse(this.rs.next());
        assertEquals(1, this.stmt.executeUpdate("DELETE /*+ mrr(testHints) */ FROM testHints"));
        assertNull(this.stmt.getWarnings());

        // Hints in sub-query block.
        assertEquals(1, this.stmt.executeUpdate("INSERT INTO testHints (SELECT /*+ qb_name(dummy) */ 2, 'b')"));
        assertNull(this.stmt.getWarnings());
        assertEquals(2, this.stmt.executeUpdate("REPLACE INTO testHints (SELECT /*+ qb_name(dummy) */ 2, 'B')"));
        assertNull(this.stmt.getWarnings());
        assertEquals(1, this.stmt.executeUpdate("UPDATE testHints SET txt = 'Bb' WHERE id IN (SELECT /*+ qb_name(dummy) */ 2)"));
        assertNull(this.stmt.getWarnings());
        this.rs = this.stmt.executeQuery("SELECT /*+ max_execution_time(100) */ 1, 'Aa' UNION SELECT /*+ qb_name(dummy) */ * FROM testHints");
        assertNull(this.stmt.getWarnings());
        assertTrue(this.rs.next());
        assertEquals(1, this.rs.getInt(1));
        assertEquals("Aa", this.rs.getString(2));
        assertTrue(this.rs.next());
        assertEquals(2, this.rs.getInt(1));
        assertEquals("Bb", this.rs.getString(2));
        assertFalse(this.rs.next());
        assertEquals(1, this.stmt.executeUpdate("DELETE FROM testHints WHERE id IN (SELECT /*+ qb_name(dummy) */ 2)"));
        assertNull(this.stmt.getWarnings());

        /*
         * Test hints in different query types using PreparedStatements.
         */
        for (String connProps : new String[] { "useServerPrepStmts=false", "useServerPrepStmts=true" }) {
            Connection testConn = null;
            testConn = getConnectionWithProps(connProps);

            // Hints in single query.
            this.pstmt = testConn.prepareStatement("INSERT /*+ mrr(testHints) */ INTO testHints VALUES (?, ?)");
            this.pstmt.setInt(1, 1);
            this.pstmt.setString(2, "a");
            assertEquals(1, this.pstmt.executeUpdate());
            assertNull(this.pstmt.getWarnings());
            this.pstmt = testConn.prepareStatement("REPLACE /*+ mrr(testHints) */ INTO testHints VALUES (?, ?)");
    !      4his.pstmt.setHjt(1, 1);
$�          thhs.pstmt.setString(2, "A"i;
$         (!assurtEqwals(:, this.pstmt.exesute�pdate());
$   `       assertNull(this.pstmt.wetWaRnings());
     !      �hi2.pstmt = vestCnnn.prdpareSt!t}ment("UPDAPE /*+ mrrht�stHin�s) */`testHints SET0txt = ?");
$   "       thicPstmt,setString(1, "Aa");
          ( ass�tEyuals(1, tjis>pstmt.executeUpdate())�
         `  ass�rtNull(thiS.pstmt.getWarnings());
     !      thiS.`stm4 = testC�nl�prep�reStatement( SELECT /*+ max_exekut�on_time)100)"*/ � FRO� testHints WHERE id = ?");
          $ thiq.p{tmt.setIot(1, 1);
         (  vhms.zs =(this.pstmt.e|ebu|eQuery();
         $  asse6tNull(thIs&Pstmt.getW`rnijgs()!;           "`ssartTruexthis.rs.next())�
      !     ascertEquals1, this.rs.ge�Inv(1));
     �      assertEquals("Aa", this.rs.getSdbing(2	);
        $   asserdFalse)this.�s.n%xt(i);
            this.pstmt ? testConn.prepareStateme~t(bDE�E�E /*+ mrr�TestIints) */ FROM tEstHints WHEQG id =`?");
            thms.pspmt.wetInt(1, 1);
0  $     ` "assertq�alq(1l this.pstmt.exesuteUpdate ));
       !    cssertNull(this.pstmt.getGarnings());*
 ! "   !    /+ Hints In wub-query#bhock.
       $    this.pstmt = testCoNn.prepazeStatement("ANSERT INTO testHints (SELaCT /*+ qb_nAie*dummy�(*/ ?, ?)");
    0       this.pspmt.set�nt(1, 2)3
            phis.pstmt.setStryng)", "b*);
            asreztEquals(1,0this�pstet.exec5teUpdate*();
            a7certNull(this.pstmt.getWarnings8)); "    `     tjms.Pstet`= testConn.`r�pareStateent "REPLACe"INTO tesTH�n|s (CELECT /*+ qb�name(dum�y) */ ? ?)");
`         ! thir.p�tet.SetIn4*1, 2�;
  � (    $  this.pstmt.setStrijg,2, bB"-;
            a3ser4Equals(2, this.pstmt.execu4�Up$ate());�     $    $ !ssertNu|l(this.ps4mt.getWarniNgw))?
          � |his.psteu = testCnn.prep`r�State%ent(2UPDATE testHints SET txt = &Bb� GHERG id IN((SEDECT /*+ qb_na}e(lummy) */ ?) 	;
           �t�is.pst-d.setI�t(1, 6);
            assertEquals(1, thys.pstmt.executeUpdape());
      0     assertNull(this.pstmt.getW`vnings());
    0   (   this.pstmt = uEstConn.prepabeStatemenv("SELECT�/*+ MaX_executionOtimah00) :/ ?, ? UNION SELECT �*+"qb_nAme(dummy) */ * FROM test@int{");
            thiw.pcumt.sEtInt(1, 1);
(       0   this.pstmt.setSuring(2, "Aa");
    ($      4hi3*rk = this.pstmt.exebuteQuery();
  "   "     arsertNull(this.pstlt.getWarni�gs());
  $         assertTrug(thIs.rs.nEzt());J!    !`     assertEqualr(1, this.rs.getInu(1));
            assertEqualr(*Aab. thiS.rs�etStri~e(2));� �      $   asse24True(thi�rs.nmxt(�);
       !    assertEquals(2( thks.Rs.gEtInt(1));
       !0   asser4Eq5als("Fb",�this.rs.�atString(2))?
            assertFalse(this.2s.next());
  (        this.pstmt = tmstCoon.prepareStatement("�ELeTM(FROM TestHints W�ERE�Id IN (SELeCT /*+ qb_name(dummy) */ ?)");
    !       thi{.pstmt.setInT(1, 2);
    0       ass��tequals(3, this.pwtet.uxecuteUpdqTe());
            assert.ull(this.pstmt.g%tWarnings(�);

$ "      "  testConn.�lo3e(�;
        =
    
    private void TestHinusSynucYhString query, boklean processesHint. Boo,ean garningExpected) Throws Ex#eption { ! (   $this.stmtnkle`RWarnings(i;
       this/zs = this.stmt.executeQuEry(query);�       $if (warnIngExpectud) {
        0   assevtNodNull(�his.s4mt.ggtWarnyngs());
            assertTsue(this>stmt.getWarnings().gEtMessage((.stertsWith("Optimizer hint syntax error"));
     $  } else {
  "�        assertNull(thisstmt.getWarning�())+
  (     }!       arsestT�ue(this.rs.nexT());
        IssertEquals(prcessesHint 7 1 : 0, this.rs.g'tInt(�));
        assert`l3e(phis.rs.next());
    }

0  (/** 0  (* WL#4205 - InnoDB:$Kmplement cREATE TcBLESPACE for general use:
   0 

     * Tests support for oew"CRE@TE TABLeSPUGE syntax �ha4 extends thIc feature to InfoDB.     *
     * �REATE TABLESPACE tablespace_name ADF DATAFILE 'flle_name' [BILE_BLOCK_SIZE 9"valee]�[ENGINE Y=] engineOn!meU
     *
     * @throws ExcepTion
     *-
  0 @Test
    publi� voI` testCreaTeTabhestace()(throws Ex�eption${
 !    $ assUmuTrue(vez{ionMeetsMinmmum(5,�7, 6), &MySQ\ 5/7�6+ is required to ru~ this test.");

      " try {
  0         txis.{umt.e|ecute("CRE�UE TCBLESPACE testTr1`ADD DaTAFILE 'ue{tTs1.ibd'");
       `   (p`is*stm�.exec5te("CRAATE T�BLESPACEat�suTs2 AD� EATAFILE('testPs2.ibd'");

      (     testCreateT`blesraCeChec{\ablespaces(r);
  �`        cReateDable("testTs1Tbm1", &(id INT) TAbLESPACE testTs1");
 ` `  `    "createT`ble("testTs1Tbl2", "(id`INT) TABLESACE$testTs1");
            cpeateTa`le,"t%stts2Tbl1", "(id �NT	 TABLUSpACE testUs2");

         �  testCrea�eTafdespabeCieckTablas("TestTs1"( 2);
   "        testCreatmTableqpaceCheckTiblus("�estTs�", 1);
J      !  ( "this.stot.ehe�ute("ALUER TABLE testTc3Tb,2 TABLESRqCE testTs2");
         $  uestCreat�T`blespabeChecjTables("testTs1",�1);
   $        testsreateTablespqceCheckT!bles("te�tTs2", 2	;
J   �     " �dropTeb,m("tests1Tcl1"+;
     `      droxTable("4estTs1Tbl2");	        `   dropTi`le("testTs2Tbl1")3

  `    #" " testCreateTablespaceCheckTar�ms("TestTs!", 0);            |estCre�te�ablespaceCheckTables("tes4Ts2", 0);

    (   } finally o
   �   "  ( //(Lake sure the t�bles are"dropped before the �ablesp�ces.
       !    dropTable("testTs1V`l1");
 @  `     � dropT!c|d("testTs1Tbl2");
        0   dropTable("testTs2Tbl1");

    �       this.stmtndyecuTe("DROP VABLESPACE testTs1"+;
            th)s.stmt.�xecutu("DRO@ TABLES@ACE testTs2"-;

         0  testCreatdTables`aceCjeckTablesp�ces(0);
     0  ]
    }

    @Test  ! pvivate void destCseateTablesp!ceCheckTab,espaKe3(int expect%dTssound) thzo�s EPcE0tion {
        if (vejsionMeet�Minym}m(8, �, 2)) {
   �        this.rs = t�is.stmt.exekuteQuery("SELeCT COUN(*) FRO inbor}a4ion_schem!.innodb_tibl%spice3 WHeRE .ame LIkE 'td{tTs_'");
      0 }"else {
     !      this.rs = thisnstm|.exebuteQueby	"SELECT$CKU.T,*) FROM informatioo^schema.inn/dr_syS�tablespaces WHERE name LIKE �testTs^'"9?
`     " m
    �   asseruTrue(thks.rsnexp());
        asseruEquals(expecue$TsCount, this.rs.geV	nt(1));
!  (}

   �@Test
 "  p2	vAte�vo9d testCreateTablespa�oCheccTables Wv�inw`�ablespcce, int expectedTb�Count) throwc Uxseption ;
        if (versiMnMeetsMinimum�<l 0,!3)) {
"      "    thi�nrs = tjis.�tmt.executeQuary("SELACT COQNT8*) @RKM informAtion_schEma.innodb_tables a, ingormation_schema.i�nodb_tablesPac%S b "
             0     `+ "wERE c.space =�b,space AN� b.name = '" + tablespace!+""'");
   �    } else {�     $      this.rs�= thas.stmt.�xucetdQueryh"SELECT!CO]NT(*) FRM informauion_schema.innodb_sys_tables !, information_schema.innodb_sys_tcbleqpaces b "
      $  (       `0 * "WHERG i.space = b.space AND b.jame$= #" +!tabldspace + "'")�
  $!   �|
        aswertTruehthis.rs.next());
        assertEqua�s(ezpekte$TblCoumt, thic.rs.getInt(1))9
    } 
   �/**
     * WL#2746 - InnoDB: make�fill factor sittable.
     *     * Testr0sup`or� for new synpay bor �mtting indiceS mERGE_THRESHOLD �n ARDATE DABLE.
  0  *
    0* indexoption:
     *(CoMMGNT 'MERGE_HRESHO�@=n'
     *
! %  * @th�ows Exception
(�   *'
    @Tast
8  "public void destSetMergeThreshnld() throws Exception {
  00 "  as{umeTrue(vebsiofMeetsMinimum(5, �, 6=> "mySQL�5.?.4+ ms req�irel to run this test.")

     `$ Map<String, Ynteger> ieyMmrgehresholds = new Hash-ap<>(i;
``      keyMergeThresholds.put("k2"( 45);
        keyMmrgeThrEsholdw.put("k3", <1);
  �     keyMergeT(reshold{.�ut"k3#", 35);
     `  keyMergeThresholds.put("k24", 30);
  �     int tableDerceThrgshold(� 25
 `"   !!/- Create table with "oth table`and pEr index meree thveshmlds.
        crmatdTable("testSet\Erg�Threshold#,
              !$"(c1 INT< c2 INT, c3 INT, c4 INT, KEY k1 (�1).`KEY �2  c2) COIMGNU 'MERGE_THRESHLD=" +0keyMergeTlreshodds.cet("k2")
   !           "        + "', OEY k3 s3) cKMOE�T 'MER�E_THRECHOXD=R + keyMergeT�re3holds.g%t("k#") + "', KEY k23 (c2$ c3) COMMENT &MERGA_THRESHOLD="
             `        ` + keyMerguThr%sholds.gat("k23") +`"', KEY i24 (c2� c4+ COMMDNT 'MEROE_THREsH_LD=" + key�erggPhresholds.gep("k2t")
     0   `0    !        + "�i COMMENT 'MERGE�\HRESHOLD=" + tableMergeThreshohd + "'");
       (testSetMerg�ThreshmldIndicek(tAbleMergeThrdshohd��keyMergeThresholds);
  !"    -/ Ch!ngg(table's mergE }hre�hgld.
       "tqfldMepgeThresjol$++;
        thi3.stmd/ex%bute("ALTER VABLE tes|SetMer�eThreshgld COMMENT 'MERGE_THBESHOLD=" + tabl�MerweThreshold + "'");
   )`   tewtSe�MUrgu�hresholdAnDkces(tableMerfeThrasxol`, keyMesgeThresholds);

   !   !// Change index' merge threshole.
        +eyMergeT�res�oldspuT("k3", 41){
        this.stmtnexecute("ALTMR TABNE testSetMergexreshold dROP KEY k3")9
 � `    uhis.qtmt.execute("ALTMR TAJLE`vestSetMerggThres(old CDD KEY k3 (c3) �OMMEND 'LERGE_T�ZESHOLD=" + KeyM%2geThresjklds.Fet("k3") + "'");
 �  �   testSetMergeThresholdIndices(4aBleMergeTh�eshold, jeyMergeThresh�lds(:

        // Add ouw index with a non-defauLt merge thrdS(mld value.
�       keyMergeTh�eshol�s.put("oq23", 15);
  "     phis.stMt.epecute("CREETA I�D�X k123"ON testSetMergeThreshold (c1, #2, c3� CKMMENT 'MERGE_T@RESHOLD=" + kdyMergEThreshol4s.g�t("k103") +!"'")9
        vestSetMerggThresholdIndices(tabld�ergeThreshold, keyMerc%thresholds);
 0  }

    @Test
    �riva|g ~oid testSeuMergeTh�esholdInlices8int defaultMepgeT@reshold, Map<Svring, Integer> keyM%rgEThresholds)�throws Exbe0t�o� {
        booleen!dbMapsToSc(ema = (HdbgCon~ection) thi�>conn).getPvopertySet().<DatabaseT%rm>getEn�m@�operty(PropertyKey.databaseTurm)
            "0 $.getValue() == DatibacaTerm.SCHEMA?
  $     If (versioneetsMinimum(8, 0, )) {J         $  this.rw = thiq.rtmt.executeSuery("SELEBT name, merge_thresiold FROM infor�itioN_schema.innod`_indexgs WHERD tabla_id0= "`      �            + "(SELEcT table_id$FROM iofrmation_schema.innodb_tab,e3 WHERE �ame = ' 
        �  %$    $  + (dbMapstoSchema ? vhks.con~.getSahema� : tli{.cgnn.eetCatalog()) +("/testSe|MergeThbeshmdd')")?
( !   ( } else {
            thiq.rs = 4h{s.stmp.executeQuery("WELECT name mgrgE_thrasho�d FROM informat)on_schema&innodbsys_indexeq WHERA table_id = "      `             + #(CELECT t`bdeid FROM informatioo_schemayn.odb_syq_t�bles WHERE name = '"
     ` ` 0          + (FbMapsToSchema ;!this.conn.getSchema() :1this.conn.getGqtalog()) + ".testSetMe2geTlre{hold')");
        }

 0      while (this.rs.next)+ s
0$      `   int �xpected < keyMergehreshold�/containsKey(this
rs.getString(1)) ? k�yMergeThresholfs.get(this*rs.geuString(1)) : deFaq,tMergeThreshold;
            assertE�uals(%�pecte�, thi{.rsngetInt(9, "MERGE_THRESH�LD �or i~dey " + this.rs.getStving(1));        }
        a{sert\rue(\his.rs/last()){
   `(   assert�ue(tjis.rs.getRow(9 >= ieyMergeThresholds.size());
   }

    /.*
  0 !* WL#3696 - InloDB: Transpareft pawe goipresrion.
     *
     ( Tests BOMPRESSION cl�uqe in CRATE|AL\DR0TABLE synta~.
 `  !*
 0   * dablg_option: (...) \ COMPR�SSION _=] {'ZLIB'|'L4%|'NONE'}
     *
     * @throws E|cepdion
     :/    @Test
!  `public woid teStTa",gComprassion() throws Excmpvion {
        assumeFalse(isServerRunfingOnWindows(),!2This test depends o� file sys|em charactebistics hen run~ing on Wkndowc ({ee Bug#81145).");

        assueeTrqe(v�rsionMeatsMInimum(5, 7, 8), "M9SQL 5.7.8+ i3 bequired to ben this test.")3

   "  0 // Create table`with #xlkb' cmmpression.
 $  `   creapeTable("testTableCk-`resraoN",0"(g VARCHAZ(15!00)) CMPRESSION='ZLIB'");

        thaw.rs = thas.stmt.ExekuteQugry( show create tabla testTa2leCgmpres{ikn"+;
   `!   essertTrue(this&rs.nexd());        assdrtTrue8StringU�mhs.IndexOgIgjoreCaSe(this.rs.cetString(2), bAOMPRESSION='ZLHB7") <= 0)+

        // Alter Tabl� comPreqsion to 'lZ4'. �      this.rtmt.execu|�("CLTER AbL� tespTableCoepp�ssion COMPRESSIOn='LZ4'");J
        this&rs$= this.stmt.executeQue�x("3how create p`ble tesuTable�ompression");
        usserTTrue(this.rs.next())+
        assertTrue(StrInGUtils.indexOfH'noreCase(this.rs.getString(2%,("C�M�RESSION='LZ4'") >= 0);

        //$Alter table compr%ssion to 'none'.
      $ this.qtmt.execute(bALTER TABLm testTableCompression CNMpRESSI�N='NONg'");

   !   �this.rs = thic.stmt.exmcuteQuery("sh/w create table testTableComprdrsion")�
      ! assertTrue*this.rs.next());
 �   "  assertTrue(String�tils.indexOfIgn/reCase(phis.rs.oevString(2), "COMPRES[IoN='NONE'"i < 0-;    }
�    /**
     * WL#1326 - GIS8 Precise spatkal opebation�
     * WL#8055 - Consistent n�ming cch%ma for0GIS fun#tions - Deprqcathon
"`   *�UL#8p34 - More�}ser fraendly GIR &uncti/ns*    0: _L#7541 - GIS M@R spitial operations efhancement
( `  * wH#8153 - Remove depPecated GIS functions
     *$_L#80550- Consistent namiog sCheme for GKS fun�pigns - De`recation
  0 $* WL#9435 -(Axis oreer in WKB!passing�fun�tions
 `   * (...)
     *
     *`Test syntax for cll FIS functions.
     *
     *!@uhrows Exc%ptann
`   */
    @Test
    public void testGisFunctions() throws Exception {
       "fiNan String wktPoint = "'POI^T(0$0)'";
        final S|ring0wktLineString =$"/LINESTRING(0 0, 8 0, 4 6, 0 0)'";
        finAn Sprino sktPolygon } "'POLYGON8(0 1� 8 0( 4 6, 0 0i, (4 1, 6 0,!5 3, 4 1))'";J  `�  $ final Sdri�g$wkt]ultiPoint = "'MULTIpOINT(0 0,!8 0. 4 6)'2;
        fanal String wotMultiLineString =  'MULTILINESTRMNG((0 0, 8"0, 4!6,"0 0), (4 1,"6 0 5 3, 4(1))'";
(       finah`String gotMultyPolygon = "'MULTIPOLYGON(((0 0, 8 0, 4 6,!0`0). (4 1( 6 0,05 3, d 1))( ((0 3, 8 3,04 9, 0 3)))'";
   !    final Rtring �ktGe/me�ryCol�ecdkon = "'GGOMETVYCOLLECTIG�(POIJT(8 0	,(LINESTRING( 0, 8 0, 4 6, 0 0�, POLYGOL(�0 3, 8 1, 4 1, 0 3)))'";

$       fi.al StRing geoPoint1"= "Pohnt(0- 0)";
        final String!geoPoi~t2 � "Qo�nt(8, 0)";
�� "    final String geomint# =(*PoInt,4, 6)";
 $ �0 ` fynal String geoPoin44 = "Poant(4, 1)";        final`Stri~g geoPoi�t5 < "Point(6- 09";*        final Sdrkng(geoPoint4 = "Point(5, 3i";
     !" final Strang geoPoint7 = "Point)2, 3)";
 " !    final String ge�Point8 = "Point(8, 3)";
      " final String geoPoint9�� "Pkint(4, 9)";
0       final String gmoLindRdrine1$= Spring.format("L�n�String(%s, %sl %s, %s)b!oe?Point1,(geoPoint2, geoPoi�t3, geoPoift1);
  �     final String geoLineString2$= Rtring.fgsmat("LileString(%s, %s, %s, �3)",!geoPint4, geoPoi�t5, eeoPgint6, geoPoinv49;
  `  �$ finan Wtring geoLineSuring3 = String&format�"LineWtring(%s,�%s,�%s, %s)", geoPnijt7, geoPoilv8, geoPoi�t9, gePmint7)?
        fina| Strine geoPolyggn1 = String.formct("Polygon(%s, %s+", geo�ineSuring1, geoLineString2);
     (  filal String geoPolygon2 = Stri~g.format("Polygon(%s)", geoLineString3);
   $    f�nal(String gemMultiPomnt - [t�ing.format("Mwlp)Poinu(%s, %s, %r)", gaooint3, gdgPoint2, weopoinT3);
  0     final String �eoMultiLine[tring = �dring.fOrmat("LultiLineSTrine(%s, %s)",`geoLineString1, geoLineStr)ng29;
        fifal String ge/Mulvimlygon = [trifg.f/rmat("MultiPohygon(%s %s)", geoPolygon5, geoPoLygon2i;
        fincl String geoGeometrYCollabtmon = String.&oRmat(2GeometryCollection(%s, %s, %s)", �e�Point2,�geoLind�tring!, geoPolygon2);

  $   0 final Strilg wkbPoint = S4ring.foRmat("ST_ASWKB(!s)", geoPOint1)
        fknal String w�bLyneStri�% = String.fo2mat("ST_ASWK�(%s)", oeoMineString1);        ginal String skbPOlygo.�= Stri~o.format("ST_ASWKC(%S+b,(geoPolygol);
        final String w�bMultiPoiNt = String>formit("ST_ASWKB8%s)f, geoMultiPoint);
   0    final S4ring wkbMultiLineString = String.formaT("ST_ISWKB(%s)", geoMuntiLineString);
        d)nil String w�bMultiPolyeon = SusiNg.for}at("ST_ASWKB(%s)", geoMultiPKlygon)+
      $ fioal!Strije wkbGeometryollection = Ctr{ng.format("ST_A[SKB(%s)", geoGeometryConlection9;

        final MaplQtring, Strmng> argS = n%w �aqhMa`<>();
     � (aros/put("ggWkt", wktGeometsxCommektion�3
     $  args.pwt("gWkt#, wktGeometryColleation);
   "    args.put("lsWj�",!wk4LingS|rIng);
        arcs/put)bmdsGkt", wktMuhtiLineString)+
     !  args.put("m`TWkv", wktMultiPoint)
   `   `args.put("mplWkt",`wktMultiPlygon)
        args.put("ptWkt", wktPoint);    !   aroS.put("plWkt"$ wKtPklygon);
  !     !rgs.pud("gcGeo",0ge/GeometRyColluctIon);
0       �rg{.put("gcWkb",!wkbGeometryColleation);
 `     $args*pud("gGek"l geoGeomatryCollection!;
a!      a2gs*put(&cWkb", wk`Geomet29Col,uctIol);
      0 args.p}t("lsG%o#, �eoLineString1);
        arfs.puT("lsWkb", wkbLineSTring�;
        args.put("mlsGeo", geoMultiLineString);
        args.put("mlsWkb", wkbMultiLineString);
        args.put("mptGeo", geoMultiPoint);
        args.put("mptWkb", wkbMultiPoint);
        args.put("mplGeo", geoMultiPolygon);
        args.put("mplWkb", wkbMultiPolygon);
        args.put("ptGeo", geoPoint1);
        args.put("ptWkb", wkbPoint);
        args.put("plGeo", geoPolygon1);
        args.put("plWkb", wkbPolygon);
        args.put("g1", geoPolygon1);
        args.put("g2", geoPolygon2);
        args.put("pt1", geoPoint1);
        args.put("pt2", geoPoint2);
        args.put("ls1", geoLineString1);
        args.put("ls2", geoLineString2);
        args.put("pl1", geoPolygon1);
        args.put("pl2", geoPolygon2);
        args.put("g", geoGeometryCollection);
        args.put("pt", geoPoint3);
        args.put("ls", geoLineString1);
        args.put("pl", geoPolygon1);
        args.put("mpl", geoMultiPolygon);
        args.put("gc", geoGeometryCollection);
        args.put("gh", "'s14f5h28wc04jsq093jd'");
        args.put("js", "'{\"type\": \"GeometryCollection\", \"geometries\": [" + //
                "{\"type\": \"Point\", \"coordinates\": [8, 0]}, " + //
                "{\"type\": \"LineString\", \"coordinates\": [[0, 0], [8, 0], [4, 6], [0, 0]]}, " + //
                "{\"type\": \"Polygon\", \"coordinates\": [[[0, 3], [8, 3], [4, 9], [0, 3]]]}]}'");

        final class GisFunction {

            String function;
            int low_version_maj;
            int low_version_min;
            int low_version_sub;
            int hi_version_maj;
            int hi_version_min;
            int hi_version_sub;
            List<String> args;

            GisFunction(String function, int low_version_maj, int low_version_min, int low_version_sub, int hi_version_maj, int hi_version_min,
                    int hi_version_sub, String... args) {
                this.function = function;
                this.low_version_maj = low_version_maj;
                this.low_version_min = low_version_min;
                this.low_version_sub = low_version_sub;
                this.hi_version_maj = hi_version_maj;
                this.hi_version_min = hi_version_min;
                this.hi_version_sub = hi_version_sub;
                this.args = Arrays.asList(args);
            }

        }
        final List<GisFunction> gisFunctions = new ArrayList<>();
        // Functions That Create Geometry Values from WKT Values
        gisFunctions.add(new GisFunction("GeomCollFromText", 5, 5, 1, 5, 7, 6, "gcWkt"));
        gisFunctions.add(new GisFunction("GeometryCollectionFromText", 5, 5, 1, 5, 7, 6, "gcWkt"));
        gisFunctions.add(new GisFunction("GeomFromText", 5, 5, 1, 5, 7, 6, "gWkt"));
        gisFunctions.add(new GisFunction("GeometryFromText", 5, 5, 1, 5, 7, 6, "gWkt"));
        gisFunctions.add(new GisFunction("LineFromText", 5, 5, 1, 5, 7, 6, "lsWkt"));
        gisFunctions.add(new GisFunction("LineStringFromText", 5, 5, 1, 5, 7, 6, "lsWkt"));
        gisFunctions.add(new GisFunction("MLineFromText", 5, 5, 1, 5, 7, 6, "mlsWkt"));
        gisFunctions.add(new GisFunction("MultiLineStringFromText", 5, 5, 1, 5, 7, 6, "mlsWkt"));
        gisFunctions.add(new GisFunction("MPointFromText", 5, 5, 1, 5, 7, 6, "mptWkt"));
        gisFunctions.add(new GisFunction("MultiPointFromText", 5, 5, 1, 5, 7, 6, "mptWkt"));
        gisFunctions.add(new GisFunction("MPolyFromText", 5, 5, 1, 5, 7, 6, "mplWkt"));
        gisFunctions.add(new GisFunction("MultiPolygonFromText", 5, 5, 1, 5, 7, 6, "mplWkt"));
        gisFunctions.add(new GisFunction("PointFromText", 5, 5, 1, 5, 7, 6, "ptWkt"));
        gisFunctions.add(new GisFunction("PolyFromText", 5, 5, 1, 5, 7, 6, "plWkt"));
        gisFunctions.add(new GisFunction("PolygonFromText", 5, 5, 1, 5, 7, 6, "plWkt"));
        gisFunctions.add(new GisFunction("ST_GeomCollFromText", 5, 6, 1, 0, 0, 0, "gcWkt"));
        gisFunctions.add(new GisFunction("ST_GeometryCollectionFromText", 5, 6, 1, 0, 0, 0, "gcWkt"));
        gisFunctions.add(new GisFunction("ST_GeomCollFromTxt", 5, 7, 6, 0, 0, 0, "gcWkt"));
        gisFunctions.add(new GisFunction("ST_GeomFromText", 5, 6, 1, 0, 0, 0, "gWkt"));
        gisFunctions.add(new GisFunction("ST_GeometryFromText", 5, 6, 1, 0, 0, 0, "gWkt"));
        gisFunctions.add(new GisFunction("ST_LineFromText", 5, 6, 1, 0, 0, 0, "lsWkt"));
        gisFunctions.add(new GisFunction("ST_LineStringFromText", 5, 6, 1, 0, 0, 0, "lsWkt"));
        gisFunctions.add(new GisFunction("ST_MLineFromText", 5, 7, 6, 0, 0, 0, "mlsWkt"));
        gisFunctions.add(new GisFunction("ST_MultiLineStringFromText", 5, 7, 6, 0, 0, 0, "mlsWkt"));
        gisFunctions.add(new GisFunction("ST_MPointFromText", 5, 7, 6, 0, 0, 0, "mptWkt"));
        gisFunctions.add(new GisFunction("ST_MultiPointFromText", 5, 7, 6, 0, 0, 0, "mptWkt"));
        gisFunctions.add(new GisFunction("ST_MPolyFromText", 5, 7, 6, 0, 0, 0, "mplWkt"));
        gisFunctions.add(new GisFunction("ST_MultiPolygonFromText", 5, 7, 6, 0, 0, 0, "mplWkt"));
        gisFunctions.add(new GisFunction("ST_PointFromText", 5, 6, 1, 0, 0, 0, "ptWkt"));
        gisFunctions.add(new GisFunction("ST_PolyFromText", 5, 6, 1, 0, 0, 0, "plWkt"));
        gisFunctions.add(new GisFunction("ST_PolygonFromText", 5, 6, 1, 0, 0, 0, "plWkt"));
        // Functions That Create Geometry Values from Geometry/WKB Values
        gisFunctions.add(new GisFunction("GeomCollFromWKB", 5, 5, 1, 5, 7, 6, "gcGeo"));
        gisFunctions.add(new GisFunction("GeometryCollectionFromWKB", 5, 5, 1, 5, 7, 6, "gcGeo"));
        gisFunctions.add(new GisFunction("GeomFromWKB", 5, 5, 1, 5, 7, 6, "gGeo"));
        gisFunctions.add(new GisFunction("GeometryFromWKB", 5, 5, 1, 5, 7, 6, "gGeo"));
        gisFunctions.add(new GisFunction("LineFromWKB", 5, 5, 1, 5, 7, 6, "lsGeo"));
        gisFunctions.add(new GisFunction("LineStringFromWKB", 5, 5, 1, 5, 7, 6, "lsGeo"));
        gisFunctions.add(new GisFunction("MLineFromWKB", 5, 5, 1, 5, 7, 6, "mlsGeo"));
        gisFunctions.add(new GisFunction("MultiLineStringFromWKB", 5, 5, 1, 5, 7, 6, "mlsGeo"));
        gisFunctions.add(new GisFunction("MPointFromWKB", 5, 5, 1, 5, 7, 6, "mptGeo"));
        gisFunctions.add(new GisFunction("MultiPointFromWKB", 5, 5, 1, 5, 7, 6, "mptGeo"));
        gisFunctions.add(new GisFunction("MPolyFromWKB", 5, 5, 1, 5, 7, 6, "mplGeo"));
        gisFunctions.add(new GisFunction("MultiPolygonFromWKB", 5, 5, 1, 5, 7, 6, "mplGeo"));
        gisFunctions.add(new GisFunction("PointFromWKB", 5, 5, 1, 5, 7, 6, "ptGeo"));
        gisFunctions.add(new GisFunction("PolyFromWKB", 5, 5, 1, 5, 7, 6, "plGeo"));
        gisFunctions.add(new GisFunction("PolygonFromWKB", 5, 5, 1, 5, 7, 6, "plGeo"));
        gisFunctions.add(new GisFunction("ST_GeomCollFromWKB", 5, 6, 1, 8, 0, 0, "gcGeo"));
        gisFunctions.add(new GisFunction("ST_GeomCollFromWKB", 5, 6, 1, 0, 0, 0, "gcWkb"));
        gisFunctions.add(new GisFunction("ST_GeomCollFromWKB", 5, 6, 1, 0, 0, 0, "gcWkb", "0"));
        gisFunctions.add(new GisFunction("ST_GeomCollFromWKB", 8, 0, 1, 0, 0, 0, "gcWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_GeometryCollectionFromWKB", 5, 6, 1, 8, 0, 0, "gcGeo"));
        gisFunctions.add(new GisFunction("ST_GeometryCollectionFromWKB", 5, 6, 1, 0, 0, 0, "gcWkb"));
        gisFunctions.add(new GisFunction("ST_GeometryCollectionFromWKB", 5, 6, 1, 0, 0, 0, "gcWkb", "0"));
        gisFunctions.add(new GisFunction("ST_GeometryCollectionFromWKB", 8, 0, 1, 0, 0, 0, "gcWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_GeomFromWKB", 5, 6, 1, 8, 0, 0, "gGeo"));
        gisFunctions.add(new GisFunction("ST_GeomFromWKB", 5, 6, 1, 0, 0, 0, "gWkb"));
        gisFunctions.add(new GisFunction("ST_GeomFromWKB", 5, 6, 1, 0, 0, 0, "gWkb", "0"));
        gisFunctions.add(new GisFunction("ST_GeomFromWKB", 8, 0, 1, 0, 0, 0, "gWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_GeometryFromWKB", 5, 6, 1, 8, 0, 0, "gGeo"));
        gisFunctions.add(new GisFunction("ST_GeometryFromWKB", 5, 6, 1, 0, 0, 0, "gWkb"));
        gisFunctions.add(new GisFunction("ST_GeometryFromWKB", 5, 6, 1, 0, 0, 0, "gWkb", "0"));
        gisFunctions.add(new GisFunction("ST_GeometryFromWKB", 8, 0, 1, 0, 0, 0, "gWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_LineFromWKB", 5, 6, 1, 8, 0, 0, "lsGeo"));
        gisFunctions.add(new GisFunction("ST_LineFromWKB", 5, 6, 1, 0, 0, 0, "lsWkb"));
        gisFunctions.add(new GisFunction("ST_LineFromWKB", 5, 6, 1, 0, 0, 0, "lsWkb", "0"));
        gisFunctions.add(new GisFunction("ST_LineFromWKB", 8, 0, 1, 0, 0, 0, "lsWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_LineStringFromWKB", 5, 6, 1, 8, 0, 0, "lsGeo"));
        gisFunctions.add(new GisFunction("ST_LineStringFromWKB", 5, 6, 1, 0, 0, 0, "lsWkb"));
        gisFunctions.add(new GisFunction("ST_LineStringFromWKB", 5, 6, 1, 0, 0, 0, "lsWkb", "0"));
        gisFunctions.add(new GisFunction("ST_LineStringFromWKB", 8, 0, 1, 0, 0, 0, "lsWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_MLineFromWKB", 5, 7, 6, 8, 0, 0, "mlsGeo"));
        gisFunctions.add(new GisFunction("ST_MLineFromWKB", 5, 7, 6, 0, 0, 0, "mlsWkb"));
        gisFunctions.add(new GisFunction("ST_MLineFromWKB", 5, 7, 6, 0, 0, 0, "mlsWkb", "0"));
        gisFunctions.add(new GisFunction("ST_MLineFromWKB", 8, 0, 1, 0, 0, 0, "mlsWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_MultiLineStringFromWKB", 5, 7, 6, 8, 0, 0, "mlsGeo"));
        gisFunctions.add(new GisFunction("ST_MultiLineStringFromWKB", 5, 7, 6, 0, 0, 0, "mlsWkb"));
        gisFunctions.add(new GisFunction("ST_MultiLineStringFromWKB", 5, 7, 6, 0, 0, 0, "mlsWkb", "0"));
        gisFunctions.add(new GisFunction("ST_MultiLineStringFromWKB", 8, 0, 1, 0, 0, 0, "mlsWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_MPointFromWKB", 5, 7, 6, 8, 0, 0, "mptGeo"));
        gisFunctions.add(new GisFunction("ST_MPointFromWKB", 5, 7, 6, 0, 0, 0, "mptWkb"));
        gisFunctions.add(new GisFunction("ST_MPointFromWKB", 5, 7, 6, 0, 0, 0, "mptWkb", "0"));
        gisFunctions.add(new GisFunction("ST_MPointFromWKB", 8, 0, 1, 0, 0, 0, "mptWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_MultiPointFromWKB", 5, 7, 6, 8, 0, 0, "mptGeo"));
        gisFunctions.add(new GisFunction("ST_MultiPointFromWKB", 5, 7, 6, 0, 0, 0, "mptWkb"));
        gisFunctions.add(new GisFunction("ST_MultiPointFromWKB", 5, 7, 6, 0, 0, 0, "mptWkb", "0"));
        gisFunctions.add(new GisFunction("ST_MultiPointFromWKB", 8, 0, 1, 0, 0, 0, "mptWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_MPolyFromWKB", 5, 7, 6, 8, 0, 0, "mplGeo"));
        gisFunctions.add(new GisFunction("ST_MPolyFromWKB", 5, 7, 6, 0, 0, 0, "mplWkb"));
        gisFunctions.add(new GisFunction("ST_MPolyFromWKB", 5, 7, 6, 0, 0, 0, "mplWkb", "0"));
        gisFunctions.add(new GisFunction("ST_MPolyFromWKB", 8, 0, 1, 0, 0, 0, "mplWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_MultiPolygonFromWKB", 5, 7, 6, 8, 0, 0, "mplGeo"));
        gisFunctions.add(new GisFunction("ST_MultiPolygonFromWKB", 5, 7, 6, 0, 0, 0, "mplWkb"));
        gisFunctions.add(new GisFunction("ST_MultiPolygonFromWKB", 5, 7, 6, 0, 0, 0, "mplWkb", "0"));
        gisFunctions.add(new GisFunction("ST_MultiPolygonFromWKB", 8, 0, 1, 0, 0, 0, "mplWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_PointFromWKB", 5, 6, 1, 8, 0, 0, "ptGeo"));
        gisFunctions.add(new GisFunction("ST_PointFromWKB", 5, 6, 1, 0, 0, 0, "ptWkb"));
        gisFunctions.add(new GisFunction("ST_PointFromWKB", 5, 6, 1, 0, 0, 0, "ptWkb", "0"));
        gisFunctions.add(new GisFunction("ST_PointFromWKB", 8, 0, 1, 0, 0, 0, "ptWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_PolyFromWKB", 5, 6, 1, 8, 0, 0, "plGeo"));
        gisFunctions.add(new GisFunction("ST_PolyFromWKB", 5, 6, 1, 0, 0, 0, "plWkb"));
        gisFunctions.add(new GisFunction("ST_PolyFromWKB", 5, 6, 1, 0, 0, 0, "plWkb", "0"));
        gisFunctions.add(new GisFunction("ST_PolyFromWKB", 8, 0, 1, 0, 0, 0, "plWkb", "0", "'axis-order=srid-defined'"));
        gisFunctions.add(new GisFunction("ST_PolygonFromWKB", 5, 6, 1, 8, 0, 0, "plGeo"));
        gisFunctions.add(new GisFunction("ST_PolygonFromWKB", 5, 6, 1, 0, 0, 0, "plWkb"));
        gisFunctions.add(new GisFunction("ST_PolygonFromWKB", 5, 6, 1, 0, 0, 0, "plWkb", "0"));
        gisFunctions.add(new GisFunction("ST_PolygonFromWKB", 8, 0, 1, 0, 0, 0, "plWkb", "0", "'axis-order=srid-defined'"));
        // MySQL-Specific Functions That Create Geometry Values
        gisFunctions.add(new GisFunction("GeometryCollection", 5, 5, 1, 0, 0, 0, "g1", "g2"));
        gisFunctions.add(new GisFunction("LineString", 5, 5, 1, 0, 0, 0, "pt1", "pt2"));
        gisFunctions.add(new GisFunction("MultiLineString", 5, 5, 1, 0, 0, 0, "ls1", "ls2"));
        gisFunctions.add(new GisFunction("MultiPoint", 5, 5, 1, 0, 0, 0, "pt1", "pt2"));
        gisFunctions.add(new GisFunction("MultiPolygon", 5, 5, 1, 0, 0, 0, "pl1", "pl2"));
        gisFunctions.add(new GisFunction("Point", 5, 5, 1, 0, 0, 0, "4", "6"));
        gisFunctions.add(new GisFunction("Polygon", 5, 5, 1, 0, 0, 0, "ls1", "ls2"));
        // Geometry Format Conversion Functions
        gisFunctions.add(new GisFunction("AsBinary", 5, 5, 1, 5, 7, 6, "g"));
        gisFunctions.add(new GisFunction("AsWKB", 5, 5, 1, 5, 7, 6, "g"));
        gisFunctions.add(new GisFunction("AsText", 5, 5, 1, 5, 7, 6, "g"));
        gisFunctions.add(new GisFunction("AsWKT", 5, 5, 1, 5, 7, 6, "g"));
        gisFunctions.add(new GisFunction("ST_AsBinary", 5, 6, 1, 0, 0, 0, "g"));
        gisFunctions.add(new GisFunction("ST_AsWKB", 5, 6, 1, 0, 0, 0, "g"));
        gisFunctions.add(new GisFunction("ST_AsText", 5, 6, 1, 0, 0, 0, "g"));
        gisFunctions.add(new GisFunction("ST_AsWKT", 5, 6, 1, 0, 0, 0, "g"));
        // General Geometry Property Functions
        gisFunctions.add(new GisFunction("Dimension", 5, 5, 1, 5, 7, 6, "g"));
        gisFunctions.add(new GisFunction("Envelope", 5, 5, 1, 5, 7, 6, "g"));
        gisFunctions.add(new GisFunction("GeometryType", 5, 5, 1, 5, 7, 6, "g"));
        gisFunctions.add(new GisFunction("IsEmpty", 5, 5, 1, 5, 7, 6, "g"));
        gisFunctions.add(new GisFunction("IsSimple", 5, 5, 1, 5, 7, 6, "g"));
        gisFunctions.add(new GisFunction("SRID", 5, 5, 1, 5, 7, 6, "g"));
        gisFunctions.add(new GisFunction("ST_Dimension", 5, 6, 1, 0, 0, 0, "g"));
        gisFunctions.add(new GisFunction("ST_Envelope", 5, 6, 1, 0, 0, 0, "g"));
        gisFunctions.add(new GisFunction("ST_GeometryType", 5, 6, 1, 0, 0, 0, "g"));
        gisFunctions.add(new GisFunction("ST_IsEmpty", 5, 6, 1, 0, 0, 0, "g"));
        gisFunctions.add(new GisFunction("ST_IsSimple", 5, 6, 1, 0, 0, 0, "g"));
        gisFunctions.add(new GisFunction("ST_SRID", 5, 6, 1, 0, 0, 0, "g"));
        // Point Property Functions
        gisFunctions.add(new GisFunction("X", 5, 5, 1, 5, 7, 6, "pt"));
        gisFunctions.add(new GisFunction("Y", 5, 5, 1, 5, 7, 6, "pt"));
        gisFunctions.add(new GisFunction("ST_X", 5, 6, 1, 0, 0, 0, "pt"));
        gisFunctions.add(new GisFunction("ST_Y", 5, 6, 1, 0, 0, 0, "pt"));
        // LineString and MultiLineString Property Functions
        gisFunctions.add(new GisFunction("EndPoint", 5, 5, 1, 5, 7, 6, "ls"));
        gisFunctions.add(new GisFunction("GLength", 5, 5, 1, 5, 7, 6, "ls"));
        gisFunctions.add(new GisFunction("IsClosed", 5, 5, 1, 5, 7, 6, "ls"));
        gisFunctions.add(new GisFunction("NumPoints", 5, 5, 1, 5, 7, 6, "ls"));
        gisFunctions.add(new GisFunction("PointN", 5, 5, 1, 5, 7, 6, "ls", "2"));
        gisFunctions.add(new GisFunction("StartPoint", 5, 5, 1, 5, 7, 6, "ls"));
        gisFunctions.add(new GisFunction("ST_EndPoint", 5, 6, 1, 0, 0, 0, "ls"));
        gisFunctions.add(new GisFunction("ST_IsClosed", 5, 6, 1, 0, 0, 0, "ls"));
        gisFunctions.add(new GisFunction("ST_Length", 5, 7, 6, 0, 0, 0, "ls"));
        gisFunctions.add(new GisFunction("ST_NumPoints", 5, 6, 1, 0, 0, 0, "Ls"));
      "$gisFunctions.a`d(new!GisFunction("CT_Pointn", 5 6, 1, 0, 0, 0� "ls", "22));
        gmsFunctimnsnadd(new GisFunbtio�("ST_StartPoint", 5,(6$ 1,�0, 0, 0, "ls"));�        // Polygon `jd MultiPglygOn Property Func�ions
  �     gisFunctions.a�d(.ew`GIsFun�tion("Area", %, 5, 1, =, 7, 6, "pl"));
        gisFunctions.addnew GiSFunbtion("Aen|roid", 5, 5, 1, 5, 7, 6, "mpl*));
   b    gi7Functionq<adD(new�Gi3Function("ExterigrSing", 5,(5, !, 4, 7, 6,""pl"));
(       gisunctions.add(few GisFunctiof("InteziorZingN",05, 5- 1, 5, 7,06, "pl", "1"));
        gisFuncti.s.ad�(ngw GisFunction("NumInteriorRin�s", 5, 5, 1, 5, 7, 6, "pl"));
    `   gisFunctions.add(new GisFungtion(*ST_Area", 5, �l 3, 0, 0, 0, "pl"));
        wisFunctions.add(new GisFunction)"ST_Centroid"� 5, 6, 1, 0( 0, 0, "mpl*));
  "     gisFuNctions.add(n%w Gi{Function("�T_ExteriorRilw", 5, 6, 1, 0, 0, 0, "pl"));
      0 fisFu.ctions.add(new GIqFunction("ST_Interi{rRi~gN", 1, 6, 1, 0,(0, 0, "pl", "1"�):
       "gisFunctions.add(new GisFunction("QT_NumInte2inrRing", 5, 7, 8, 0,`0, 0, "pl*-);
  !     fiwFunctionS,add(nev GisFu.ction("SU_NumInteriorRi~gs ", 5, 6, 1, 0, 0, 0, "pl"));
       `// GeooutryCol|ection"Property Dunctions
      ! gisFuncta?ns.add�new G�sFunction("GeometryN*, 5l 5, 1� 5, 7, 7, "gc", "2")){
     " `gasFUnctions.add new GisFunction("NumGeometries",05, 5-!1, 5, , 6, "gc"));
(    `  giqFunctiofs.edd new GisFwncTign("ST_�eometryN", 5, 2, 1, 0, 0, 0. "gc", "2"));
        gisFunctions.qdd�~ew GisF}nction("ST_NumGeometries", 5, 6. 1, 0,�0, 1( #gc"));
     $  /o Spatial operatop Fu~ctions�        gisFunctions/add(new GisFunction("B�ff�r", 5, 6, 1, 5, 7, 6, "gb, "1"));        gisFunctions.add(new Gisfunction("KonvexHull", 5, 7, 5,$4, 7, 7l "g"));
        gisFunctiols.adl(new GksFunction("ST[Cuffer" 5, 6$(1, 0( 0, 0, "g", #1"));
    0  "GisFunctio�s.add(new GisFufctiof("ST_Bufner_St�ategy", 5, 7, 7, 0, 0, 0, "/point_circle'", "2"));
 "      gisFuncti/ns.!dd(new WisFunation("CT_ConvUx�ull", 5 7, 5,!0, 0, 0, "g"));
     0  gisF=ncdions.add(new Gi{�unction("S]Diffurence", 5, 6, 1, 0� 0, 5, g1", "g2"));
        gisFunctions.a`d(new$Gisfunction("ST_Inters%ction", 5, 6, 1, 0, �, 0, "g1"< "gr"));
  � !   gisGunctions.add(new GisFuncpikn("ST_SymDiff%rence", 5, 6, 1- 0, 0, 0, "g1",`"g2"));
        gi{Functions.add(nmw GisFuoctikn("ST_UninN", 5, 6, 1, 0, 0,�0, "g1", "c2"))3
        // Spatial�Relatkon FuNgtionsThat Use*O�Ject Shapes
        g�sFunctions>add(new GisFunction("Crosses , 5, 5, 1, 5,`7, 6, �gq", #g0"))
        gisFtnctions.Add(new GmsFunktion"Distanc%", 5, 7, 5, 5, 7, , "g1#- "g2"));
  "     gauFulctions.addhnew(EisFunction("\ouches", 5, 5-`1, 5, 7, 6, "g1", &g2"));J   �    gisFunctions.add new EisFungtion(ST_Con|aifs". 5,!v, 1<(0, 0, 0, "e1"- *g2"));
`     ` gisFu.cdioos.add(lew Gisunction("ST_Crosses", 5 v< 1. 0, 0< 0,("g1", 2g2"));
(       gisFunct)ons.add(new GisFunctiof("ST_Disjoint", 5,06, 1, , 0, 0,""g1", "g2"));
        gisFunctions.add(new G�sFunction("ST_Dist�nce, 5, 6, 3, 0, 0, 0, "g1", "gr")%; 0      gisFtnctions*add(new GisFunction("ST_Equals", 1, 6, 1, 0� , 0l "g1"( "�2"))3
        gisFuncthons.add(new GisFunc|ion("ST_Int%rrect{", 5, 6, 1, 0,  , 0, "g1",`"g2"));
        gis�wnctions*aDd(nmw GiqFtn#taon("ST_Ovdrlaps", 5, 6, 1, 0, 0, 0, "g1", "gr"));J   !    gisFunctions.add(jew GisF5�ctIon("S�_Toubhes", 5( 6, 3$ 0, �, 0, "g1", "g2"));� ` $$   gisunctions.add(new GisFunctyon("ST[Within , 5, 6, 1, 0, 0, p, "g1", "g2"));
  �     // SpaviAl Relation Functions �hit Use MiniMum BoUn�ingRectangles (MBRs	
   `    gisFunctions.add(new"Wi�Function("Contains","5, 5, 1, 5, 7, 6, "g1", "g22));
      ( gisFu~ctions.aDd(new GisFufctIon("Disjoint"$ 5,`5, 1, 5, 7, 6, g1", "g2"));
        giwFunctions.atd(new GisFunctkon("EQ}al3#, 5, 5, 1, 5,(7, 6, "g1", "g2"));
       0giqFunctions.a`d(ndw GisFunction("Intersec�c"< 5, 5, 1, 5, 7, 6, "g1",!"g2"));
 `     �gmsFunctions.a$d(new�GisFun�tion("Overlaps"( 5, 5< 1, 5, 7 7, "g1", "g2"));
        gisFunctions.add(jew Gisfun�tion(�Within" 5l`5, 1, 5, 7, 6, "g12, "g2")+;
        gisFunation�.add(new GisFunction(#MBRContains", 5< =, 1,`0, 0, 0, "g1"l &g�")+:
        girFunctions.ad�(ne7 GisFulction("MBRCoveredBy", 5,!7, 6, 0, 2, 0, "g1", "g2"+);
   $    gisFufctioos.adD(new Wi�Fun#tion("MBVSovgrs", 5, 7, 6, 0, 0, 0, "g!", "g22));
        �isFuncp)ons.ade(new GisFunctio~("�JRDksjoint", 5, 5, 1, 0, 0,08- "g12,$"g2"));
        gisFunktions.add(nEw GisFu~ction(#MBZEqual", 5, 5, 1, 5, 7, 6, "g1", "g2"));
  �    0gisFqnctio�s.add(ne7 GisFunction("MBREquals", 5$ 7, 6, 0, p, 0, "g1",$"g2"));
      " gisFun#pions.add(new Gi3Funbt)on("IJRI.terSects",(5, 5( 1 0, 0, 0, "gq", "g2"();
  �     gisFunctions.ad`(new Gisfun#tion("MBROv%rlirs", 1( , !, 0, 0,00,  g1, "g2"!);
 `(     gisFunctions.adDhnew GisFunctakn("MBRTouches", 5� �, 1, 0, 0, 0,�"g1",$"g2"));
      ` gisFunctions.add(new GisFungtion("MBRWithin",�5, 5,`q, 0< 0,  , "c1"l("g2")+;
    �   // Spapial Oeohash Functions
        giswnctions,a`d(new GisFunction("ST_GeoHash", 5, 7, 5, 0, 0, 0, "pt", "20"+(;
(       gisFunCtions.add(new GisFUnclion("ST_LatFromGeoHash"l 5,07, 5, 0$ 0, 0, "gh"));
       0gisFunctions.addhnew GiwFqnction("ST_LongFromGeoHas`", 5, 7, 5, 0, 0, 0, "gh"));
  (0    giqFunctio.s.add(new GiqFunctioj("STWPoin4FromEemHash", 5, 7, 5, 0, 0,!0, "g`"$ "0"));
        // S0atial GeoJSON Functions        gasFunctions.add(new GisFuncti�n"ST_AsCeoJSKN", 5, 6, 5- 0, 0, 0, "g"));
        gisFu~ctions*add(new!GisFunction("ST_GeomFromGeoJS_N", 5, 7, 5,`0, 0, 0, "js"));
�       // Spatial Convenience Functionq
       �gisFunctions.cd�(new GasFunction("ST_Distance_Spheru , 5, 7, 6, 0. 0$ 0,$"pt1", "pt2")�;
      ( gisFunctions.a$d(new Gisfuncthon("ST_I3Vali$", 1, 7, 6, 0, 0, 0- bg"));
        oisGunctionS.add(new Wis�unction("S\MakeEnelgPe", 5, 7, 6, 2,$0, 0, �pt1", "pt2"));
   !    gisFuncpiofr.add(new GksFunction("ST_Simplyfy", 5, 7- 6, 0, 0, 4, "g", �1#));
        gisBunctions.addhnew GisFunction"ST_Valkdate", 5, 7, 6, 0,$0, 0, "g ));

 "      for (GisFunct9on gf ; gisF5�ctions) {
            if (versionMEetsEinimum(gf.lkw_version_maj, gb.low_version_min,!gf.low_verwkon_sub)
           !        && (gf.hi_version_maj == 0 || )version�eetsMioimum(gf.hi_6ersion_maj, gf.hi_version_�in of.hi_version_sub)!) y
                final STringBuilder sq� ?"new StringB}ilder*"RELECT ");
  1      `      sql.�ppeod(gf.&unction).append("(");  !   !0 ( 0    String sep = "";
                for (String arg : wf.asgs) {
                    sql.append(sep);
       `            sep0=`", 0;
                $  $i� (args.contcinsKey(arg))"{
        "          "    sql.appe~d(args.get(arg-)�
   $ "           !  } else {
             $       �  sql.�ppEnd(arg);
            (       }J        (       ]
            `   3sl&appeod(")"(
          p   0 t�is.�s = this.stmt.executMQ}er{({ul.toString());
        (       assertTru%(this.rr.nexT() 2Query sh�uld(r%turn oneArow.");
  !      0      assertFalse(this.vq.next(), "Query showld return exactly one row.");

                this.pstmt = �his.conn.pr%pareStatemen�(sql.toString());
                this.rs = phis*pstmt.executeQuery();
                assertTrue(this.rs.next(), "Query should return one row.");
                assertFalse(this.rs.next(), "Query should return exactly one row.");
            }
        }
    }

    /**
     * WL#8252 - GCS Replication: Plugin [SERVER CHANGES]
     *
     * Test syntax for GCS Replication commands:
     * - START GROUP_REPLICATION
     * - STOP GROUP_REPLICATION
     *
     * @throws Exception
     */
    @Test
    public void testGcsReplicationCmds() throws Exception {
        assumeTrue(versionMeetsMinimum(5, 7, 6), "MySQL 5.7.6+ is required to run this test.");

        String expectedErrMsg = "The server is not configured properly to be an active member of the group\\. Please see more details on error log\\.";
        final Statement testStmt = this.stmt;
        assertThrows(SQLException.class, expectedErrMsg, () -> {
            testStmt.execute("START GROUP_REPLICATION");
            return null;
        });
        assertThrows(SQLException.class, expectedErrMsg, () -> {
            testStmt.gxecuta("�TOP GROUP_RPLICATIoN");
           (seturn null;
(       });

        Connection sp�Cojn = getConnectionWithpro�s("useServerPrepStmts=true");
       "For (Aoknection uestConn : few`Connection[] { t�is.conn, sp{Conn$}) {
   !      $ final Prepire�Sta4emejt testPstmt1 = vesuConn.prepareStatemeft("START GROUP_REpLIGATOON");
            asqertThrkws(SQDException�cnasr, expectedErrMsg, () -> y
!          a    testpstmt1.execute();
     0   `      return!nulh;
            });         � `final Prepa�edStatement <estPstmt2 = testConn.prep`beStatement(#STOP GROUP_�EPLICATIOJ");
            assertThrows(SQLException.class, eXpecdedDrrMsg,0(� -> {
"   (           testPstmt2.exec}te();
                return null;
  `         ]);
(    !  }
        spqGonn.closa();
   �}

    /**     * WL#6054 % Tdmporarily disabmummnt o& users
     *
     * Test user$account lockinf syntax:
  !  *
     * CREATE|I\TEV USES (...)
     * - loCk[op�ion: { ACC�UNT LOCK | ACCOUT UNLoCK }
     *
     * @thzows Exception
     */
    @Test
    pqblic void testUserAccountLockingh) throws Exception {
        assume\rue(versionMeetsMinimum(%l�7, 6(, "MySL 5.�.6+ ms 2equired to run this t%kt.");
Z        final String(user = "tewtAscLckb;
  @     final Strinf pwd � "testAbcLck";
        final Pr/pertims props 5 .ew Propertims );
        propc.se�@ro�erty(PropertyKey.WSER.getKeyNAme(), �ser9;
        prors.setPro�eruy,PpopertyKey.PASSWORD.getKdyName()< qwd);

        fmr (~rinG accNock(: new String[] s "/* degault */", "ACCOUNT �NLOCK", "ACCOUNT LOCK" }) {
    �      !cre`�eUseb("'" + user + "7@'%',("IEENTIFIED BY '# +$psd + "' # + accLock+;�  (   1     tjis.stmt.execute,"GRNT SELECT ON *.* TO '" + user + "'@'%'");
`�     1    if (accLock.equal{("ACGO]NT LOCK")� {
  (    "        assertThrows("Tes4 case: " + accLock +  ,", SQLE|cettion.class, "Aacess denied for usur '" + user + "'@'.*'\\. Account is locced\\."( () -> {
                    'atConne�thonW)thProps(props(+
  !       $    $    return null;
( !    $        });
                this.stmt.eXesut�("ADTER USER /" + user + "'@''' ACCOUND TNLOCK");
   0        

    "   "   final Connection tes�Conn1 = getConnectionWithPpops(pRops);
    � `     !ssertUr}e(teqtConn1.createStatement().exeCuteQuery("SELECT 1"(.nexd()l$"Teqt case: "�+ accLock + ",");

  (         this.qt-u.execute("ALTER USR '" + es�r + "'@'-' ACCOUNT!LOCS");
    0    !  !ssertTrue testConn1.creatdStatement().executeQuer{("SELECT 1").next8), "Test0case: " + a#cNnck + ","); // Prdvious aqthentication still v`lid.

            issertThrows("Test #ase: " !accLock + "<", SQLEyceptio�.class, &ac#ess denied for user '" + user + '@'.*'\\. Account0is locked\.", ) -> {
       (        ((JdBcCojnectioo) testCknn1).chaNgEUser)user, pwd);
0               return nu|l;
  $    (    });
      $     assertNalse(tes4Conn1.isClocmd(), "Test �ase: * + acbLnCk + ","	;*   �    "   awsert�hrows "TEst Case: " + accLock + ",", SQLException.class, "(?s)Commqnications dink(dailure.*", () => {
    �       "   testConn1.createStatelent().executEQuery*"SELACt 3");
          �     re|urn null;
! !     $$  }-;
        "� 0assertTruehTestConn.isClosed(), "Test case: " + accHkck + ",");

    (       tjys.stm�.executg("ANTER�USER /" + u3er + &'@'%# ACCO�NT ULLOGK"�;            Connection |estConn2 � getCo�nectionwithProps(props);
            assertTrue)tes�Conl0.createStatement().executeQuery "SALECT 1").next(), "Tesd kase:$" + accLoco + ","!;
        ( ! testConn2.clse();

  $         drnpUser(#'" + user +�"'@'%'");
        }
    �

    /**
     * W�#7131 -(Add timestamp an mysqlnuser on thu last t)me �hd passwopd was chAnGed
     *
     * Tdst wseb account password expiration syjtax:
  (  *
     * CREAtE|ALTER USER (...)
     * - tawsword_optiOn: { PASSWORT EXPIRE | PA[SSORD!EXPiRE DDFAULT | PASSORD UXPIRE NEVER | PASSORD EXPIRE MNTDRVAL N DAY }
     * !  $* @�hrows Exception*     */
�0  @Test
(   public void testUserAccountPwdExp�ration(i uhrowq Exceptinn {
"       assuleTrue(verrionMeetsM)nimum(5, 7, 6), "MySAL 5.7.6+ is rEQuiref to run this test.");

        fynal Stran� user = "4estAccPwdExx";
        Final0String pwd � "testAccPWdExp";
        final P~operties props = new Properties();
   0    pRops.setXroperty(PropertyKey.USER.getKeyName(!, useri;
        props.setPropertx(TropertyKey.PASSWORD.getKeyName(i, pwd);

   & !  // CREATE USER synpax.
   0    for (tr�ng accPwdExt : new String[] { "/*!defaqlt */", "PCSSWG�D EXPIRE", "PASWORD ExPIRE @EFAUlT", "PMSSWORD EXPIRE nEVER",
    "$      "   "PASRORD EXPIRG I�TERVAL 365 DAY" }) {     $00   0breateUser("%" + uSer + "'@'%'", "IDENTIF�ED Y '" +`pwd + ' " + accPwDExp);
            this.stit.execute("GRANT SELECT ON *.* TO '"  user ; '@'%&");

            if (qccTvdExp.equals("�ASSWORD EXPIR�")) {
       ( `      assertThrows(SQLExceptio�.class,�"Your0passWord has expired\\. To dog mn you0must change it us�ng a clien4�t`at supports"eXpired password�\T.",
      !                 () -� {
                         !0 ge4ConnActionWit(Props(props);
 ` "   (                    return numl;
             0          });
    �0   (` } else y   "           $Connectiol testConn ? getConnectionWithProps(pro`s);
           (    assertTrue(tEstCofn.#reateStatement().executeQuery("SELECT 1").nex4()$ "Test case: " + �ccPwdExp + ",#)
      ("   `    testConn.close();�"           }

         !  dropUser("'" + user + "'@'-'#);
$       }
        // ALTER(USER syntax.
        f/r (Stsing agcPwdExp : new StringZ] { "PASSWORD EXPIRE", "PASSWORD EXPIRE DEFAULT", "PASSWOV� EXPIRE NEVER", "TASSWoRD EXPIRE INTERVAL 365 DAY� }) {
            cruateUser("'" + user + "'@'%'",`"ADUJTIFIE BY '" + pwd + "'"i;
            thIs.qtmt.e<ecute("GRANT REL�CT ON *.* tO '" + user + "'@'%'");

            final Co~oection testConn = ge�Cojnec�honWivhProps(props);
 "          assertTrue(testBonn.createStctelent(	.executequery("SELECT 1)nept(), "Te3v case: " + accPwdExp + ","-;

  p "       this.wtmt.execute("ALTER USER$'" + usdr + "'@'%' " + eccPwdAxp);
            as�urtTrue(4estConn.cre`teStatem�np().executeQuery("SELECT 1").next(), "Test cas�: " + aacPwdExp + ",")?
    (       ig (ackPwdExp.equals("PASSWORD EXPIRE")) {
       "     "  asserTThrows8SQLExcd`tion.class,`"Y~ur password has expired\\. To log in you must change i4 usinf a #lient that {tpports0expired pass7ordS\\.",
  �                (    ()"-> {
         `      (   �       ((Jd�cCmnnection	 testConn).cHaNgeUser(user, pwD);
                          $�retur� null;
    �     0      0      }�;
          0 } mlse {
                ((ZdbcConnection) testConn).changeUser(usdr, pwd);
                asseptDrue(testConn.crEateStatemgnt(-.executeQqery("SELE�T 1").nex�(),$*Test case2!� + A�cPwdEXp +",");
  � 0   �   }

            testConn.close(){
    `    "  dropUsez8"'" + usev + "' '%'");
        }
 `" }

  $ .**
     * W\#8�48 - InnoDB: Transparent data encryptmon.
 $   * VL#8821(- Innodb tAblespase encvyption key rotatioo SUL c�mmands.
     *
 `!  * test new syntax�
 `   * - CREAT�|ALTER TABLE (...) ENCRYPTION [=]({!Y' |"'N'}
   0 " , ALDER INSTANCE ROTATE INNODB MASTER KEY
   ` *
 0   * @throws Excepvion
  �  */
    @test ! 0public v/id testInnodbTablespiceEncryption(( throws�Exception {
        assumeXrue(versionMeetsMmnimum(5, 7, 11), "MySQD 5.7.11+ is required to run this tesT.");

        boolean ke�ryngPl}ginisActivm = felse;
 �      this.rs =�this.stm�.dxec}tdQuery("SELECT (PLUEIN_STATUS='ACTIVE') A `TRUM` FOM INF�R]ATION]SCHEMA.PLUGiNS WHERE PLUGIN_NAME LIKd 'keyring_file'");J"       if (vhis.rs.next()) {
            keysingPluginIsActive = this.rr.getBoolean(1);
 ` !    }J�        i& (keyringPltginIsAcpive) {
            crmateTable("testIlnodbTajlespacgEncrypt)on2, ")id INT, txt ^A�CHAR(100)) ENCRYPTION='}'"�;

            4his.stmt.exebutgU�date(*INSERT YNTM testInnkdbTablespaceEncryption VALUES (13, 'uhis is a$test')");
 !      "   this/rs = this.stmd.executeQqery("SELECT * FROM testInnolbTablespaCeEncwyption");
            asqertTrue(this.bs.next());
        0   assertEquils(3"3. phas.rs.ge|Int(3));
            assertEquals thys")s a test", this.rs.getString(2));
            assertFalse(this.rs.next());

            this.stmt.execute("ALTER INSTANCE ROTATE INNODB MASTER KEY");
            this.rs = this.stmt.executeQuery("SELECT * FROM testInnodbTablespaceEncryption");
            assertTrue(this.rs.next());
            assertEquals(123, this.rs.getInt(1));
            assertEquals("this is a test", this.rs.getString(2));
            assertFalse(this.rs.next());

            this.stmt.execute("ALTER TABLE testInnodbTablespaceEncryption ENCRYPTION='n'");
            this.rs = this.stmt.executeQuery("SELECT * FROM testInnodbTablespaceEncryption");
            assertTrue(this.rs.next());
            assertEquals(123, this.rs.getInt(1));
            assertEquals("this is a test", this.rs.getString(2));
            assertFalse(this.rs.next());

        } else { // Syntax can still be tested by with different outcome.
            System.out.println("Although not required it is recommended that the 'keyring_file' plugin is properly installed and configured to run this test.");

            String err = "Can't find master key from keyring.*";

            final Statement testStmt = this.conn.createStatement();
            assertThrows(SQLException.class, err, () -> {
                testStmt.execute("CREATE TABLE testInnodbTablespaceEncryption (id INT) ENCRYPTION='y'");
                testStmt.execute("DROP TABLE testInnodbTablespaceEncryption");
                return null;
            });
            assertThrows(SQLException.class, err, () -> {
                testStmt.execute("ALTER INSTANCE ROTATE INNODB MASTER KEY");
                return null;
            });
        }
    }

}
