
require_once('Car.php');
require_once('Account.php');

$car = new Car("AWS-127", new Account("Leandro", "324.453.764"));
$car->toPrint();