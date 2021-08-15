<?php
require_once("Account.php");

class Car{
    private $id;
    public $license;
    public $driver;
    public $passegenger;

    public function __construct($license, $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function toPrint(){
        echo "license: $this->license, conductor: {$this->driver->name}, document: {$this->driver->document}";
    }
    public function getId()
    {
        return $this->id; 
    }

    public function setId($id)
    {
        $this->getId();     
    }

    public function getLicense()
    {
        return $this->license; 
    }

    public function setLicense($license)
    {
        $this->getLicense();     
    }

    public function getDriver()
    {
        return $this->driver; 
    }

    public function setDriver($driver)
    {
        $this->getDriver();     
    }

    public function getPassenger()
    {
        return $this->passenger; 
    }

public function setPassenger($passenger) {
        
    if ($passenger == 4) {
        $this->passenger = $passenger;
    }
    else {
        echo "Necesitas asignar 4 pasajeros";
    }

}

}