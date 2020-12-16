
public class SkillTree {

	public static void main(String[] args) {
		String skill="CBD";
		String[] skill_trees= {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println(solution(skill,skill_trees));

	}
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i=0;i<skill_trees.length;i++){
            boolean check=true;
            int charAt=0;
            for(int j=0;j<skill_trees[i].length();j++){
                for(int k=charAt+1;k<skill.length();k++){
                    if(skill_trees[i].charAt(j)==skill.charAt(k)){
                        check=false;
                        break;
                    }
                    else if(skill_trees[i].charAt(j)==skill.charAt(charAt)){
                        charAt++;
                        break;
                    }
                }
                if(check==false){
                    break;
                }
            }
            if(check){
                answer++;
            }
        }
        return answer;
    }
}
