import java.util.Map;
import java.util.HashMap;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        StringBuilder rnaStrandBuilder = new StringBuilder();
        char[] dnaArray={'G','C','T','A'};
        char[] rnaArray={'C','G','A','U'};
        Map<Character, Character> complement = createComplementMap(rnaArray, dnaArray);
        for(char character:dnaStrand.toCharArray())
        {
            rnaStrandBuilder.append(complement.get(character));
        }
        return rnaStrandBuilder.toString();
    }

    Map createComplementMap(char[] rna, char[] dna)
    {
        Map<Character, Character> complementMap = new HashMap<Character, Character>();
        for(int index=0;index<dna.length;index++)
        {
            complementMap.put(dna[index], rna[index]);
        }
        return complementMap;
    }

}
