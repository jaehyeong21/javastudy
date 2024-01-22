public class NpcMain {
    public static void main(String[] args){
        Npc npc1 = new Npc();
        Npc npc2 = new Npc();

        //caller

        npc1.setSpeak(new NpcSpeakCallback() {
            @Override
            public void speak() {
                System.out.println("유령상인 NPC");
            }
        });

        npc2.setSpeak(new NpcSpeakCallback() {
            @Override
            public void speak() {
                System.out.println("무기상인 NPC");
            }
        });
    }
}
