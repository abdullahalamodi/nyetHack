fun main() {
    var healthPoints = 89;
    val playerName = "Madrigal";
    var isBlessed = true;

    var healthPointsCase =
        if (healthPoints == 100) ("Madrigal is in excellent condition !");
        else if (healthPoints >= 90) ("Madrigal has a few scratches.");
        else if (healthPoints >= 75) {
            if (isBlessed) "has some minor wounds but is healing quite quickly"
            else "has some minor wounds"
        };
        else if (healthPoints >= 15) ("Madrigal looks pretty hurt.");
        else if (healthPoints >= 0) ("Madrigal is in awful condition!");
        else "wrong value !!"

    println(playerName);
    println(healthPointsCase);

}