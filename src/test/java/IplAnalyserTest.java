import com.IPLanalyser.IPLAnalyser;
import org.junit.Test;

public class IplAnalyserTest {
    String  IPLMOSTWICKET_CSV_PATH ="./src/test/resources/IPL2019FactSheetMostWkts.csv";


    @Test
    public void givenIPLCsvData_ForMostRun_ShouldReturn_Correct_Records() {
        IPLAnalyser iplAnalyser = new IPLAnalyser();
        iplAnalyser.loadIplMostRunsCsvData(IPLMOSTWICKET_CSV_PATH);

    }
}
